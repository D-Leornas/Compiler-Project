class MethodStart extends Token implements TI
{
	ReturnType returnType;
	String id;

	public MethodStart(ReturnType r, String i)
	{
		returnType = r;
		id = i;
	}

	public String toString(int t)
	{
    	return( returnType.toString(t) + " " + id);
	}

	public String typeCheck() throws CompProjException {
		//System.out.println("MethodStart");
		returnType.typeCheck();
        return "";
    }
}
