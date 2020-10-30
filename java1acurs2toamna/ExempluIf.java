public class ExempluIf {
    public static void main(String [] args) {
        if(2<1) {
            System.out.println("caz adevarat");
        } else {
            System.out.println("caz fals");
        }
        
        if(false){System.out.println("nu se va afisa acest mesaj niciodata");}
        if(true){System.out.println("mereu afisat");}
        boolean a;
        if(a=true) System.out.println("always");
    }
}