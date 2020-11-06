public class ExempluArrayObiecte {
    public static void main(String [] args) {
        Punct[] p = new Punct[5];
        
        for(int i=0;i<5;i++) {
            p[i] = new Punct(i,i+1);
        }
        for(int i=0;i<p.length;i++) {
            System.out.println(p[i].x+" "+p[i].y);
        }
    }
}