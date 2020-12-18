import java.util.*;
public class ExMap{
    public static void main(String [] args){
        Map<Integer,String> map = new HashMap<>();
        map.put(2,"rosu");
        map.put(4,"albastru");
        map.put(3,"mov");
        map.put(4,"maro");
        map.put(6,"verde");
        Set<Integer> keys = map.keySet();//setul de chei
        for(Integer k:keys){
            System.out.println(k+" "+map.get(k));//iterez prin map
        }
        System.out.println("============");
        map.forEach((k,v)->System.out.println(k+" "+v));
        
        List<Integer> list = Arrays.asList(5,6,4,9,2);
        List<Integer> list2 = List.of(5,7,8,9,10);//J9
        var list3 = new ArrayList<Integer>();//J10
        //list3 = new ArrayList<String>();
       /* String multi = """   Sir
            pe mai multe
            linii
        """";*/ //J15
    }
}