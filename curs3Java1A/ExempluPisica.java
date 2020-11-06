public class ExempluPisica {
    public static void main(String [] args){
        Pisica p1;//referinta
        p1 = new Pisica("Tommy", "gri", 3);
        Pisica p2 = new Pisica("Kitty", "neagra", 2);
        
        System.out.println(p1.nume);
        System.out.println(p1.culoare);
        System.out.println(p1.varsta);
        
        p1.spuneMiau();
        p2.spuneMiau();
    }
}