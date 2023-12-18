package family_budget;

import family_budget.dao.BudgetImpl;
import family_budget.model.Menu;
import family_budget.model.Product;
import family_budget.model.Purchase;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BudgetAppl {

    private static final String PATH = "basic_programming/lesson_68/code/family_budget/";

    public static void main(String[] args) {

        List<Purchase> purchaseList = new ArrayList<>(); // может лучше HashSet ???
        List<Product> productList = new ArrayList<>(); // - ОК

        BudgetImpl monthBudget = new BudgetImpl(purchaseList, productList, 0);
        LocalDate now = LocalDate.now();
        String fileName = PATH + "family budget - 2023 - 12.csv";
        int id = 0;
        LocalDate date = now;
        double cost = 0.0;
        String store = "";
        String person = "";
        String prod = "";
        double price = 0.0;
        int quantity = 0;

        while (true) {
            Menu.printMenu();
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1 -> {
                    System.out.println("Input budget amount: ");
                    double m = scanner.nextDouble();
                    monthBudget.addMoney(m);
                    monthBudget.printBudget();
                }
                case 2 -> {
                    // load data
                    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                        String str = br.readLine(); // считали 1-ю строку (названия столбцов)
                        String[] cells = str.split(";"); // разделили на ячейки
                        printCells(cells); // напечатали строку
                        str = br.readLine(); // считали сл. строку с данными в таблице
                        // начало цикла
                        while (str != null) {
                            cells = str.split(";");
                            printCells(cells);
                            // разносим данные по полям объекта purchase
                                id = Integer.parseInt(cells[0]);
                                date = dateParse(cells[1]);
                                cost = Double.parseDouble(cells[2]);
                                store = cells[3];
                                person = cells[4];
                            Purchase purchase = new Purchase(id, date, cost, store, person);
                            purchaseList.add(purchase);
                            str = br.readLine();
                        }

                    } catch (FileNotFoundException e) {
                        throw new RuntimeException(e);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                    double m = monthBudget.calcBudget(purchaseList);
                    System.out.printf("Total spent in current month: %.2f", m);
                    System.out.println();
                }
                case 3 -> {
                    System.out.println("Purchases by Store ");
                    // вызывать метод и распечатать
                    scanner.nextLine();
                    System.out.println("Input store: ");
                    store = scanner.nextLine();
                    double storeBudget = monthBudget.budgetByStore(purchaseList, store);
                    System.out.println("In " + store + " spent: " + storeBudget + " euro.");
                }
                case 4 -> {
                    System.out.println("Purchases by Person");
                    // вызывать метод и распечатать
                    System.out.println("Input person: ");
                    scanner.nextLine();
                    person = scanner.nextLine();
                    System.out.println(person);
                    double personBudget = monthBudget.budgetByPerson(purchaseList, person);
                    System.out.println("The person " + person + " spent: " + personBudget + " euro.");

                }
                case 5 -> {
                    System.out.println("Budget for the period: ");
                    // вызывать метод и распечатать
                    System.out.println("Input date from (yyyy-MM-dd): ");
                    scanner.nextLine();
                    String from = scanner.nextLine();
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate dateFrom = LocalDate.parse(from, formatter);
                    System.out.println("From: " + dateFrom);
                    System.out.println("Input date to (yyyy-MM-dd): ");
                    String to = scanner.nextLine();
                    LocalDate dateTo = LocalDate.parse(to, formatter);
                    System.out.println("To: " + dateTo);
                    double budgetPeriod = monthBudget.budgetByPeriod(dateFrom, dateTo);
                    System.out.println("Budget from " + dateFrom + " to " + dateTo + " : " + budgetPeriod);

                }
                case 6 -> {
                    System.out.println("Cheking...");
                    // вызывать метод и распечатать
                    boolean isEnough = monthBudget.checkBudget(purchaseList);
                    System.out.println("Budget enough: " + isEnough);

                    double money = monthBudget.checkMoney(purchaseList);
                    System.out.printf("Rest of money: %.2f ", money);
                    System.out.println();

                }
                case 7 -> { // exit
                    return;
                }
                default -> {
                    System.out.println("Wrong choice.");
                }

            }
        }

    }

    private static void printCells(String[] cells) {
        for (String s : cells) {
            System.out.print(s + "\t"); // \t - это табуляция
        }
        System.out.println();
    }

    private static LocalDate dateParse(String date) { // строка на входе
        DateTimeFormatter df = DateTimeFormatter.ofPattern("[yyyy-MM-dd][dd/MM/yyyy][dd.MM.yyyy][dd-MM-yyyy][dd:MM:yyyy][dd MM yyyy]"); // определяем как преобразуется строка в дату
        return LocalDate.parse(date, df); // преобразование в дату типа ISO (международный формат даты)
    }
}
