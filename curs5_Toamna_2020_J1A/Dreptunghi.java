public class Dreptunghi extends Forma {
    int l=5;
    int h=7;
    @Override
    public double getArie() {
        return l*h; //obligata sa suprascriu metoda daca vreau ca Dreptunghi sa fie clasa concreta
    }
}