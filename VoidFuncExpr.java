class VoidFuncExpr extends FuncExpr implements TI {
    public VoidFuncExpr(String i)
    {
        super(i);
    }

    public String toString(int t)
    {
    	return(id + "()");
    }

    public String typeCheck() throws CompProjException {
        return "";
    }
}

