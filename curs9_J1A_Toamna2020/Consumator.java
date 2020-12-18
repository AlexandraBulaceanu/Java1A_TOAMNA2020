public class Consumator extends Thread{
    public Consumator(String nume){
        super(nume);
    }
    @Override
    public void run(){
        try{
            while(true){
                synchronized(Exemplu3.list){
                    //pana nu eliberez lista, nu o mai poate modifica nimeni
                if(!Exemplu3.list.isEmpty()){
                    int x = Exemplu3.list.get(0);
                    Exemplu3.list.remove(0);
                    Exemplu3.list.notifyAll();//consumatorul anunta producatorul de micsorarea dimensiunii listei
                    System.out.println("A fost eliminat elementul "+x);
                    
                }else{
                    Exemplu3.list.wait();//consumatorul asteapta ca un producator sa adauge elemente in lista
                }
            }}
        }catch(InterruptedException e){
            e.printStackTrace();
        }
    }
}
