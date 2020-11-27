public class C1 {
    int x;
    static int y;
    public void m1(int k){
        int q = 12;
        class C2 {
            //clasa locala in context non-static
            //nu pot sa am mod de acces
            //poate sa fie instantiata doar in interiorul metodei in care a fost definita
            //x = 10;
            public void m2() {
                System.out.println(q);
                //q = 10;
                //k = 3;
            }
        }
       // q = 5;
    }
    public static void m3() {
        class C3 {
            //clasa locala in context static
            public void m4() {
                
            }
        }
    }
}