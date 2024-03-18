class UnaryExpr extends NonTypeCastExpr implements TI {
	String operator;
    Expr expression;
    public UnaryExpr(String o, Expr e)
    {
        operator = o;
        expression = e;
    }

    public String toString(int t)
    {
    	return("(" + operator + expression.toString(t) + ")");
    }

    public String typeCheck() throws CompProjException {
        if (operator.equals("~")) {
            switch (expression.typeCheck()) {
                case "char":
                    new CompProjException("Error: Tried to negate a variable of type char");
                    break;
                case "string":
                    new CompProjException("Error: Tried to negate a variable of type string");
                    break;
                default:
                    break;
            }
        }
        return "expr";
    }
}

