class BoolLit extends TypeLit implements TI {
	String bool;
    public BoolLit(String b)
    {
        bool = b;
    }

    public String toString(int t)
    {
    	return bool;
    }

    public String typeCheck() throws CompProjException {
        return "bool";
    }
}

