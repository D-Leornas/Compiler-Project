class MethodDecl extends Token implements TI {

	MethodStart methodStart;
	ArgDecls argumentDeclarations;
	FieldDecls fieldDeclarations;
	Stmts statements;
	Boolean hasSemicolon;

	public MethodDecl(MethodStart m, ArgDecls a, FieldDecls f, Stmts s, OptionalSemi o)
	{
		methodStart = m;
		argumentDeclarations = a;
		fieldDeclarations = f;
		statements = s;
		hasSemicolon = o != null;
	}

	public MethodDecl(MethodStart m, FieldDecls f, Stmts s, OptionalSemi o)
	{
		methodStart = m;
		argumentDeclarations = null;
		fieldDeclarations = f;
		statements = s;
		hasSemicolon = o != null;
	}

	public String toString(int t)
	{
		return( T(t) + methodStart.toString(t) + "(" + 
			( argumentDeclarations != null ? argumentDeclarations.toString(t) : "") 
			+ ")\n" + T(t) +"{\n" + 
			(fieldDeclarations != null ? fieldDeclarations.toString(t + 1) : "") 
			+ (statements != null ? statements.toString(t + 1) : "")
			+ T(t) + "}" + (hasSemicolon ? ";\n" : "\n") );
	}

	public String typeCheck() throws CompProjException {
		//System.out.println(argumentDeclarations);
		symbolTable.addMethod(methodStart.id, argumentDeclarations);
		symbolTable.startScope();
		//System.out.println(methodStart.id);
		methodStart.typeCheck();
		if (argumentDeclarations != null)
			argumentDeclarations.typeCheck();
		if (fieldDeclarations != null) {
			fieldDeclarations.typeCheck();
		}
		if (statements != null) {
			if (!statements.typeCheck().equals(methodStart.returnType.toString(0))) {
				throw new CompProjException("Error: tried to return " + statements.typeCheck() + " from a " + methodStart.returnType.toString(0) + " method");
			};
		} else if (!methodStart.returnType.toString(0).equals("void")){
			throw new CompProjException("Error: No return statement");
		}
		symbolTable.endScope();
        return "";
    }

}
