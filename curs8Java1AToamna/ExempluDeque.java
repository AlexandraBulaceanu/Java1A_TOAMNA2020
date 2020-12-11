import java.util.*;
public class ExempluDeque{
    public static void main(String [] args){
        ArrayDeque<Integer> deq = new ArrayDeque<>();
        deq.push(12);//adaug valoarea 12 la inceput
        deq.offer(23);//adauga la final elementul 23
        deq.poll();//eliminare a elem de inceput si returneaza elem(daca nu are elem -> null)
        deq.pop();//eliminare a elem de inceput si returneaza elem(daca nu are elem -> exceptie)
        deq.peek();//ia primul elem si returnez
        //coada->FIFO(FIRST IN FIRST OUT)-> offer+ pop
        //stiva->LIFO(LAST IN FIRST OUT) -> push + pop
    }
}