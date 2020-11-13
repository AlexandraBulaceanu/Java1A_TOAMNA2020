public class Cerc extends Punct {
    double raza;//adaugare de atribute
    String x;//ascundere de atribut(hiding fields)
    
    public Cerc() {
        this(2.4);
    }
    
    public Cerc(double raza) {
        super(2,3);
        this.raza = raza;
        super.x = 10;
        this.x = "Buna";
        super.y = 14;
        this.y = 14;
        //this.x = 10;-> am ascuns int-ul
        //super.raza = 9.8;
    }
    
    public Cerc(int x, int y, double raza) {
        super(x,y);
    }
    
    public double getArie() {
        //adaugare de comportament
        return 3.14*this.raza*this.raza;
    }
    public double getLungime() {
        return 2*3.14*this.raza;
    }
}

