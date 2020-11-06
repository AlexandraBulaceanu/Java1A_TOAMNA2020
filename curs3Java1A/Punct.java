public class Punct {
    int x;
    int y;
    static int z;
    
    Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    //comportament pt calcularea distantei intre 2 puncte
    double getDistance(Punct p) {
        //this, p ->cele 2 puncte( this-> punctul din care dereferentiez metoda, iar p este parametru)
        double rez = Math.sqrt((this.x-p.x)*(this.x-p.x)+(this.y-p.y)*(this.y-p.y));
        return rez;
    }
    
    static void afisareZ() {
        //System.out.println(this.x); -> nu pot sa folosesc nimic ce tine de instanta(non-static)
        System.out.println(z);
    }
}