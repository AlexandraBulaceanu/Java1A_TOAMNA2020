//Afisati in consola numerele de la 1 la 10.
public class ExempluFor {
    public static void main(String [] args){
        for(int i=1; i<=10; i++) {
            System.out.print(i+" ");
        }
        
        System.out.println();//doar trece pe linia urmatoare
        
        int i = 1;
        for(;;) {
            System.out.println(i);
            i++;
            if(i==11) break;
        }
        
        for(int h=4, j=9; (h<8)&&(j>=4);  h++,j--) {
            System.out.println("ex demonstrativ");
        }
    }
}