public class ExThread{
    public static void main(String [] args){
       OddNumbersThread t = new OddNumbersThread();
       t.start();
       // t.run(); -> as rula instructiunile pe ac fir cu main
       EvenNumbersThread r = new EvenNumbersThread();//task-ul de executat 
       Thread t2 = new Thread(r);//mecanism de fir de executie
       t2.start();
       
       System.out.println("End");
    }
}