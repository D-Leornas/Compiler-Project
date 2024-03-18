class ArgDeclArray extends ArgDecl implements TI {
    
    public ArgDeclArray(Type t, String i)
    {
        super(t, i);
    }

    public String toString(int t)
    {
    	return (super.toString(t) + "[]");
    }

    public String typeCheck() throws CompProjException {
        symbolTable.addVar(id, type.toString(0));
        return "";
    }

}

