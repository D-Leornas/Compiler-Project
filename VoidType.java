class VoidType extends ReturnType implements TI
{ 

	public VoidType()
	{
	}

	public String toString(int t)
	{
		return "void";
	}

	public String typeCheck() throws CompProjException {
		return "void";
	}
}
