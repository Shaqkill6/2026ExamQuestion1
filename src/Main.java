//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
String[] products = {" Cozy Nights Monarch", "Restonic Barbados mattress", "Sealy Phuket mattress"};
int[][]sales = new int[3][3];
    Scanner input = new Scanner(System.in);
    //User inputs
    for (int i=0;i<3;i++){
        for (int j=0;j<3;j++){
            System.out.print("Enter number of sales for month" + (j+1) + "for" +products[i] + " mattress: ");
            sales[i][j] = input.nextInt();
        }
        System.out.println();
    }

    //Logic
    Product product = new Product(sales,products);
        int total = product.GetTotalProductSold();
        double average = product.GetAverageProductSold();
        String popular =product.GetMostPopularProduct();

        //Print Sales Report
    PrintProduct print = new PrintProduct();
    print.PrintReport(total,average,popular);
}
