public class ExReguliPolimorfism {
    public static void main(String [] args){
        Reptila r1 = new Reptila();
        Crocodil c1 = new Crocodil();
        
        Reptila r = new Crocodil();//polimorfismul
        //Reptila = forma
        //r = referinta de tipul clasei Reptila si arata catre o instanta de Crocodil
        //Crocodil = instanta care se creeaza in memorie, dar ia forma de Reptila
        r.greutate = 100;
        //r.varsta = 6;
        System.out.println(r.temperaturaCorp);//pentru atribute pastreaza valoarea din forma
        r.afisareDenumire();//se apeleaza suprascrierea -> instanta
    }
}