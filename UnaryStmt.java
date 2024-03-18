class UnaryStmt extends NonWhileStmt implements TI {
	String name;
    String operator;
    public UnaryStmt(String n, String o)
    {
        name = n;
        operator = o;
    }

    public String toString(int t)
    {
    	return(T(t) + name + operator + ";\n");
    }

    public String typeCheck() throws CompProjException {
        String nameType = symbolTable.get(name);
        if (!nameType.equals("integer") || !nameType.equals("float")) {
            throw new CompProjException("Error: Cannot increment/decrement variable of type: " + nameType + " : " + toString(0));
        }
        return "";
    }
}

