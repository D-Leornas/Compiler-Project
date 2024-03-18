class ArgFuncExpr extends FuncExpr implements TI {
	Args arguments;
    public ArgFuncExpr(String i, Args a)
    {
        super(i);
        arguments = a;
    }

    public String toString(int t)
    {
    	return(id + "(" + arguments.toString(t) + ")");
    }

    public String typeCheck() throws CompProjException {
        String argsType = arguments.typeCheck();

        if (!argsType.equals("args")) {
            throw new CompProjException("Error: Argument(s) are invalid : " + toString(0));
        }

        return "";
    }
}

