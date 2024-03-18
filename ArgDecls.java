class ArgDecls extends Token implements TI {
	ArgDecl argumentDeclaration;
	ArgDecls argumentDeclarations;
    public ArgDecls(ArgDecl a, ArgDecls s)
    {
    	argumentDeclaration = a;
    	argumentDeclarations = s;
    }

        public ArgDecls(ArgDecl a)
    {
        argumentDeclaration = a;
        argumentDeclarations = null;
    }


    public String toString(int t)
    {
    	return(argumentDeclaration.toString(t) + (argumentDeclarations != null ? ", " + 
            argumentDeclarations.toString(t) : "") );
    }

    public String typeCheck() throws CompProjException {
        argumentDeclaration.typeCheck();
        if (argumentDeclarations != null)
            argumentDeclarations.typeCheck();
        return "";
        }

    public String getType() {
        String fullType = ":";
        fullType = fullType + argumentDeclaration.type;
        if (argumentDeclarations != null)
            fullType = fullType + argumentDeclarations.getType() + ":";
        return fullType;
    }
}

