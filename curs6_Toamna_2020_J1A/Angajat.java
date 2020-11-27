public class Angajat {
    double salariu;
    int vechime;
    String nume;
    
    public Angajat(double salariu, int vechime, String nume){
        this.salariu = salariu;
        this.vechime = vechime;
        this.nume = nume;
    }
    
    public double calculeazaSalariu() {
        if(vechime > 4) {
            return salariu + 500;
        } else {return salariu;}
    }
}