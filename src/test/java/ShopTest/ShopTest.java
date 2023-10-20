package ShopTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.example.Product;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

public class ShopTest {
    private ShopTest shop;
    private List<Product> products;

    @BeforeEach
    void setUp() {
        shopTest = new ShopTest();
        List<Product> products = new ArrayList<>();
        Product product1 = new Product(150, "Coffee");
        Product product2 = new Product(100, "Tee");
        Product product3 = new Product(80, "Cocoa");
        
        products = new ArrayList<>(Arrays.asList(product1, product2, product3));
        ShopTest.setProducts(products);
        sortProducts = new ArrayList<>(Arrays.asList(product2, product1, product3));
    }

    private static void setProducts(List<Product> products2) {
    }

    @Test
    void testInitialization() {
        assertEquals(4, shop.getProducts().size());
        assertEquals(products, shop.getProducts());
    }

    private List<Product> getProducts() {
        return null;
    }

    @Test
    void testMostExpensiveProduct() {
        assertEquals(product3, shop.testMostExpensiveProduct());
    }

    @Test
    void testSortByPrice() {
        assertEquals(sortProductsByPrice(), shop.sortProductsByPrice());
    }

    private Short sortProductsByPrice() {
        return null;
    }

    
}
