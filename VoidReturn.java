class VoidReturn extends NonWhileStmt implements TI {
    public VoidReturn()
    {
    }

    public String toString(int t)
    {
    	return(T(t) + "return;\n");
    }

    public String typeCheck() throws CompProjException {
        return "";
    }
}

