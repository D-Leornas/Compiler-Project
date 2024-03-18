import java.util.ArrayList;

class SymbolTable {
        ArrayList<ArrayList<Pair<String, String>>> table;

        public SymbolTable() {
                table = new ArrayList<ArrayList<Pair<String, String>>>();
                table.add(new ArrayList<Pair<String, String>>());
        }

        public void startScope() {
                table.add( new ArrayList<Pair<String, String>>());
        }

        public void endScope() {
                table.remove(table.size()-1);
        }

        public String get(String s) throws CompProjException {
                for (int i = table.size()-1; i >= 0; --i) {
                        for (Pair<String, String> p : table.get(i)) {
                                if (p.getKey().equals(s))
                                    return p.getValue();
                        }
                }
                throw new CompProjException("Error: " + s + " not declared");
        }

        public void addVar(String id, String t) throws CompProjException
        {
            for (Pair<String,String> p : table.get(table.size()-1))
                {
                    if (p.getKey().equals(id))
                        throw new CompProjException("Error: tried to redeclare variable " + id);
                }
            table.get(table.size()-1).add(new Pair<String,String>(id,t));
            
            return;
        }

        public void addMethod(String id, ArgDecls params) throws CompProjException
        {
            String pType = null;
            if (params != null)
                pType = params.getType();

            
            for (Pair<String,String> p : table.get(table.size()-1)) {
                if (p.getKey().equals(id))
                    throw new CompProjException("Error: tried to redeclare method " + id);
            }
            table.get(table.size()-1).add(new Pair<String,String>(id,pType));
            return;
        }
        
        public String toString()
        {
            String ret = "";
            String t = "";
            for (ArrayList<Pair<String,String>> v : table)
                {
                    for (Pair<String,String> p : v)
                        ret += t + p.getKey() + " " + p.getValue().toString() + "\n";
                    t += "\t";
                }
            return ret;
        }
}
