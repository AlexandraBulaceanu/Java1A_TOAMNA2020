public abstract class Forma {
    String nume; //atribut
    public void afisareNume(){
        System.out.println(nume); //metoda concreta
    }
    public abstract double getArie(); // metoda abstracta -> nu are definita o functionalitate
    //generalizeaza
}