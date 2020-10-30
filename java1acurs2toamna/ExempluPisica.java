public class ExempluPisica {
    public static void main(String [] args) {
        Pisica p1;
        Pisica p2;
        int     x;
        p1 = new Pisica();
        p2 = p1;
        
        p1.nume = "Tommy";
        //. = op. de dereferentiere
        System.out.println(p1.nume);
        System.out.println(p2.nume);
    }
}