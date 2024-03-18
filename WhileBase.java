class WhileBase extends Token implements TI {
    Expr expression;
    public WhileBase(Expr e)
    {
        expression = e;
    }

    public String toString(int t)
    {
    	return(T(t) + "while(" + expression.toString(t) + ")\n");
    }

    public String typeCheck() throws CompProjException {
        return "";
    }
}

