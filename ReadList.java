class ReadList extends Token implements TI {
	Name name;
    ReadList readList;
    public ReadList(Name n)
    {
        name = n;
        readList = null;
    }

    public ReadList(Name n, ReadList r)
    {
        name = n;
        readList = r;
    }

    public String toString(int t)
    {
    	return(name.toString(t) + (readList != null ? ", " + readList.toString(t) : ""));
    }

    public String typeCheck() throws CompProjException {
        return "";
    }
}
