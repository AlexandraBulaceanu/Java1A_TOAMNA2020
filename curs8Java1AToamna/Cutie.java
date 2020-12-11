public class Cutie<T>{
    T continut;
    //static T y;
    public Cutie(){}
    public Cutie(T continut){}
    public T getContinut(){
        return continut;
    }
    public void afisare(T continut){
        System.out.println(continut);
    }
    //public static void metodaStaticaFaraTg(T a){}
    public static <Q> void metodaStaticaCuDefTg(Q a){}
    
}