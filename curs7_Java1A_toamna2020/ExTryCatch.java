public class ExTryCatch{
    public static void main(String [] args){
        try{
            System.out.println("A");
            intrebare(2);
            m(14);
            System.out.println("B");
        }catch(AnotherCheckedException e){
            System.out.println("D");
        }catch(MyCheckedException e){
            System.out.println("C");
        }finally{
            System.out.println("E");
        }
    }
    public static void m(int x) throws MyCheckedException,AnotherCheckedException{
        if(x>12) {throw new MyCheckedException();}
        if(x>3) { throw new AnotherCheckedException();}
    }
    public static void intrebare(int x){
        try{
            if(x>3) throw new MyCheckedException();
        }catch(MyCheckedException e){
            System.out.println("am tratat intern");
        }
    }
}