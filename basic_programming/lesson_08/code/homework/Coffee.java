package homework;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Drink name and Price ( Espresso, Americano, Latte, Cappuccino): ");

        String drink = scanner.next();

        switch (drink) {
            case "Espresso" -> System.out.println("2,2,90Euro");
            case "Americano" -> System.out.println("2,50Euro");
            case "Latte" -> System.out.println("2,70Euro");
            case "Cappuccino" -> System.out.println("3,20Euro");
            default -> System.out.println(" Not Available!");
        }
    }
}