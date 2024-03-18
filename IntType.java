class IntType extends Type implements TI {

	public IntType()
	{
	}

	public String toString(int t)
	{
		return "int";
	}

	public String typeCheck() throws CompProjException {
        return "int";
    }

}
