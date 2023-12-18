package family_budget.dao;

import family_budget.model.Product;
import family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BudgetImpl implements Budget{
    // поля
    private List<Purchase> purchaseList;
    private List<Product> productList;
    private double budget;

    public BudgetImpl(List<Purchase> purchaseList, List<Product> productList, double budget) {
        this.purchaseList = new ArrayList<>(); // HashSet, TreeSet - тоже надо подумать!!!
        this.productList = new ArrayList<>();
        this.budget = budget;
    }

    @Override
    public boolean addPurchase(Purchase purchase) {
        // нельзя добавить пустую покупку
        // проверка на уникальность - может быть такой чек был введен?
        if(purchase == null || purchaseList.contains(purchase)){
            System.out.println("This purchase already exists.");
            return false;
        }
        return purchaseList.add(purchase);
    }

    @Override
    public double calcBudget(List<Purchase> purchaseList) {
        return purchaseList.stream()
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPerson(List<Purchase> purchaseList, String person) {
        return purchaseList.stream()
                .filter(p -> p.getPerson().equalsIgnoreCase(person))
                .mapToDouble(Purchase::getTotalCost)
                .sum();

         // .peek(n -> System.out.println("peek befor sort: " + n)) // для отлаживания
    }

    @Override
    public double budgetByStore(List<Purchase> purchaseList, String store) {
        return purchaseList.stream()
                .filter(p -> p.getStore().equalsIgnoreCase(store))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(p -> p.getDate().isAfter(from)&&p.getDate().isBefore(to))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double addMoney(double money) {
        budget = budget + money;
        return budget;
    }

    @Override
    public boolean checkBudget(List<Purchase> purchaseList) {
        return budget >= calcBudget(purchaseList);
    }

    @Override
    public double checkMoney(List<Purchase> purchaseList) {
        return budget - calcBudget(purchaseList);
    }

    @Override
    public void printBudget() {
        System.out.println("Current month budget is: " + budget);
    }
}
