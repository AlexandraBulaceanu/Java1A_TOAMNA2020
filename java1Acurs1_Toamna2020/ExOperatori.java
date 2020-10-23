public class ExOperatori {
    public static void main(String [] args) {
        boolean b1 = 3>4;//false
        boolean b2 = 5==5;//true
        boolean b3 = 4==6;//false
        boolean b4 = 5>8;//false
        boolean b5 = 6<9;//true
        boolean b6 = 10!=89;//true
        
        boolean b7 = true;
        boolean b8 = false;
        int a = 10;
        int b = 3;
        
        boolean b9 = b7&&b8;//se uita si la b8 pentru ca primul e true
        boolean b10 = b8&&b7;//nu se mai uita la b7, 
                            //pt ca primul e false si e operatorul cu doua
        boolean b11 = b8&b7;//se uita si la al doilea, pt ca e un singur &
        
        boolean b12 = b8||((a=b)==b);//true -> se uita in dr
        boolean b13 = ((a=b)==b)||b8;//true -> nu se mai uita in dr
        
    }
}