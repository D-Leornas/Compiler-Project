class ValueReturn extends NonWhileStmt implements TI {
	Expr expression;
    public ValueReturn(Expr e)
    {
        expression = e;
    }

    public String toString(int t)
    {
    	return(T(t) + "return " + expression.toString(t) + ";\n");
    }

    public String typeCheck() throws CompProjException {
        return expression.typeCheck();
    }
}

