public class ExempluIfSiOperatori {
    public static void main(String [] args){
        int h1 = 5, m1 = 30, s1 = 20;
        int h2 = 6, m2 = 40, s2 = 40;
        
        if(s1+s2>=60) {
            m1++;
            s1+=s2-60;//s1 = s1+s2-60;
        } else {
            s1+=s2;//s1 = s1+s2;
        }
        
        if(m1+m2>=60) {
            m1+=m2-60;
            h1++;
        } else {
            m1+=m2;
        }
        
        h1+=h2;//rezultatul adunarii lui h1 cu h2 se salveaza in h1
        
        System.out.println(h1+" "+m1+" "+s1);
        
        //exemplu pentru operatorul ternar (elvis)
        int a=5, b=10;
        int c = a>b ? 4 : 6;
        System.out.println(c);
    }
}