class IfBase extends Token implements TI {
    Expr expression;
    public IfBase(Expr e)
    {
        expression = e;
    }

    public String toString(int t)
    {
    	return ("if (" + expression.toString(t) + ")\n");
    }

    public String typeCheck() throws CompProjException {
        String exprType = expression.typeCheck();

		if (!exprType.equals("expr")) {
			throw new CompProjException("Error: Condition is not a valid expression : " + toString(0));
		}
		
		return "";
    }
}

