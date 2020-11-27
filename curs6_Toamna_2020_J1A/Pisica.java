public class Pisica{
    String nume;
    int varsta;
    String culoare;
    
    @Override
    public boolean equals(Object obj){
        if(obj == null) return false;
        if(obj instanceof Pisica){
            Pisica p = (Pisica)obj;
            return this.varsta == p.varsta;
        }
        return false;
    }
}