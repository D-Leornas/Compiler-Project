class AssmntStmt extends NonWhileStmt implements TI {
	Name name;
    Expr expression;

    public AssmntStmt(Name n, Expr e)
    {
        name = n;
        expression = e;
    }

    public String toString(int t)
    {
    	return(T(t) + name.toString(t) + " = " + expression.toString(t) + ";\n");
    }

    public String typeCheck() throws CompProjException {
        String nameType = symbolTable.get(name.toString(0));
        String exprType = expression.typeCheck();

        if (!nameType.contains("Final")) {
            if (!exprType.equals(nameType)) {
                throw new CompProjException("Error: tried to assign " + exprType + " to type " + nameType + " : " + toString(0));
            }
        } else {
            throw new CompProjException("Error: tried to reassign a final variable");
        }

        return exprType;
    }
}

