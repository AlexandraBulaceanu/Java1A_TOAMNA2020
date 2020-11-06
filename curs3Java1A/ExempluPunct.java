public class ExempluPunct {
    public static void main(String [] args) {
        Punct p1 = new Punct(1,0);
        Punct p2 = new Punct(0,1);
        
        double r = p1.getDistance(p2);
        System.out.println(r);
        
        p1.z = 10;
        p2.z = 40;
        Punct.z = 50;
        System.out.println(p1.z);
        System.out.println(p2.z);
        System.out.println(Punct.z);
    }
}