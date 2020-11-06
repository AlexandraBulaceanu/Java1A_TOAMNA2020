public class ExempluParcurgereArray {
    public static void main(String [] args) {
        int[] x = new int[5];
        
        for(int i=0; i<x.length; i++) {
            x[i] = i+1;
        }
        
        for(int elCurent:x) {
            System.out.println(elCurent);
        }
        
    }
}