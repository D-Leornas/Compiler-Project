class FieldStart extends Token implements TI
{
	String type;
	String id;

	public FieldStart(String t, String i)
	{
		type = t;
		id = i;
	}

	public String toString(int t)
	{
    	return( type + " " + id);
	}

	public String typeCheck() throws CompProjException {
		//System.out.println("Add " + id);
        return type;
    }
}
