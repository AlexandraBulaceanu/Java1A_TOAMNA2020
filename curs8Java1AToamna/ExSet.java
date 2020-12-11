import java.util.*;
public class ExSet{
    public static void main(String [] args){
        Set<Integer> set = new HashSet<>();
        set.add(12);
        set.add(56);
        set.add(12);
        set.add(64);
        set.forEach(System.out::println);
    }
}