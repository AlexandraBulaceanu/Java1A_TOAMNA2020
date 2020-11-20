public enum Coffee{
    SMALL, MEDIUM(150), BIG, EXTRA_LARGE(500);
    
    private int qty;
    
    Coffee(){}
    Coffee(int qty){
        this.qty = qty;
    }
    
    public void afisareQty(){
        System.out.println(qty);
    }
}