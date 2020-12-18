public class Persoana implements Comparable<Persoana>{
    String nume;
    int varsta;
    
    public Persoana(String nume, int varsta){
        this.nume = nume;
        this.varsta = varsta;
    }
    
    @Override
    public int compareTo(Persoana p){
        return this.varsta - p.varsta;
    }
    
    public String toString() {
        return "nume: "+this.nume+" varsta: "+this.varsta;
    }
}