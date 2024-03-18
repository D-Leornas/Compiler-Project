class BinaryExpr extends NonTypeCastExpr implements TI {
	Expr leftHandSide;
	String operator;
	Expr rightHandSide;

    public BinaryExpr(Expr l, String b, Expr r)
    {
        leftHandSide = l;
        operator = b;
        rightHandSide = r;
    }

    public String toString(int t)
    {
    	return ("(" + leftHandSide.toString(t) + " " + operator + " " + rightHandSide.toString(t) + ")");
    }

    public String typeCheck() throws CompProjException {
        String lhsType = leftHandSide.typeCheck();
		String rhsType = rightHandSide.typeCheck();

		if(!lhsType.equals(rhsType)) {
			throw new CompProjException("Error: tried to operate on different types : " + toString(0));
		}
		switch (lhsType) {
			case "int": return "int";
			case "float": return "float";
			case "bool": return "bool";
			case "char": throw new CompProjException("Error: tried to operate on chars : " + toString(0));
			case "string": throw new CompProjException("Error: tried to operate on strings : " + toString(0));
			case "id": return "id";
			default: return "unknown type";
		}

    }
}

