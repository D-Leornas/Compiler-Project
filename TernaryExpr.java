class TernaryExpr extends Expr implements TI {
	Expr condition;
	Expr whenTrue;
	Expr whenFalse;

    public TernaryExpr(Expr a, Expr b, Expr c)
    {
        condition = a;
        whenTrue = b;
        whenFalse = c;
    }

    public String toString(int t)
    {
    	return ("(" + condition.toString(t) + " ? " + whenTrue.toString(t) + " : " + whenFalse.toString(t) + ")");
    }
    
    public String typeCheck() throws CompProjException {
        String conditionType = condition.typeCheck();

        if (!conditionType.equals("bool")) {
            throw new CompProjException("Error: Ternary condition invalid : " + toString(0));
        }
        whenTrue.typeCheck();
        whenFalse.typeCheck();
        return "";
    }
}

