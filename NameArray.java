class NameArray extends Name implements TI {
	Expr expression;
  public NameArray(String i, Expr e)
  {
    super(i);
    expression = e;
  }

  public String toString(int t)
  {
  	return(id + "[" + expression.toString(t) + "]");
  }
}
