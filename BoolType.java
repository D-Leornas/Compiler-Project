class BoolType extends Type implements TI {

	public BoolType()
	{
	}

	public String toString(int t)
	{
		return "bool";
	}

	public String typeCheck() throws CompProjException {
        return "bool";
    }

}
