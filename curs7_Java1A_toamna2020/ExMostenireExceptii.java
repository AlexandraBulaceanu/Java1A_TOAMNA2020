public class ExMostenireExceptii{
    public static void main(String [] args){
        try{
            System.out.println("A");
            m(14);
            System.out.println("B");
        }catch(BazException e){
            System.out.println("D");
        }catch(FooException e){
            System.out.println("C");
        }
    }
    public static void m(int x) throws BazException,FooException{
        if(x>12) {throw new BazException();}
        if(x<3)  {throw new FooException();}
    }
}