package family_budget.tests;

import family_budget.dao.BudgetImpl;
import family_budget.model.Product;
import family_budget.model.Purchase;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BudgetImplTest {
    List<Purchase> purchaseList = new ArrayList<>();
    List<Product> productList = new ArrayList<>();
    List<Product> productList2 = new ArrayList<>();
    List<Product> productList3 = new ArrayList<>();

    BudgetImpl budget = new BudgetImpl(purchaseList ,0);

    @BeforeEach
    void setUp() {
        productList = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bred", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 3)
        );
        productList2 = List.of(
                new Product("milk", 1.0, 2),
                new Product("wine", 3.0, 1),
                new Product("bred", 1.5, 3)
        );
        productList3 = List.of(
                new Product("bred", 1.5, 3),
                new Product("chocolate", 0.5, 2),
                new Product("salt", 1, 3)
        );
        purchaseList = List.of(
                new Purchase(1, LocalDate.of(2023,12,01), 100, "Lidl", "Mama", productList),
                new Purchase(2, LocalDate.of(2023,10,11), 150, "Aldi", "Mama", productList2),
                new Purchase(3, LocalDate.of(2023,2,01), 50, "Penny", "Mama", productList),
                new Purchase(4, LocalDate.of(2023,12,12), 100, "Action", "Tolik", productList3)
        );
        for (Purchase p : purchaseList) {
            budget.addPurchase(p); //заполняем бюджет
        }
        double b = budget.calcBudget();
        System.out.println(b);
    }

    @Test
    void addPurchase() {
        assertFalse(budget.addPurchase(null));
        assertFalse(budget.addPurchase(purchaseList.get(0)));
        Purchase p = new Purchase(5, LocalDate.of(2023,10,11), 150, "Aldi", "Mama", productList2);
        assertTrue(budget.addPurchase(p));
        double b = budget.calcBudget();
        System.out.println(b);
    }

    @Test
    void calcBudget() {
    }

    @Test
    void budgetByPerson() {
    }

    @Test
    void budgetByStore() {
    }

    @Test
    void budgetByPeriod() {
    }

    @Test
    void addMoney() {
    }

    @Test
    void checkBudget() {
    }

    @Test
    void checkMoney() {
    }
}