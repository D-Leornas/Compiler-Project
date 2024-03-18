class CharLit extends TypeLit implements TI {
	String character; //chars may actually be multiple characters in terms of escaping.
    public CharLit(String c)
    {
        character = c;
    }

    public String toString(int t)
    {
    	return character;
    }

    public String typeCheck() throws CompProjException {
        return "char";
    }
}

