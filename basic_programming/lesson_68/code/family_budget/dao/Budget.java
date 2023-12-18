package family_budget.dao;

import family_budget.model.Product;
import family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.List;

public interface Budget {
    boolean addPurchase(Purchase purchase);
    double calcBudget(List<Purchase> purchaseList);
    double budgetByPerson( List<Purchase> purchaseList, String person);
    double budgetByStore(List<Purchase> purchaseList, String store);
    double budgetByPeriod (LocalDate from, LocalDate to);
    double addMoney(double money);
    boolean checkBudget(List<Purchase> purchaseList);
    double checkMoney(List<Purchase> purchaseList);

    void printBudget();
}
