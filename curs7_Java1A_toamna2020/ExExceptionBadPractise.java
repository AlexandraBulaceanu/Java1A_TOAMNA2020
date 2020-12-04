public class ExExceptionBadPractise{
    public static void main(String [] args){
        try{
            System.out.println("A");
            m(14);
            System.out.println("B");
        }catch(Exception e){
            System.out.println("C");
        }
    }
    public static void m(int x) throws Exception{
        if(x>12) {throw new MyCheckedException();}
        if(x<3)  {throw new AnotherCheckedException();}
    }
}