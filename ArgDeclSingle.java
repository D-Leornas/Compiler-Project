class ArgDeclSingle extends ArgDecl implements TI {
    public ArgDeclSingle(Type t, String i)
    {
        super(t, i);
    }

    public String toString(int t)
    {
    	return super.toString(t);
    }

    public String typeCheck() throws CompProjException {
        symbolTable.addVar(id, type.toString());
        return "";
    }
}

