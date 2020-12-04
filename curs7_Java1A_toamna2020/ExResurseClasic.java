public class ExResurseClasic{
    public static void main(String [] args){
        Door d1 = null;
        Door d2 = null;
        try{
            d1 = new Door();
            d2 = new Door();
            //folosim resura
        }catch(Exception e){
            //tratam exceptia ce ar aparea
        }finally{
            if(d1!=null){
                d1.close();
            }
            if(d2!=null){
                d2.close();
            }
            
        }
    }
}