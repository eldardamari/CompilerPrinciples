import tag_parser

__author__ = 'Dror Ventura & Eldar Damari'

symbolTable = {'+':'T_PLUS' , '-':'T-MINUS' , '*':'T-MULTI' , '/':'T-DIVIDE'}

def compile_scheme_file(source, target):
    with open(target,'w') as targetFile:
        targetFile.write(startCode())
        with open(source,'r') as sourceFile:
            sourceFileContent = sourceFile.read()
            generatedContent = appendCodeGen(sourceFileContent)

        targetFile.write(initConstantTable())

        targetFile.write(generatedContent)

        targetFile.write(endCode())

def startCode():
    return \
"""#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include "./arch/cisc.h"
int main()
{
    START_MACHINE;
    JUMP(CONTINUE);

    #include "./arch/char.lib"
    #include "./arch/io.lib"
    #include "./arch/math.lib"
    #include "./arch/scheme.lib"
    #include "./arch/string.lib"
    #include "./arch/system.lib"

    #define VOID IMM(1)
    #define NIL IMM(2)
    #define BOOL_FALSE IMM(3)
    #define BOOL_TRUE IMM(5)

    CONTINUE:
        /* make void constant */
        CALL(MAKE_SOB_VOID);

        /* make nil constant */
        CALL(MAKE_SOB_NIL);

        /* make boolean False constant */
        PUSH(IMM(0));
        CALL(MAKE_SOB_BOOL);
        DROP(1);

        /* make boolean True constant */
        PUSH(IMM(1));
        CALL(MAKE_SOB_BOOL);
        DROP(1);
"""

def endCode():
    return """
    STOP_MACHINE;
    return 0;
}
"""

def appendCodeGen(source):
    done = False
    code = "\n"
    if not source:
        raise CompilationError('Input file is empty')
    else:
        s , r = tag_parser.AbstractSchemeExpr.parse(source)
        while not done:
            if r.__eq__(""):
                done = True
                code += "%s" %s.code_gen()
            else:
                code += "%s" %s.code_gen()
                s, r = tag_parser.AbstractSchemeExpr.parse(r)

        return code

def initConstantTable():
    sortedDic = tag_parser.sortedConstantList()
    print(sortedDic)
    code = tag_parser.appendTabs() + "/* make constant table*/\n"
    for node in sortedDic:
        sobType = node[1][1][0]
        if sobType is 'T_INT':
            num = node[1][1][1]
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %num
            code += tag_parser.appendTabs() + "CALL(MAKE_SOB_INTEGER);\n"
            code += tag_parser.appendTabs() + "DROP(1);\n"

        elif sobType is 'T_FRACTION':
            num = node[1][1][1]
            denom = node[1][1][2]
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %num
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %denom
            code += tag_parser.appendTabs() + "CALL(IS_SOB_FRACTION);\n"
            code += tag_parser.appendTabs() + "DROP(2);\n"

        elif sobType is 'T_STRING':
            value = node[1][1][1]
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %value
            for i in range(value):
                code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %node[1][1][i+2]

            code += tag_parser.appendTabs() + "CALL(MAKE_SOB_STRING);\n"
            code += tag_parser.appendTabs() + "DROP(1);\n"

        elif sobType is 'T_CHAR':
            value = node[1][1][1]
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %value
            code += tag_parser.appendTabs() + "CALL(MAKE_SOB_CHAR);\n"
            code += tag_parser.appendTabs() + "DROP(1);\n"

        elif sobType is 'T_PAIR':
            car = node[1][1][1]
            cdr = node[1][1][2]
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %car
            code += tag_parser.appendTabs() + "PUSH(IMM(%s));\n" %cdr
            code += tag_parser.appendTabs() + "CALL(MAKE_SOB_PAIR);\n"
            code += tag_parser.appendTabs() + "DROP(2);\n"

        elif sobType is 'T_SYMBOL':
            code += tag_parser.appendTabs() + "#####################MAKE_SOB_SYMBOL#####################\n"

        elif sobType is 'T_BUCKET':
            code += tag_parser.appendTabs() + "#####################MAKE_SOB_BUCKET#####################\n"

        else:
            print("need to implemet that")

    return code

class CompilationError(Exception):
    def __init__(self,message):
        Exception.__init__(self,message)