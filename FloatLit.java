class FloatLit extends TypeLit implements TI {
	double floatingPoint; //the natural parse conversion makes this be a double
    public FloatLit(double f)
    {
        floatingPoint = f;
    }

    public String toString(int t)
    {
    	return Double.toString(floatingPoint);
    }

    public String typeCheck() throws CompProjException {
        return "float";
    }
}

