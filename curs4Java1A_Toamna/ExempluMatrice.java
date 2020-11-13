public class ExempluMatrice {
    public static void main(String [] args) {
        int ma[][];
        ma = new int[4][];
        ma[0] = new int[5];
        ma[1] = new int[7];
        ma[2] = new int[3];
        ma[3] = new int[9];
        
        int valoare = 1;
        for(int i=0;i<ma.length;i++){
            for(int j=0;j<ma[i].length;j++){
                ma[i][j] = valoare;
                valoare++;
            }
        }
        
        for(int[] x:ma){
            for(int y:x){
                //x = array-il curent
                System.out.print(y+" ");
            }
            System.out.println();
        }
        
    }
}