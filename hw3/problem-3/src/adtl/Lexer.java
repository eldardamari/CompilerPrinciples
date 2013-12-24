/* The following code was generated by JFlex 1.4.3 on 22:44 24/12/13 */

package adtl;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 22:44 24/12/13 from the specification file
 * <tt>src/adtl/ADTL.lex</tt>
 */
public @SuppressWarnings(value={"all"}) class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int MULTILINE_COMMENT = 4;
  public static final int STRING = 2;
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2, 2
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\54\1\1\1\0\1\3\1\2\22\0\1\3\1\44\1\52"+
    "\3\0\1\43\1\0\1\32\1\33\1\51\1\50\1\36\1\10\1\40"+
    "\1\4\1\6\11\7\1\41\1\37\1\46\1\45\1\47\1\0\1\42"+
    "\32\5\1\0\1\53\2\0\1\5\1\0\1\11\1\5\1\20\1\5"+
    "\1\13\1\23\1\5\1\30\1\22\1\5\1\21\1\16\1\5\1\24"+
    "\1\17\2\5\1\14\1\12\1\15\1\27\1\26\1\25\3\5\1\34"+
    "\1\31\1\35\uff82\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\3\0\1\1\1\2\1\3\1\4\2\5\1\6\10\4"+
    "\1\7\1\10\1\11\1\12\1\13\1\14\1\15\1\16"+
    "\1\17\1\20\1\1\1\21\1\22\1\23\1\24\1\25"+
    "\1\26\1\27\1\30\1\31\1\32\3\2\1\0\1\33"+
    "\1\0\1\34\1\35\1\36\1\0\1\37\6\4\1\40"+
    "\1\41\1\4\1\42\1\43\1\44\1\45\1\46\1\47"+
    "\1\50\1\51\1\52\1\53\1\54\1\55\1\56\1\57"+
    "\1\60\1\34\2\60\1\36\1\4\1\61\2\4\1\62"+
    "\2\4\1\63\1\4\1\64\1\4\1\65\4\4\1\66"+
    "\1\67\1\70";

  private static int [] zzUnpackAction() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\55\0\132\0\207\0\264\0\341\0\u010e\0\u013b"+
    "\0\u0168\0\u0195\0\u01c2\0\u01ef\0\u021c\0\u0249\0\u0276\0\u02a3"+
    "\0\u02d0\0\u02fd\0\u032a\0\207\0\207\0\207\0\207\0\207"+
    "\0\207\0\u0357\0\207\0\207\0\u0384\0\u03b1\0\u03de\0\u040b"+
    "\0\u0438\0\u0465\0\207\0\207\0\u0492\0\207\0\u04bf\0\207"+
    "\0\u04ec\0\u0519\0\u0546\0\207\0\u0573\0\u05a0\0\u0573\0\u05cd"+
    "\0\u05fa\0\207\0\u0627\0\u0654\0\u0681\0\u06ae\0\u06db\0\u0708"+
    "\0\u010e\0\u010e\0\u0735\0\207\0\207\0\207\0\207\0\207"+
    "\0\207\0\207\0\207\0\207\0\207\0\207\0\207\0\207"+
    "\0\207\0\207\0\u0762\0\u0762\0\u078f\0\u078f\0\u07bc\0\u010e"+
    "\0\u07e9\0\u0816\0\u010e\0\u0843\0\u0870\0\u010e\0\u089d\0\u010e"+
    "\0\u08ca\0\u010e\0\u08f7\0\u0924\0\u0951\0\u097e\0\u010e\0\u010e"+
    "\0\u010e";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\4\3\5\1\6\1\7\1\10\1\11\1\12\1\13"+
    "\1\14\1\15\1\16\1\7\1\17\1\7\1\20\1\7"+
    "\1\21\1\7\1\22\4\7\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\33\1\34\1\35\1\36"+
    "\1\37\1\40\1\41\1\42\1\43\1\44\1\4\1\5"+
    "\1\45\2\0\47\45\1\46\1\47\1\45\2\50\1\51"+
    "\46\50\1\52\3\50\56\0\3\5\50\0\1\5\4\0"+
    "\1\53\44\0\1\54\10\0\3\7\1\0\20\7\24\0"+
    "\1\55\1\0\3\55\1\56\1\57\1\60\1\61\20\56"+
    "\25\55\1\0\3\55\1\56\2\11\1\55\20\56\24\55"+
    "\7\0\1\11\35\0\1\62\14\0\3\7\1\0\1\7"+
    "\1\63\16\7\31\0\3\7\1\0\2\7\1\64\15\7"+
    "\31\0\3\7\1\0\5\7\1\65\12\7\31\0\3\7"+
    "\1\0\2\7\1\66\15\7\31\0\3\7\1\0\6\7"+
    "\1\67\11\7\31\0\3\7\1\0\17\7\1\70\31\0"+
    "\3\7\1\0\12\7\1\71\1\72\4\7\31\0\3\7"+
    "\1\0\2\7\1\73\15\7\55\0\1\74\63\0\1\75"+
    "\57\0\1\76\56\0\1\77\54\0\1\100\54\0\1\101"+
    "\54\0\1\102\54\0\1\103\7\0\1\45\2\0\47\45"+
    "\2\0\1\45\1\104\2\0\11\104\1\105\1\106\6\104"+
    "\1\107\25\104\1\110\3\0\1\50\57\0\1\111\50\0"+
    "\1\53\1\50\1\51\52\53\6\0\1\112\53\0\1\113"+
    "\1\114\1\113\1\0\20\113\32\0\1\115\1\116\53\0"+
    "\1\112\1\116\52\0\3\7\1\0\1\7\1\117\16\7"+
    "\31\0\3\7\1\0\4\7\1\120\13\7\31\0\3\7"+
    "\1\0\1\7\1\121\16\7\31\0\3\7\1\0\4\7"+
    "\1\122\10\7\1\123\2\7\31\0\3\7\1\0\7\7"+
    "\1\124\10\7\31\0\3\7\1\0\6\7\1\125\11\7"+
    "\31\0\3\7\1\0\14\7\1\126\3\7\31\0\3\113"+
    "\1\0\20\113\32\0\2\116\52\0\3\7\1\0\2\7"+
    "\1\127\15\7\31\0\3\7\1\0\2\7\1\130\15\7"+
    "\31\0\3\7\1\0\16\7\1\131\1\7\31\0\3\7"+
    "\1\0\10\7\1\132\7\7\31\0\3\7\1\0\6\7"+
    "\1\133\11\7\31\0\3\7\1\0\3\7\1\134\14\7"+
    "\31\0\3\7\1\0\3\7\1\135\14\7\31\0\3\7"+
    "\1\0\1\7\1\136\16\7\31\0\3\7\1\0\4\7"+
    "\1\137\13\7\31\0\3\7\1\0\13\7\1\140\4\7"+
    "\31\0\3\7\1\0\2\7\1\141\15\7\24\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2475];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\3\0\1\11\17\1\6\11\1\1\2\11\6\1\2\11"+
    "\1\1\1\11\1\1\1\11\2\1\1\0\1\11\1\0"+
    "\3\1\1\0\1\11\11\1\17\11\27\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[97];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
StringBuffer string = new StringBuffer();

public int getLineNumber() { return yyline + 1; }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 126) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) throws LexicalError {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new LexicalError(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  throws LexicalError {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Token next_token() throws java.io.IOException, LexicalError {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          zzR = false;
          break;
        case '\r':
          yyline++;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
          }
          break;
        default:
          zzR = false;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 50: 
          { return new Token(yytext(), sym.REV, getLineNumber());
          }
        case 57: break;
        case 44: 
          { if (Main.rawQuotes) string.append("\\t"); else string.append('\t');
          }
        case 58: break;
        case 20: 
          { return new Token(yytext(), sym.GT, getLineNumber());
          }
        case 59: break;
        case 30: 
          { throw new LexicalError(yytext() + " leadin 0's", getLineNumber());
          }
        case 60: break;
        case 1: 
          { throw new LexicalError(yytext() + " is an illegal token", getLineNumber());
          }
        case 61: break;
        case 55: 
          { return new Token(yytext(), sym.RETURN, getLineNumber());
          }
        case 62: break;
        case 46: 
          { if (Main.rawQuotes) string.append("\\\""); else string.append('\"');
          }
        case 63: break;
        case 8: 
          { return new Token(yytext(), sym.LP, getLineNumber());
          }
        case 64: break;
        case 7: 
          { return new Token(yytext(), sym.BAR, getLineNumber());
          }
        case 65: break;
        case 38: 
          { return new Token(yytext(), sym.EQ, getLineNumber());
          }
        case 66: break;
        case 35: 
          { throw new LexicalError("'" + yytext() + "' too many dots", getLineNumber());
          }
        case 67: break;
        case 48: 
          { throw new LexicalError(yytext() + " empty fraction", getLineNumber());
          }
        case 68: break;
        case 49: 
          { return new Token(yytext(), sym.SET, getLineNumber());
          }
        case 69: break;
        case 45: 
          { if (Main.rawQuotes) string.append("\\n"); else string.append('\n');
          }
        case 70: break;
        case 37: 
          { return new Token(yytext(), sym.NEQ, getLineNumber());
          }
        case 71: break;
        case 47: 
          { yybegin(YYINITIAL);
          }
        case 72: break;
        case 27: 
          { yybegin(MULTILINE_COMMENT);
          }
        case 73: break;
        case 21: 
          { return new Token(yytext(), sym.PLUS, getLineNumber());
          }
        case 74: break;
        case 10: 
          { return new Token(yytext(), sym.LCBR, getLineNumber());
          }
        case 75: break;
        case 43: 
          { if (Main.rawQuotes) string.append("\\r"); else string.append('\r');
          }
        case 76: break;
        case 23: 
          { string = new StringBuffer(); yybegin(STRING);
          }
        case 77: break;
        case 11: 
          { return new Token(yytext(), sym.RCBR, getLineNumber());
          }
        case 78: break;
        case 40: 
          { return new Token(yytext(), sym.GTE, getLineNumber());
          }
        case 79: break;
        case 36: 
          { return new Token(yytext(), sym.LAND, getLineNumber());
          }
        case 80: break;
        case 17: 
          { return new Token(yytext(), sym.NOT, getLineNumber());
          }
        case 81: break;
        case 15: 
          { return new Token(yytext(), sym.COLON, getLineNumber());
          }
        case 82: break;
        case 42: 
          { throw new LexicalError("\"" + yytext() + "\"" + " is an illegal escape sequence", getLineNumber());
          }
        case 83: break;
        case 18: 
          { return new Token(yytext(), sym.ASSIGN, getLineNumber());
          }
        case 84: break;
        case 53: 
          { return new Token(yytext(), sym.LOCK, getLineNumber());
          }
        case 85: break;
        case 9: 
          { return new Token(yytext(), sym.RP, getLineNumber());
          }
        case 86: break;
        case 22: 
          { return new Token(yytext(), sym.TIMES, getLineNumber());
          }
        case 87: break;
        case 5: 
          { return new Token(yytext(), sym.INT, getLineNumber(), new Integer(yytext()).intValue());
          }
        case 88: break;
        case 34: 
          { return new Token(yytext(), sym.LOR, getLineNumber());
          }
        case 89: break;
        case 51: 
          { return new Token(yytext(), sym.NEW, getLineNumber());
          }
        case 90: break;
        case 54: 
          { return new Token(yytext(), sym.ASSERT, getLineNumber());
          }
        case 91: break;
        case 13: 
          { return new Token(yytext(), sym.SEMI, getLineNumber());
          }
        case 92: break;
        case 25: 
          { yybegin(YYINITIAL); 
                                   return new Token(yytext(), sym.QUOTE, getLineNumber(), string.toString());
          }
        case 93: break;
        case 31: 
          { return new Token(yytext(), sym.ASSIGN_MINUS, getLineNumber());
          }
        case 94: break;
        case 32: 
          { return new Token(yytext(), sym.IF, getLineNumber());
          }
        case 95: break;
        case 16: 
          { return new Token(yytext(), sym.AT, getLineNumber());
          }
        case 96: break;
        case 28: 
          { throw new LexicalError("'" + yytext() + "' illegal combination of digits and letters", getLineNumber());
          }
        case 97: break;
        case 52: 
          { return new Token(yytext(), sym.ELSE, getLineNumber());
          }
        case 98: break;
        case 41: 
          { return new Token(yytext(), sym.ASSIGN_PLUS, getLineNumber());
          }
        case 99: break;
        case 6: 
          { return new Token(yytext(), sym.MINUS, getLineNumber());
          }
        case 100: break;
        case 19: 
          { return new Token(yytext(), sym.LT, getLineNumber());
          }
        case 101: break;
        case 39: 
          { return new Token(yytext(), sym.LTE, getLineNumber());
          }
        case 102: break;
        case 33: 
          { return new Token(yytext(), sym.IN, getLineNumber());
          }
        case 103: break;
        case 56: 
          { return new Token(yytext(), sym.CHOOSE, getLineNumber());
          }
        case 104: break;
        case 29: 
          { throw new LexicalError(yytext() + " trailing 0's", getLineNumber());
          }
        case 105: break;
        case 14: 
          { return new Token(yytext(), sym.DOT, getLineNumber());
          }
        case 106: break;
        case 12: 
          { return new Token(yytext(), sym.COMMA, getLineNumber());
          }
        case 107: break;
        case 26: 
          { if (Main.rawQuotes) string.append("\\"); else string.append('\\');
          }
        case 108: break;
        case 3: 
          { return new Token(yytext(), sym.DIVIDE, getLineNumber());
          }
        case 109: break;
        case 24: 
          { string.append( yytext() );
          }
        case 110: break;
        case 4: 
          { return new Token(yytext(), sym.ID, getLineNumber(), yytext());
          }
        case 111: break;
        case 2: 
          { 
          }
        case 112: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              {   return new Token(sym.EOF, getLineNumber());
 }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
