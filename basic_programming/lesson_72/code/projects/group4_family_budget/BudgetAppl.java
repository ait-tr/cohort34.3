package projects.group4_family_budget;

import projects.group4_family_budget.dao.BudgetImpl;
import projects.group4_family_budget.model.Menu;
import projects.group4_family_budget.model.Product;
import projects.group4_family_budget.model.Purchase;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class BudgetAppl {
    private static final String SAVE_PATH = "family_budget/Family-budget.csv";
    public static void main(String[] args) throws IOException {
        AtomicInteger idCounter = new AtomicInteger(1);//автоматический счетчик покупок
        List<Purchase> purchaseList = new ArrayList<>();
        List<Product>productList = new ArrayList<>();

        BudgetImpl budget = new BudgetImpl(purchaseList, 0);
        LocalDate now = LocalDate.now();

        BufferedReader br=new BufferedReader(new FileReader("family_budget/products.csv"));
        String str=br.readLine();
        String[] family=str.split(",");
        str= br.readLine();
        // распечатать
        while (str!=null) {
            family = str.split(",");
            str = br.readLine();
            Product purchase = new Product(
                    family[0],
                    Double.parseDouble(family[1]),
                    Integer.parseInt(family[2])
            ); // Assuming you have a List<Product> in your Purchase class
            productList.add(purchase);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println(" - Welcome to Family Budget Application - ");
        System.out.println(" - Enter month of purchase- ");
        try {
            String month = scanner.next();
            System.out.println("Input your budget amount: ");
            double budg = scanner.nextDouble();
            budget = new BudgetImpl(purchaseList, budg);
            System.out.println("Your budget for month " + month + " is: " + budg);
            while (true) {
                Menu.printMenu();
                System.out.println("Input your choice: ");
                int choice = scanner.nextInt();
                switch (choice) {
                    case 1 -> {//View of purchases
                        System.out.println("Your purchases for " + month);
                        budget.print();
                    }
                    case 2 -> {//Load new purchases
                        productList.forEach(System.out::println);
                        System.out.println(" Enter your Name: ");
                        String person = scanner.next();
                        System.out.println("Please enter the name of the store: ");
                        String store = scanner.next();
                        System.out.println("Enter name of Product:");
                        String product = scanner.next();
                        System.out.println();
                        double totalCost = getCost(productList, product);
                        List<Product> products = findProduct(productList, product);
                        budget.addPurchase(new Purchase(idCounter.getAndIncrement(), now, totalCost, store, person, products));
                        budget.print();
                    }
                    case 3 -> { //Remove purchase
                        budget.print();
                        System.out.println("Enter your purchase number to remove:");
                        int num = scanner.nextInt();
                        budget.removePurchase(num);
                        budget.print();
                    }
                    case 4 -> {//Searching purchases by store
                        System.out.print("Enter the store:");
                        String store = scanner.next();
                        purchaseList = budget.sortByStore(store);
                        purchaseList.forEach(System.out::println);
                        System.out.println("You spend " + budget.budgetByStore(store) + " by " + store);
                    }
                    case 5 -> {//Searching purchases by person
                        System.out.print("Enter your Name:");
                        String person = scanner.next();
                        purchaseList = budget.sortByPerson(person);
                        purchaseList.forEach(System.out::println);
                        System.out.println(person + " spend: " + budget.budgetGetPerson(person));
                    }
                    case 6 -> {//Searching purchases by period
                        System.out.print(" \nВведите Date From(yyyy-MM-dd):");
                        String startDay = scanner.next();
                        System.out.print(" \nВведите Date To(yyyy-MM-dd):");
                        String endDay = scanner.next();
                        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate dateFrom = LocalDate.parse(startDay, dateFormat);
                        LocalDate dateTo = LocalDate.parse(endDay, dateFormat);
                        purchaseList = budget.sortByPeriod(dateFrom, dateTo);
                        purchaseList.forEach(System.out::println);
                    }
                    case 7 -> {//Check your current budget
                        double currentBudget = budget.checkBudget();
                        System.out.println("Your budget for " + month + " : " + currentBudget);
                    }
                    case 8 -> {//Exit
                        savePurchases(budget.collect());
                        System.out.println(" - Good Bye! - ");
                        System.exit(0);
                    }
                    default -> {
                        System.out.println("Wrong choice");
                    }
                }
            }
        }catch(Exception e){
            System.out.println("Wrong input");
        }
    }
    private static void savePurchases(List<Purchase> purchases){
        try (PrintWriter writer = new PrintWriter(new FileWriter(SAVE_PATH, true))) {
            writer.println("Purchases: ");
            for (Purchase p :purchases){
                writer.printf("Number: %s, Date: %s, Price: %.2f, Store: %s, Person: %s, Products: %s%n",
                        p.getId(), p.getData(), p.getTotalCost(),
                        p.getStore(), p.getPerson(), p.getProducts());
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error saving purchases to file.");
        }
    }
    private static double getCost(List<Product> productList,String product) {
        double price= productList.stream().filter(product1 -> product1.getProduct().equalsIgnoreCase(product)).mapToDouble(Product::getPrice).sum();
        double quant= productList.stream().filter(product1 -> product1.getProduct().equalsIgnoreCase(product)).mapToDouble(Product::getQuantity).sum();
        return price*quant;
    }
    private static List<Product> findProduct(List<Product> productList, String product) {
        return productList.stream().filter(product1 -> product1.getProduct().equalsIgnoreCase(product)).collect(Collectors.toList());
    }
}
