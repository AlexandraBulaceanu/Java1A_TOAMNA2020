public class ExempluInner {
    public static void main(String [] args) {
        A1.A3 a3 = new A1.A3();
        A1 a1 = new A1();//intanta clasei outer
        A1.A2 a2 = a1.new A2();//instanta a2 este a clasei inner non-statice A2
        //a2 apartine instantei de a1
        
        System.out.println(a1.x);
        a2.m1();
        System.out.println(a1.x);
        //se comporta a2 -> se modifica a1
        
    }
}