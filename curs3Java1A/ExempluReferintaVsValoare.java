public class ExempluReferintaVsValoare {
    public static void main(String [] args) {
        Foo f1 = new Foo();
        int x = 30;
        Punct p1 = new Punct(15, 20);
        
        System.out.println("x initial "+x);
        f1.transferPrinValoare(x);
        System.out.println("x dupa apelul metodei are valoarea "+x);
        
        System.out.println("p1.x initial "+p1.x);
        f1.transferPrinReferinta(p1);
        System.out.println("p1.x dupa apelul metodei are valoarea "+p1.x);
        
    }
}