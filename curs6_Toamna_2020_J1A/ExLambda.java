public class ExLambda {
    public static void main(String [] args){
        Predicat p1 = (x) -> x>4;
        Predicat p2 = x -> x<10;//pot sa omit parantezele rotunde pt un singur parametru, fara tip 
        Predicat p3 = (int x) -> x%2==0;
        Predicat p4 = x -> {return x<10;};
        Predicat p5 = x -> false;
        
        Functie f1 = (x,y) -> 25;
        Functie f2 = (int x,int y) -> x+y;
        Functie f3 = (int x,int y) -> {return x*y;};
        
        m((x,y)->x+y,10,20);
        m((x,y)->x-y,30,20);
        m(f3,10,20);
        
    }
    public static void m(Functie f,int a,int b) {
        System.out.println(f.operatie(a,b));
    }
}