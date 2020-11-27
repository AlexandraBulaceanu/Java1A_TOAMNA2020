public class ConexiuneBD {
    String nume;
    int timp;
    //lazy implementation
    private ConexiuneBD(){}
    private static ConexiuneBD SINGLETON;
    public static ConexiuneBD getInstance() {
        if(SINGLETON == null) {
            //daca nu exista deja o conexiune, voi instantia una
            SINGLETON = new ConexiuneBD();
        }
        return SINGLETON;
    }
}