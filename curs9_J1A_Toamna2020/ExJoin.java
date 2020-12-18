public class ExJoin{
    public static void main(String [] args){
        long tStart = System.currentTimeMillis();
        /*
        collectDataFromDb1();
        collectDataFromDb2();
        */
        Thread x = new Thread(()->collectDataFromDb1());
        Thread y = new Thread(()->collectDataFromDb2());
        x.start();
        y.start();
        
        try{
            x.join();//main asteapta ca x sa se termine
            y.join();//main asteapta si dupa y
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        long tFinal = System.currentTimeMillis();
        System.out.println(tFinal-tStart);//cat a durat executia celor doua metode
    }
    public static void collectDataFromDb1(){
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
    public static void collectDataFromDb2(){
        try{
            Thread.sleep(3000);
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}