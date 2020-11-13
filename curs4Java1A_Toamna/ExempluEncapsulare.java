public class ExempluEncapsulare {
    public static void main(String args[]) {
        Factura factura = new Factura();
        //factura.platitor = "Marcel";
        factura.setPlatitor("Marcel");
        System.out.println(factura.getPlatitor());
        
        factura.setTotal(5000);
        System.out.println(factura.getTotal());
        
    }
}