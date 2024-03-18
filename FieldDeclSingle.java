class FieldDeclSingle extends FieldDecl implements TI {

	Boolean isFinal;
	OptionalExpr expression;
	public FieldDeclSingle(OptionalFinal f, FieldStart s, OptionalExpr e)
	{
		super(s);
		isFinal = true;
		expression = e;
	}

	public FieldDeclSingle(FieldStart f, OptionalExpr e)
	{
		super(f);
		isFinal = false;
		expression = e;
	}

	public String toString(int t)
	{
		return( T(t) + (isFinal ? "final " : "") + super.toString(t) + 
			(expression != null ? expression.toString(t) : "") + ";\n");
	}

	public String typeCheck() throws CompProjException {
		if (isFinal) {
			symbolTable.addVar(fieldStart.id, fieldStart.type + "Final");
		} else {
			symbolTable.addVar(fieldStart.id, fieldStart.type);
		}
		String fieldStartType = fieldStart.typeCheck();
		if (expression != null) {
			String expressionType = expression.typeCheck();
			if (!fieldStartType.equals(expressionType))
				throw new CompProjException("Expression type does not match variable type : " + toString(0));
		}
        return "";
    }

}



