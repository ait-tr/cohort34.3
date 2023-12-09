package homework.supermarket_with_test;

import homework.supermarket_with_test.dao.Supermarket;
import homework.supermarket_with_test.dao.SupermarketImpl;
import homework.supermarket_with_test.model.Product;

import java.time.LocalDate;

public class SupermarketAppl {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();

        Supermarket myMarket = new SupermarketImpl();

        myMarket.addProduct(new Product(111111, "White Bread", "Bread", "Kolosok", 6.5, now.plusDays(5)));
        myMarket.addProduct(new Product(222222, "ChokoMilk", "Dairy", "MilkLand", 13, now.minusDays(3)));
        myMarket.addProduct(new Product(333333, "Cheese Gauda", "Dairy", "Farmer", 22.5, now.plusDays(50)));
        myMarket.addProduct(new Product(444444, "Cheese Chedder", "Dairy", "MilkLand", 30, now.plusDays(85)));
        myMarket.addProduct(new Product(555555, "Sweet Buns", "Bread", "Kolosok", 18.3, now.minusDays(25)));

        for (Product p : myMarket) {
            System.out.println(p);
        }
        System.out.println();

        System.out.println("Products by Brand: ");
        Iterable<Product> res = myMarket.findByBrand("Milkland");
        for (Product p : res) {
            System.out.println(p);
        }

        System.out.println("Products by Category: ");
        res = myMarket.findByCategory("bread");
        System.out.println(res);

        System.out.println("Products with expired date: ");
        res = myMarket.findProductsWithExpiredDate();
        for (Product p : res) {
            System.out.println(p);
        }
    }
}
