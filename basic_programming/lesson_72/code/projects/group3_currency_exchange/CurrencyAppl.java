package projects.group3_currency_exchange;

import projects.group3_currency_exchange.dao.CurrencyConverter;
import projects.group3_currency_exchange.dao.CurrencyConverterImpl;
import projects.group3_currency_exchange.model.Currency;
import projects.group3_currency_exchange.model.Menu;

import java.util.InputMismatchException;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class CurrencyAppl {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in).useLocale( Locale.US );
        System.out.println( "Welcome to Currency Appl! " );
        CurrencyConverter converter = new CurrencyConverterImpl();
        boolean exitFlag = false;

        while (!exitFlag) {
            Menu.printMenu();
            try{
                int choice = scanner.nextInt();
                scanner.nextLine();

                Menu menuOption = Menu.getMenuByNumber(choice);
                if (menuOption == null) {
                    System.out.println("Invalid choice! Please try again.");
                    continue;
                }

                switch (menuOption) {

                    case LOAD_CURRENCIES:
                        String filePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/Currency .csv";
                        List<Currency> loadedCurrencies = converter.readCurrenciesFromFile(filePath);

                        if (loadedCurrencies.isEmpty()) {
                            System.out.println("No currencies loaded or incorrect file path.");
                        } else {
                            System.out.println("Available currencies:");
                            int i = 1;
                            for (Currency currency : loadedCurrencies) {
                                System.out.println(i + ". " + currency.getCode() + " - Buy rate: " + currency.getRate() + ", Sell rate: " + currency.getSellRate());
                                i++;
                            }
                        }
                        break;
                    case BUY_CURRENCY:
                        System.out.print("Enter currency code: ");
                        String buyCurrencyCode = scanner.nextLine().toUpperCase();
                        System.out.print("Enter amount: ");
                        double buyAmount = scanner.nextDouble();
                        scanner.nextLine();
                        converter.buyCurrency(buyCurrencyCode, buyAmount);
                        break;

                    case SELL_CURRENCY:
                        System.out.print("Enter currency code: ");
                        String sellCurrencyCode = scanner.nextLine().toUpperCase();
                        System.out.print("Enter amount: ");
                        double sellAmount = scanner.nextDouble();
                        scanner.nextLine();
                        converter.sellCurrency(sellCurrencyCode, sellAmount);
                        break;
                    case REPORT:
                        String defaultReportFilePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/transaktion.txt";
                        converter.saveTransactionsToFile(null, defaultReportFilePath);
                        System.out.println("Transactions saved to default 'transaktion.txt' file.");
                        break;

                    case EXIT:
                        System.out.println("Exiting...");
                        exitFlag = true;
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                        break;
                }

            }catch (InputMismatchException e) {
                System.out.println("Invalid input! Please enter a valid choice.");
                scanner.nextLine();
            }
        }
    }
}
