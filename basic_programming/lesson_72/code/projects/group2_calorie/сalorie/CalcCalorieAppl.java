package projects.group2_calorie.сalorie;


import projects.group2_calorie.сalorie.dao.Calorie;
import projects.group2_calorie.сalorie.dao.CalorieImpl;
import projects.group2_calorie.сalorie.model.Menu;
import projects.group2_calorie.сalorie.model.Product;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalcCalorieAppl {

    public static void main(String[] args) {
        Calorie calorie = new CalorieImpl();
        List<Product> userProducts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        boolean exit = false;
        while (!exit) {
            Menu.printMenu();
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1: {
                    List<Product> libraryFood = calorie.readProductsFromCSV();// список продуктов

                    if (libraryFood != null) {
                        System.out.println("Input date (YYYY-MM-DD-HH): ");
                        String dateString = scanner.nextLine();
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd-HH");

                        try {
                            LocalDateTime dateTime = LocalDateTime.parse(dateString, formatter);

                            System.out.println("Input your food: ");
                            String food = scanner.nextLine().toUpperCase();
                            System.out.println("Input how many grams: ");
                            int gram = scanner.nextInt();
                            calorie.addProduct(libraryFood, userProducts, food, gram, dateTime);
                            scanner.nextLine(); // consume the newline character
                        } catch (DateTimeParseException e) {
                            System.out.println("Invalid date format. Please enter a valid date and time.");
                        }
                    } else {
                        System.out.println("Error loading libraryFood. Please check your data.");
                    }

                    break;
                }
                case 2: {
                    userProducts.forEach(System.out::println);
                    // TODO No.1 Total calorie
                    int totalCalorie = userProducts.stream().mapToInt(p -> p.getCalorie()).sum();
                    System.out.println("The total amount of calories you ate:  "+ totalCalorie);

                    break;
                }
                case 3: {
                    System.out.println("Input the product to remove:");
                    String productToRemove = scanner.nextLine().toUpperCase();
                    calorie.removeProduct(productToRemove);
                    System.out.println("The product is successfully removed");
                    break;
                }
                case 4: {
                    calorie.saveFood(userProducts);
                    break;
                }
                case 5: {
                    userProducts = calorie.loadFood();
                    break;
                }
                case 6: {
                    exit = true;
                    break;
                }
                default:
                    System.out.println("Invalid choice. Please enter a valid menu option.");
            }
        }
    }
}
