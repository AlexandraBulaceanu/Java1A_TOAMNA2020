//Afisati in consola numerele de la 1 la 10.
public class ExempluWhile {
    public static void main(String [] args) {
        int i=1;
        while(i<=10) {
            System.out.println(i);
            i++;
        }
        
        while(true) {
            break;
        }
        System.out.println("never - unreachable statement");
        //while(false){}
        
        i=1;
        do {
            System.out.println(i);
            i++;
        }while(i<=10);
        
    }
}