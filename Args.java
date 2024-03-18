class Args extends Token implements TI {
	Expr expression;
    Args arguments;
    public Args(Expr e, Args a)
    {
        expression = e;
        arguments = a;
    }

    public Args(Expr e)
    {
        expression = e;
        arguments = null;
    }

    public String toString(int t)
    {
    	return(expression.toString(t) +
	             (arguments != null ? ", " + arguments.toString(t) : "") );
    }

    public String typeCheck() throws CompProjException {
        String exprType = expression.typeCheck();

        if (!exprType.equals("expr")) {
            throw new CompProjException("Error: Argument is not a valid expression : " + toString(0));
        }
        
        arguments.typeCheck();

        return "";
    }
}
