class ArgFuncStmt extends FuncStmt implements TI {
	Args arguments;
    public ArgFuncStmt(String i, Args a)
    {
        super(i);
        arguments = a;
    }

    public String toString(int t)
    {
    	return(T(t) + id + "(" + arguments.toString(t) + ");\n");
    }

    public String typeCheck() throws CompProjException {
        String argsType = arguments.typeCheck();

        if (!argsType.equals("args")) {
            throw new CompProjException("Error: Argument(s) are invalid : " + toString(0));
        }

        return "";
    }

}

