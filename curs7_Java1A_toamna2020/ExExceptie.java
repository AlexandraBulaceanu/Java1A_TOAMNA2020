public class ExExceptie{
    public static void main(String [] args){
        System.out.println("se incearca extragerea de numerar");
        extragereNumerar(500);//tema de tratat aceasta exceptie
        //exceptie checked -> nu o sa compileze pana nu tratez/propag
        System.out.println("extragere reusita");
    }
    public static void extragereNumerar(double sumaBani) throws MyCheckedException{
        if(sumaBani > 200){
            MyCheckedException e = new MyCheckedException();
            throw e;//arunc instanta de exceptie, adica semnalez aparitia exceptiei in app
        }
    }
}