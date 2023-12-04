package consultation.supermarket_2.test;

import consultation.supermarket_2.dao.SuperMarket;
import consultation.supermarket_2.dao.SuperMarketSetImpl;
import consultation.supermarket_2.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class SuperMarketSetImplTest {

    SuperMarket rewe;
    LocalDate now;

    @BeforeEach
    void setUp() {
        now= LocalDate.now();
        rewe = new SuperMarketSetImpl();
        rewe.addProduct(new Product(10000000,"N1","C1","B1",1.10,now.minusDays(1)));
        rewe.addProduct(new Product(20000000,"N2","C1","B2",1.30,now.plusDays(0)));
        rewe.addProduct(new Product(30000000,"N3","C2","B2",5.70,now.plusDays(14)));
        rewe.addProduct(new Product(40000000,"N4","C3","B3",13.30,now.plusDays(7)));

//        rewe.forEach(s-> System.out.println(s));
//        System.out.println();

    }

    @Test
    void addProduct() {
        rewe.addProduct(new Product(0,"","","",0,null));
        assertFalse(rewe.addProduct(null));
        assertFalse(rewe.addProduct(new Product(10000000,"N14","C11","B12",2.10,now.minusDays(2))));
        //rewe.forEach(s-> System.out.println(s));
        System.out.println();
    }

    @Test
    void removeProduct() {
    }

    @Test
    void findByBarCode() {
    }

    @Test
    void findByCategory() {
    }

    @Test
    void findByBrand() {
    }

    @Test
    void findProductWithExpDate() {
    }

    @Test
    void skuQuantity() {
    }
}