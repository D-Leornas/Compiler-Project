class CharType extends Type implements TI {

	public CharType()
	{
	}

	public String toString(int t)
	{
		return "char";
	}


	public String typeCheck() throws CompProjException {
        return "char";
    }
}
