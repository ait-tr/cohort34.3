package practice.supermarket;

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

        for (Product product : myMarket) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Products from category Bread:");
        Iterable<Product> res = myMarket.findByCategory("Bread");
        for (Product product : res) {
            System.out.println(product);
        }
        System.out.println();

        System.out.println("Products with expired date:");
        res = myMarket.findProductWithExpDate();

        for (Product product : res) {
            System.out.println(product);
        }
        System.out.println();
    }
}
