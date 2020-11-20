public class ExPolimorfism {
    public static void main(String ... args){
        Punct p1 = new Punct(1,2);
        Punct p2 = new Cerc();
        Punct p3 = new Cilindru();
        
        p2.x = 5;
        p2.y = 8;
        
        //p2.raza = 10;
        //p2.getArie();
        Cerc c1 = (Cerc)p2;
        c1.raza = 3;
        //Cerc c2 = (Cerc)p1; --> ClassCastException
        String s = "Sir de caractere";
        //Cerc c3 = (Cerc)s; --> eroare de compilare
        //Cilindru c = (Cilindru)p2; --> ClassCastException
        
        if(p2 instanceof Cilindru) {
            System.out.println("p2 este un cilindru");
        }
        if(p2 instanceof Cerc) {
            System.out.println("p2 este un cerc");
        }
        if(null instanceof Punct){
            System.out.println("intoarce false");
        }
    }
}