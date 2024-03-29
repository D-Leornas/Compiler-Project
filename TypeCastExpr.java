class TypeCastExpr extends ActionExpr implements TI {
	Type type;
    Expr expression;
    public TypeCastExpr(Type t, Expr e)
    {
        type = t;
        expression = e;
    }

    public String toString(int t)
    {
    	return("((" + type.toString(t) + ")" + expression.toString(t) + ")");
    }
    
    public String typeCheck() throws CompProjException {
        return "expr";
    }
}

