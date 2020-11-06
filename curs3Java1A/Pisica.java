public class Pisica {
    String nume;
    String culoare;
    int varsta;
    /*
    Pisica() {
        System.out.println("Acesta este un constructor fara parametrii");
    }*/
    //this = in constructor este instanta care se construieste
    //this = la nivel general, este instanta clasei curente( clasa Pisica)
    Pisica(String nume, String culoare, int varsta){
        this.nume = nume;
        this.culoare = culoare;
        this.varsta = varsta;
    }
    Pisica(String nume){
        this.nume = nume;
    }
    Pisica() {
        //System.out.println("never");
        this("Tom");
    }
    void spuneMiau(){
        System.out.println("Miau! Nume meu este "+ this.nume);
    }
    //double spuneMiau(){} -> nu il intereseaza tipul returnat
    
    
}