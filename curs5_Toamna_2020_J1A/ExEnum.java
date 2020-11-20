public class ExEnum{
    public static void main(String [] args){
        Coffee c1 = Coffee.BIG;
        switch(c1){
            case BIG:
            case EXTRA_LARGE:
                            System.out.println("Incearca sa si dormi!");
                            break;
            case MEDIUM: System.out.println("Consumi o cantitate optima");
                            break;
            case SMALL: System.out.println("Consumi prea putin");
                            break;
            default: System.out.println("Nu exista aceasta optiune");
        }
        
        for(Coffee c:Coffee.values()){
            System.out.println(c+" "+c.ordinal()+" "+c.name());
        }
    }
}