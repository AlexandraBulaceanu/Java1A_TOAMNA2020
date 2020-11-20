public class ExPrototipuriAbstracte{
    public static void main(String [] args){
        //Forma f = new Forma(); ->nu am voie sa instantiez in mod direct
        Forma f1 = new Dreptunghi();
        System.out.println(f1.getArie());
        
        Forma[] v = new Forma[5];
        v[0] = new Dreptunghi();
        v[1] = new Patrat();
        //am putut sa fac acest lucru datorita polimorfismului
    }
}

