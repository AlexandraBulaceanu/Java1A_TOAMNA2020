import java.util.*;
public class ExTreeSet {
    public static void main(String [] args){
        Comparator<Persoana> c = new Comparator<Persoana>(){
            public int compare(Persoana p1, Persoana p2){
                return p1.nume.compareToIgnoreCase(p2.nume);
            }
        };
        
        TreeSet<Persoana> set  = new TreeSet<>();
        TreeSet<Persoana> set2 = new TreeSet<>(c);
        TreeSet<Persoana> set3 = new TreeSet<>((p1,p2)->p1.nume.compareTo(p2.nume));
        set.add(new Persoana("Popescu",45));
        set.add(new Persoana("Ionescu",20));
        set.add(new Persoana("Georgescu",23));
        set.add(new Persoana("Protopescu",15));
        set2.add(new Persoana("Popescu",45));
        set2.add(new Persoana("Ionescu",20));
        set2.add(new Persoana("Georgescu",23));
        set2.add(new Persoana("Protopescu",15));
        set3.add(new Persoana("Popescu",45));
        set3.add(new Persoana("Ionescu",20));
        set3.add(new Persoana("Georgescu",23));
        set3.add(new Persoana("popescu",15));
        set.forEach(System.out::println);
        System.out.println("============");
        set2.forEach(System.out::println);
        System.out.println("============");
        set3.forEach(System.out::println);
    }
}