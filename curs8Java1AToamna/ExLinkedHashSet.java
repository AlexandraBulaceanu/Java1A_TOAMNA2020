import java.util.*;
public class ExLinkedHashSet{ 
    public static void main(String [] args){
        Set<Integer> set = new LinkedHashSet<>();
        set.add(12);
        set.add(56);
        set.add(12);
        set.add(64);
        set.forEach(System.out::println);
    }
}
