public class Firma {
    //implementare inner static thread-safe
    String denumire;
    int nr_angajati;
    String adresa;
    
    private Firma(){}
    private static final class SingletonHolder{
        private static final Firma SINGLETON = new Firma();
    }
    public static Firma getInstance(){
        return SingletonHolder.SINGLETON;
    }
    
}