class PrintStmt extends NonWhileStmt implements TI {
	PrintList printList;
    public PrintStmt(PrintList p)
    {
        printList = p;
    }

    public String toString(int t)
    {
    	return(T(t) + "print(" + printList.toString(t) + ");\n");
    }

    public String typeCheck() throws CompProjException {
        printList.typeCheck();
        return "";
    }
}

