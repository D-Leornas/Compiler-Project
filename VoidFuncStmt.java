class VoidFuncStmt extends FuncStmt implements TI {
    public VoidFuncStmt(String i)
    {
        super(i);
    }

    public String toString(int t)
    {
    	return(T(t) + id + "();\n");
    }

    public String typeCheck() throws CompProjException {
        symbolTable.get(id);
        return "";
    }
}

