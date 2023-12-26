package projects.group3_currency_exchange.dao;

import projects.group3_currency_exchange.model.Currency;

import java.util.List;

public interface CurrencyConverter {
    List<Currency> readCurrenciesFromFile(String filePath);

    void buyCurrency(String currencyCode, double amount);

    void sellCurrency(String currencyCode, double amount);

    void saveTransactionsToFile(List<Currency> currencies, String filePath);
}
