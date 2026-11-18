public class Product implements IProduct{
    private int[][] salesData;
    private String[] productNames;

    public Product(int[][]salesData, String[] productNames){
        this.salesData = salesData;
        this.productNames = productNames;
    }

    @Override
    public int GetTotalProductSold() {
        int total=0;
        for (int i=0;i< salesData.length;i++){
            for (int j=0;j< salesData[i].length;j++){
                total+=salesData[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total= GetTotalProductSold();
        //3 products * 3 months = Total
        //Total / 9
        return Math.round((double) total / (salesData.length * salesData[0].length));
    }

    @Override
    public String GetMostPopularProduct() {
        int maxSale = -1;
        String mostPopular = "";

        for (int i=0;i< salesData.length;i++){
            for (int j=0;j< salesData[i].length;j++) {
                if (salesData[i][j]>maxSale){
                    maxSale = salesData[i][j];
                    mostPopular = productNames[i];
                }
            }
            }
        return mostPopular +"("+maxSale+")";
    }
}
