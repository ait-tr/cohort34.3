package homework.supermarket_with_test.test;

import homework.supermarket_with_test.dao.Supermarket;
import homework.supermarket_with_test.dao.SupermarketImpl;
import homework.supermarket_with_test.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SupermarketImplTest {

    Supermarket myMarket;
    Product[] products;
    LocalDate now = LocalDate.now();


    @BeforeEach
    void setUp() {
        myMarket = new SupermarketImpl();
        products = new Product[5];
        products[0] = new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5));
        products[1] = new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3));
        products[2] = new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50));
        products[3] = new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85));
        products[4] = new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        for (int i = 0; i < products.length; i++) {
            myMarket.addProduct(products[i]);
        }
    }

    @Test
    void addProductTest() {
        assertFalse(myMarket.addProduct(null));
        assertFalse(myMarket.addProduct(products[3]));
        Product product1 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(myMarket.addProduct(product1));
        assertEquals(6, myMarket.skuQuantity());
        Product product2 = new Product(666666, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertFalse(myMarket.addProduct(product2)); // с одиноковым баркодом
        Product product3 = new Product(777777, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25));
        assertTrue(myMarket.addProduct(product3));

    }

    @Test
    void removeProductTest() {
        assertEquals(products[1], myMarket.removeProduct(222222));
        assertEquals(4, myMarket.skuQuantity());
        assertNull(myMarket.removeProduct(222222)); // дважды не можем удалить
        assertNull(myMarket.removeProduct(222222));
    }

    @Test
    void findByBarCodeTest() {
        assertEquals(products[1], myMarket.findByBarCode(222222));
        assertNull(myMarket.findByBarCode(888888));
    }

    @Test
    void findByBrandTest() {
        ArrayList<Product> actual = (ArrayList<Product>) myMarket.findByCategory("bread");
        // надо перенести actual в массив
        int l = actual.size(); // определил длину массива
        Product[] productsActual = new Product[l];  // создал массив элементов типа Product длины l
        // заполнил созданный массив
        for (int i = 0; i < l; i++) {
            productsActual[i] = actual.get(i);
        }
        Product[] expected = {products[0], products[4]}; //
        assertArrayEquals(expected, productsActual);
    }

    @Test
    void findByCategoryTest() {
        // по аналогии с findByBrandTest

    }
    @Test
    void findProductsWithExpiredDateTest() {
        // по аналогии с findByBrandTest

    }

    @Test
    void skuQuantityTest() {
        assertEquals(5, myMarket.skuQuantity());
    }
}