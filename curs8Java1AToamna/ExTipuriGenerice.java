public class ExTipuriGenerice{
    public static void main(String [] args){
        Cutie c1;
        
        Cutie<?> c2;
        Cutie<Integer> c3;
        Cutie<Number> c4;
        Cutie<? extends Number> c5;
        Cutie<? super Integer> c6;
        
        c2 = new Cutie();//backwards compatibility -> Object
        c2 = new Cutie<Integer>();//instanta o sa aiba atribut de tip Integer
        //c2 = new Cutie<int>();
        c2 = new Cutie<int[]>();//tip referinta
        c3 = new Cutie<Integer>();
        c3 = new Cutie<>();//sintaxa Diamond
        c3 = new Cutie();
        //c4 = new Cutie<Integer>();
        c4 = new Cutie<Number>();
        c5 = new Cutie<Number>();
        c5 = new Cutie<Integer>();
        c6 = new Cutie<Integer>();
        c6 = new Cutie<Object>();
        
    }
}