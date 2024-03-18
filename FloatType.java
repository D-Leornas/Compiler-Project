class FloatType extends Type implements TI {

	public FloatType()
	{
	}

	public String toString(int t)
	{
		return "float";
	}

	public String typeCheck() throws CompProjException {
        return "float";
    }

}
