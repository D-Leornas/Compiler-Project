abstract class ArgDecl extends Token implements TI {
	Type type;
  String id;
  public ArgDecl(Type t, String i)
  {
    type = t;
    id = i;
  }

  public String toString(int t)
  {
  	return( type.toString(t) + " " + id);
  }

  public String typeCheck() throws CompProjException{
    symbolTable.addVar(id, type.toString(0));
    return "";
  }
}

