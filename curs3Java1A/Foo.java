public class Foo {
    void transferPrinValoare(int x) {
        x = 10;
        System.out.println("valoarea x-ului in metoda "+x);
    }
    
    //clasa Punct - coordatele x si y
    void transferPrinReferinta(Punct p) {
        p.x = 10;
        System.out.println("p.x in metoda are valoarea: "+p.x);
    }
}