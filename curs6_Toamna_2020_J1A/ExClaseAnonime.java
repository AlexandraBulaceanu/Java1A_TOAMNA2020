public class ExClaseAnonime {
    public static void main(String [] args) {
        Angajat a1 = new Angajat(1000,6,"Vadim");
        Angajat a2 = new Angajat(1000,3,"Dima");
        Angajat a3 = new Angajat(1000,1,"Marian"){
            @Override
            public double calculeazaSalariu(){
                return 2000;
            }
        };//fiul patronului
        System.out.println(a1.calculeazaSalariu());
        System.out.println(a2.calculeazaSalariu());
        System.out.println(a3.calculeazaSalariu());
        
        Instrument i = new Instrument(){
            @Override
            public void play(){
                
            }
        };
        
        Instrument i2 = () -> {};
    }
}