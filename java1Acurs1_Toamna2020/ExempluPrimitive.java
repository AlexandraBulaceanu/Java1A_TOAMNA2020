/**
    Acesta este un exemplu cu primitive, string si comentarii
   @author Alexandra
   @version 1.0
*/
public class ExempluPrimitive {
    public static void main(String [] args){
        /*Comentariu
          pe
          mai
          multe linii
         */
        
        byte b1;//declare de variabila
        b1 = 10;
        
        byte b2 = 20;//initializare
        short s1, s2, s3;
        int i1 = 10;
        long l1 = 20;
        int g1 = 04;//baza 8
        int q2 = 0xFA;//baza 16
        int q3 = 0b101001;//baza 2
        System.out.println(q2);
        long w1 = 1_000_000;
        long k = 10000000000L;
        float f1 = 10.5f;
        float f2 = (float)10.5;
        double d1 = 10.5;
        boolean bol1 = true;
        boolean bol2 = false;
        char c1 = 'a';
        char c2 = '\u0235';
        char c3 = '\n';
        System.out.println(c2+" "+f1);
        
        String sir;//NU E PRIMITIVA
        sir = "Buna";
        System.out.println(sir);
        
    }
}