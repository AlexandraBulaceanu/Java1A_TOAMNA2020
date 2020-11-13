public class Factura {
    //clasa encapsulata
    private String platitor;
    private double total;
    private boolean platita;
    
    public String getPlatitor() {
        return this.platitor;
    }
    public void setPlatitor(String platitor) {
        this.platitor = platitor;
    }
    
    public double getTotal() {
        return this.total; //obtinerea valorii atributului
    }
    public void setTotal(double total) {
        if(total > 0)
         this.total = total; //setarea/modificarea valorii atributului
        else System.out.println("Total invalid! Introdu o valoare pozitiva");
    }
    
    public boolean isPlatita() {
        return this.platita;
    }
    public void setPlatita(boolean platita) {
        this.platita = platita;
    }
    
}