package practice.coffee;

import java.util.Scanner;

public class CoffeeAppl {
    public static void main(String[] args) {
        System.out.println("Welcome to CoffeeShop!");
        // предложить меню для выбора
        Coffee[] menu = Coffee.values();
        for (int i = 0; i < menu.length; i++) {
            System.out.println((i + 1) + " - " + menu[i].getType());
        }

        while(true){
            System.out.println("Input your choice: "); // приглашение пользователю
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt(); // приняли ввод с клавиатуры

            switch (choice) {
                case 1: {
                    System.out.println("Your choice is: " + menu[choice - 1].getType());
                    System.out.println("The price is: " + menu[choice - 1].getPrice());
                    break;
                }
                // раскопировать cases
                default:{
                    System.out.println("Wrong choice.");
                }
            }
        }

    }
}
