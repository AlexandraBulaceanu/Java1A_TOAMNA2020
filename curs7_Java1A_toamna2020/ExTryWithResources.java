public class ExTryWithResources{
    public static void main(String [] args){
        final Door d1 = new Door();
        Door d2 = new Door();
        try(d1;d2){
            //utilizare resurse
            System.out.println("A");
            if(1==1) throw new RuntimeException("in blocul de try");
            System.out.println("B");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            System.out.println("finally explicit");
        }
    }
}