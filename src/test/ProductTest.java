import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
@Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue(){
    int[][] testData = {{25,18,20}, {15,10,12},{18,15,20}};
    String[] names = {"A","B","C"};
    
    Product p = new Product( testData, names);
    
    assertEquals(153,p.GetTotalProductSold());
}
@Test
    public void GetAverageSales_With_Valid_Data_ReturnsCorrectValue(){
    int[][] testData = {{25,18,20}, {15,10,12},{18,15,20}};
    String[] names = {"A","B","C"};
    Product p = new Product( testData, names);
    assertEquals(17,p.GetAverageProductSold(),0.0);
}
    
}