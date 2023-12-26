package projects.group3_currency_exchange.dao;

import projects.group3_currency_exchange.dao.CurrencyConverter;
import projects.group3_currency_exchange.model.Currency;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyConverterImpl implements CurrencyConverter {
    private static final String DEFAULT_FILE_PATH = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/Currency .csv";
    private Map<String, Double> transactions = new HashMap<>();

    public CurrencyConverterImpl() {
        this.transactions = new HashMap<>();
    }

    @Override
    public List<Currency> readCurrenciesFromFile(String filePath) {
        List<Currency> currencies = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String code = data[0].trim();
                    double buyRate = Double.parseDouble(data[1].trim());
                    double sellRate = Double.parseDouble(data[2].trim());
                    currencies.add(new Currency(code, buyRate, sellRate));
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }

        return currencies;
    }

    @Override
    public void buyCurrency(String currencyCode, double amount) {
        Map<String, Double[]> exchangeRates = readExchangeRatesFromFile(DEFAULT_FILE_PATH);
        if (exchangeRates.containsKey(currencyCode)) {
            Double[] rates = exchangeRates.get(currencyCode);
            double euroAmount = amount * rates[1]; // Используем курс покупки
            System.out.printf("To be received %.2f € for the entered amount %.2f %s%n", euroAmount, amount, currencyCode);


            Double currentAmount = transactions.getOrDefault(currencyCode, 0.0);
            transactions.put(currencyCode, currentAmount + euroAmount); // Сохраняем сумму в евро в transactions
        } else {
            throw new IllegalArgumentException("No exchange rate found for this currency!");
        }
    }

    @Override
    public void sellCurrency(String currencyCode, double amount) {
        Map<String, Double[]> exchangeRates = readExchangeRatesFromFile(DEFAULT_FILE_PATH);
        if (exchangeRates.containsKey(currencyCode)) {
            Double[] rates = exchangeRates.get(currencyCode);
            double euroAmount = amount * rates[0]; // Используем курс продажи
            System.out.printf("You sold %.2f %s and received %.2f €%n", amount, currencyCode, euroAmount);


            Double currentAmount = transactions.getOrDefault(currencyCode, 0.0);
            transactions.put(currencyCode, currentAmount - euroAmount); // Обновляем сумму в евро в transactions
        } else {
            throw new IllegalArgumentException("No exchange rate found for this currency!");
        }
    }

    @Override
    public void saveTransactionsToFile(List<Currency> currencies, String filePath) {
        if (filePath == null || filePath.trim().isEmpty()) {
            filePath = "/Users/kirillbott/Desktop/AitTR-Java-Cource2023/AitTR-Java-Cource-2023/lesson_71/code/practice/currency/transaktion.txt";
        }

        if (transactions.isEmpty()) {
            System.out.println("No transactions to save.");
            return;
        }

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("Currency Code,Amount in Euro\n");
            for (Map.Entry<String, Double> entry : transactions.entrySet()) {
                String currencyCode = entry.getKey();
                Double euroAmount = entry.getValue();
                writer.write(currencyCode + "," + euroAmount + "\n");
            }
            System.out.println("Transactions saved to '" + filePath + "' file.");
        } catch (IOException e) {
            System.out.println("Error occurred while saving transactions: " + e.getMessage());
        }
    }

    private Map<String, Double[]> readExchangeRatesFromFile(String filePath) {
        Map<String, Double[]> exchangeRates = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                if (data.length == 3) {
                    String code = data[0].trim();
                    double buyRate = Double.parseDouble(data[1].trim());
                    double sellRate = Double.parseDouble(data[2].trim());
                    exchangeRates.put(code, new Double[]{buyRate, sellRate});
                }
            }
        } catch (IOException | NumberFormatException e) {
            e.printStackTrace();
        }
        return exchangeRates;
    }
}
