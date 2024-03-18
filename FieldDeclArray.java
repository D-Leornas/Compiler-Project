class FieldDeclArray extends FieldDecl implements TI {

	int intlit;
	public FieldDeclArray(FieldStart f, int n)
	{
		super(f);
		intlit = n;
	}

	public String toString(int t)
	{
		return( T(t) + super.toString(t) + "[" + intlit + "];\n");
	}

	public String typeCheck() throws CompProjException {
		symbolTable.addVar(fieldStart.id, fieldStart.type + "Array");
        return "";
    }

}
