JAVA=java
JAVAC=javac
JFLEX=$(JAVA) -jar jflex-full-1.8.2.jar
CUPJAR=./java-cup-11b.jar
CUP=$(JAVA) -jar $(CUPJAR)
CP=.:$(CUPJAR)

default: run

.SUFFIXES: $(SUFFIXES) .class .java

.java.class:
		$(JAVAC) -cp $(CP) $*.java

FILE=    Lexer.java      parser.java    sym.java \
		ArgDecl.java ArgDeclArray.java ArgDecls.java ArgDeclSingle.java \
		ArgFuncStmt.java Args.java AssmntStmt.java TI.java BinaryExpr.java \
		BoolLit.java CharLit.java Expr.java FieldDecl.java \
		FieldDeclArray.java FieldDecls.java FieldDeclSingle.java FloatLit.java \
		FuncStmt.java IfBackend.java IfBackendStmt.java IfBase.java IfStmt.java \
		IntLit.java MemberDecls.java MethodDecl.java MethodDecls.java \
		Name.java NameArray.java NonIfStmt.java OptionalExpr.java \
		OptionalFinal.java OptionalSemi.java ParenExpr.java PrintList.java \
		PrintLnList.java PrintLnStmt.java PrintStmt.java Program.java ReadList.java \
		ReadStmt.java ReturnType.java ScopeStmt.java Stmt.java Stmts.java \
		StrLit.java TernaryExpr.java Type.java TypeCastExpr.java TypeLit.java \
		UnaryExpr.java UnaryStmt.java ValueReturn.java VoidFuncStmt.java VoidReturn.java \
		WhileStmt.java FuncExpr.java VoidFuncExpr.java \
		ArgFuncExpr.java FieldStart.java FieldsNMethods.java VoidType.java \
		WhileBase.java Token.java IntType.java FloatType.java \
		CharType.java BoolType.java NonTypeCastExpr.java ActionExpr.java\
    LexerTest.java TypeCheckingTest.java

run: badDec.as badInc.as badNegation.as badString.as badTernaryCond.as badTernaryTypes.as boolToFloat.as boolToInt.as callNonExistFunc.as charToFloat.as charToInt.as floatToInt.as fullValidProgram.as incompatBinary.as intArrayToBoolArray.as noReturn.as reassignFinal.as redefMethod.as redefVar.as redefVarAsMethod.as returnTypeBad.as

all: Lexer.java parser.java $(FILE:java=class)

example3in.txt: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/example3in.txt 2> testsOut/example3out.txt
	cat -n testsOut/example3out.txt

badDec.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/badDec.as 2> testsOut/badDecOut.txt
	cat -n testsOut/badDecOut.txt

badInc.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/badInc.as 2> testsOut/badIncOut.txt
	cat -n testsOut/badIncOut.txt

badNegation.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/badNegation.as 2> testsOut/badNegationOut.txt
	cat -n testsOut/badNegationOut.txt

badString.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/badString.as 2> testsOut/badStringOut.txt
	cat -n testsOut/badStringOut.txt

badTernaryCond.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/badTernaryCond.as 2> testsOut/badTernaryCondOut.txt
	cat -n testsOut/badTernaryCondOut.txt
	
badTernaryTypes.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/badTernaryTypes.as 2> testsOut/badTernaryTypesOut.txt
	cat -n testsOut/badTernaryTypesOut.txt

boolToFloat.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/boolToFloat.as 2> testsOut/boolToFloatOut.txt
	cat -n testsOut/boolToFloatOut.txt

boolToInt.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/boolToInt.as 2> testsOut/boolToIntOut.txt
	cat -n testsOut/boolToIntOut.txt

callNonExistFunc.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/callNonExistFunc.as 2> testsOut/callNonExistFuncOut.txt
	cat -n testsOut/callNonExistFuncOut.txt

charToFloat.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/charToFloat.as 2> testsOut/charToFloatOut.txt
	cat -n testsOut/charToFloatOut.txt

charToInt.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/charToInt.as 2> testsOut/charToIntOut.txt
	cat -n testsOut/charToIntOut.txt

floatToInt.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/floatToInt.as 2> testsOut/floatToIntOut.txt
	cat -n testsOut/floatToIntOut.txt

fullValidProgram.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/fullValidProgram.as 2> testsOut/fullValidProgramOut.txt
	cat -n testsOut/fullValidProgramOut.txt

incompatBinary.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/incompatBinary.as 2> testsOut/incompatBinaryOut.txt
	cat -n testsOut/incompatBinaryOut.txt

intArrayToBoolArray.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/intArrayToBoolArray.as 2> testsOut/intArrayToBoolArrayOut.txt
	cat -n testsOut/intArrayToBoolArrayOut.txt

noReturn.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/noReturn.as 2> testsOut/noReturnOut.txt
	cat -n testsOut/noReturnOut.txt

reassignFinal.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/reassignFinal.as 2> testsOut/reassignFinalOut.txt
	cat -n testsOut/reassignFinalOut.txt

redefMethod.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/redefMethod.as 2> testsOut/redefMethodOut.txt
	cat -n testsOut/redefMethodOut.txt

redefVar.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/redefVar.as 2> testsOut/redefVarOut.txt
	cat -n testsOut/redefVarOut.txt

redefVarAsMethod.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/redefVarAsMethod.as 2> testsOut/redefVarAsMethodOut.txt
	cat -n testsOut/redefVarAsMethodOut.txt

returnTypeBad.as: all
	$(JAVA) -cp $(CP) TypeCheckingTest testsIn/returnTypeBad.as 2> testsOut/returnTypeBadOut.txt
	cat -n testsOut/returnTypeBadOut.txt

clean:
		rm -f *.class *~ *.bak Lexer.java parser.java sym.java

Lexer.java: tokens.jflex
		$(JFLEX) tokens.jflex

parser.java: grammar.cup
		$(CUP) -interface < grammar.cup

parserD.java: grammar.cup
		$(CUP) -interface -dump < grammar.cup
