public class PrintProduct {
    public void PrintReport(int totalProduct, double averageProduct, String popularProduct){
        System.out.println("PRODUCT SALES REPORT - 2026");
        System.out.println();
        System.out.println("*************************************************************");
        System.out.println("TOTAL PRODUCT SALES: " + totalProduct);
        System.out.printf("AVERAGE PRODUCT SALES:  %.0f%n" , averageProduct);
        System.out.println("MOST POPULAR PRODUCT: " + popularProduct);
    }
}
