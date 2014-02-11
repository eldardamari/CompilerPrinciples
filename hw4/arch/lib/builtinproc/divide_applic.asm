/* builtinproc/plus_applic.asm
 * Compute Variadic plus
 *
 * Programmer: Eldar Damari, 2014
 */

L_Divide_Applic:
	PUSH(FP);
	MOV(FP, SP);
	PUSH(R1);
	PUSH(R2);
	/* accumulator */
	MOV(R0, IMM(0));
	/* num of arguments on stack */
	MOV(R1, FPARG(1));
	ADD(R1, IMM(1));

L_Divide_Applic_Loop:
	CMP(R1, IMM(1));
	JUMP_EQ(L_Divide_Applic_Exit);			
	MOV(R2, FPARG(R1));
	DIV(R0, INDD(R2,1));
	DECR(R1);
	JUMP(L_Divide_Applic_Loop);

L_Divide_Applic_Exit:
	POP(R2);
	POP(R1);
	POP(FP);
	
	PUSH(R0);
	CALL(WRITE_INTEGER);
	DROP(1);
	
	RETURN;
