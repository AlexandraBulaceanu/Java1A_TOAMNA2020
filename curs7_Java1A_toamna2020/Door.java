public class Door implements AutoCloseable{
    public Door(){
        open();
    }
    private void open(){
        System.out.println("open");
    }
    @Override
    public void close(){
        System.out.println("close");
    }
}