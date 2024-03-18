class CompProjException extends Throwable{
    String error;
    public CompProjException(String s)
    {
        error = s;
    }

    public String toString()
    {
      return error;
    }
}
