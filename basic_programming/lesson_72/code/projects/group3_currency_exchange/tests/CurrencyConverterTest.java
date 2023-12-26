package projects.group3_currency_exchange.tests;

import org.junit.jupiter.api.Test;
import projects.group3_currency_exchange.dao.CurrencyConverterImpl;
import projects.group3_currency_exchange.model.Currency;

import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class CurrencyConverterTest {

    @Test
    void readCurrenciesFromFile() {
        CurrencyConverterImpl converter = new CurrencyConverterImpl();
        String filePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/Currency .csv"; // Путь к вашему тестовому файлу

        // Вызов метода чтения из файла
        assertTrue(new File(filePath).exists()); // Убедимся, что файл для теста существует

        int expectedCurrenciesCount = 12; // Ожидаемое количество валют в файле
        int actualCurrenciesCount = converter.readCurrenciesFromFile(filePath).size();

        assertEquals(expectedCurrenciesCount, actualCurrenciesCount, "Incorrect number of currencies read");
    }

    @Test
    void buyCurrency() {
        CurrencyConverterImpl converter = new CurrencyConverterImpl();
        String filePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/Currency .csv";

        List<Currency> currencies = converter.readCurrenciesFromFile(filePath);
        assertFalse(currencies.isEmpty());

        // Проверка покупки валюты, когда валюта не найдена
        String nonExistingCurrency = "XYZ";
        double amount = 10.0;
        assertThrows(IllegalArgumentException.class, () -> converter.buyCurrency(nonExistingCurrency, amount));
    }

    @Test
    void sellCurrency() {
        CurrencyConverterImpl converter = new CurrencyConverterImpl();
        String filePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/Currency .csv";

        List<Currency> currencies = converter.readCurrenciesFromFile(filePath);
        assertFalse(currencies.isEmpty());

        // Проверка продажи валюты, когда валюта не найдена
        String nonExistingCurrency = "XYZ";
        double amount = 10.0;
        assertThrows(IllegalArgumentException.class, () -> converter.sellCurrency(nonExistingCurrency, amount));
    }

    @Test
    void saveTransactionsToFile() {
        CurrencyConverterImpl converter = new CurrencyConverterImpl();

        // Наполняем тестовые транзакции
        converter.buyCurrency("BTC", 0.1);
        converter.sellCurrency("ETH", 5.0);

        String testFilePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/test_transactions.txt"; // Файл для теста

        // Вызов метода сохранения в файл
        converter.saveTransactionsToFile(null, testFilePath); // Передаем null, так как transactions уже заполнен в методе

        // Проверяем, что файл был создан
        assertTrue(new File(testFilePath).exists(), "File was not created");

    }
}
