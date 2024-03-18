class OptionalExpr extends Token implements TI {

	Expr expression;
	public OptionalExpr(Expr e)
	{
		expression = e;
	}

	public String toString(int t)
	{
		return( " = " + expression.toString(t));
	}

	public String typeCheck() throws CompProjException {
        return expression.typeCheck();
    }

}
