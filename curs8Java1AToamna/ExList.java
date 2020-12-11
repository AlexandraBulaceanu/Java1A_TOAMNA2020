import java.util.*;
public class ExList{
    public static void main(String ... args){
        List<Integer> list = new ArrayList<>();
        list.add(10);//0
        list.add(7);//1
        list.add(7);//2
        list.add(10);//3
        list.add(4);//4
        list.add(20);//5
        System.out.println("Size: "+list.size());
        System.out.println("Empty: "+list.isEmpty());
        System.out.println("Elementul de la pozitia 4: "+list.get(4));
        System.out.println("**************");
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        System.out.println("**************");
        for(Integer x:list){
            System.out.println(x);
        }
        System.out.println("**************");
        Iterator<Integer> iterator = list.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("**************");
        list.forEach(e->System.out.println(e));
        //list.map(e->System.out.println(e));-nu aici
        System.out.println("**************");
        list.remove(3);
        list.remove(new Integer(4));
        list.forEach(System.out::println);
        
    }
}