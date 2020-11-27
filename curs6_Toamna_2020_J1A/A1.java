public class A1 {
    //A1 clasa top-level
    int x;
    private static int y;
    
    public class A2 {
        //clasa inner non-statica pt A1 -> A1 este clasa outer pentru clasa A2
        int x;
        public void m1() {
            this.x = 10;
            A1.this.x = 20; //daca accesez atribut cu ac nume -> Outer.this.atribut
        }
    }
    public static class A3 {
        //clasa A3 inner statica
        //clasa A1 este tot clasa outer pentru A3
        //x = 10; -> x e non-static => nu e accesibil din inner static
        int y;
        public void m2() {
            //A1.this.y = 45;
            y = 45; //y = static declarat
            A1.y = 60;
        }
    }
    

}