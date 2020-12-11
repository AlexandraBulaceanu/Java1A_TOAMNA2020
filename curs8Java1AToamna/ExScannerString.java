import java.util.*;
public class ExScannerString{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);//creez fluxul de citire din consola
        System.out.println("Introdu numele tau: ");
        String line = s.nextLine();//citesc linia introdusa de catre utilizator
        StringBuilder sb = new StringBuilder(line);
        sb.reverse();//inversarea sirului
        System.out.println("Numele tau citit invers este: "+sb);
    }
}
