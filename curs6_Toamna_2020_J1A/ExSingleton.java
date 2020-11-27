public class ExSingleton {
    public static void main(String ... args){
        //ConexiuneBD conexiune = new ConexiuneBD();
        ConexiuneBD conn = ConexiuneBD.getInstance();
        conn.nume = "Oracle";
        ConexiuneBD conn2 = ConexiuneBD.getInstance();
        System.out.println(conn2.nume);
    }
}