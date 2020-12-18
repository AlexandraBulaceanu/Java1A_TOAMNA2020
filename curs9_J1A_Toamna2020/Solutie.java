/**
 * Un magazin contine mai multe produse. Maxiumul de produse continut de magazin este de 20.
 * Se va face o exceptie PreaMulteProduseException daca se depaseste aceasta limita. Produsele
 * pot fi ciocolata sau bere. Un produs are un nume si un pret. O ciocolata este un produs cu un 
 * numar de kcal, iar berea este un produs cu procent de alcool.
 * Utilizatorul poate sa dea urmatoarele comenzi de la tastatura (se considera corecte comenizile):
 * adaugaCioco nume pret kcal
 * adaugaBere nume pret pa
 * afisare
 * afisareCioco
 * sterge nume
 * exit
 */
import java.util.*;
public class Solutie{
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.println("Comanda: ");
            String cmd = scanner.nextLine();
            String [] cuv = cmd.split("\\s+");//vector de cuvinte, separarea a fost facuta dupa spatii
            switch(cuv[0]) {
                case "exit": System.out.println("Se inchide app");
                             System.exit(0);
                case "adaugaCioco": Ciocolata c = new Ciocolata();
                                    c.nume = cuv[1];
                                    c.pret = Double.parseDouble(cuv[2]);
                                    c.kcal = Integer.parseInt(cuv[3]);
                                    Magazin.getInstance().adaugaProdus(c);
                                    System.out.println("A fost adaugata o ciocolata!");
                                    break;
                case "adaugaBere":  Bere b = new Bere();
                                    b.nume = cuv[1];
                                    b.pret = Double.parseDouble(cuv[2]);
                                    b.pa = Double.parseDouble(cuv[3]);
                                    Magazin.getInstance().adaugaProdus(b);
                                    System.out.println("A fost adaugata o bere!");
                                    break;
                
                case "afisare":     Magazin.getInstance().afisareProduse();
                                    break;
                case "afisareCioco": Magazin.getInstance().afisareCioco();
                                     break;
                case "sterge":       Magazin.getInstance().sterge(cuv[1]);
                                     System.out.println("Produsul a fost sters!");
            }
        }
    }
}