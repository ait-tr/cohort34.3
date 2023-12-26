package projects.group4_family_budget.dao;

import projects.group4_family_budget.model.Purchase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BudgetImpl implements Budget{
    List<Purchase> purchaseList;
    double budget;

    public BudgetImpl(List<Purchase> purchaseList, double budget) {
        this.purchaseList = new ArrayList<>();
        this.budget = budget;
    }
    public BudgetImpl(List<Purchase> purchaseList) {
        this.purchaseList = new ArrayList<>();
    }
    @Override
    public boolean addPurchase(Purchase purchase) {
        if (purchase == null){
            return false;
        }return purchaseList.add(purchase);
    }
    @Override
    public double budgetGetPerson(String person) {
        return purchaseList.stream()
                .filter(p->p.getPerson().equals(person))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }
    @Override
    public List<Purchase> sortByPerson(String person) {
        return purchaseList.stream()
                .filter(p->p.getPerson().equals(person)).
                collect(Collectors.toList());
    }
    @Override
    public double budgetByStore(String store) {
        return purchaseList.stream()
                .filter(p->p.getStore().equals(store))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }
    @Override
    public List<Purchase> sortByStore(String store) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getStore().equals(store))
                .toList();
    }
    @Override
    public double budgetByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(p->p.getData().isAfter(from)&&p.getData().isBefore(to))
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }
    @Override
    public List<Purchase> sortByPeriod(LocalDate from, LocalDate to) {
        return purchaseList.stream()
                .filter(purchase -> purchase.getData().isAfter(from)&&purchase.getData().isBefore(to)).toList();
    }
    @Override
    public double calcBudget() {//на какую суммы мы сделали покупки
        return purchaseList.stream()
                .mapToDouble(Purchase::getTotalCost)
                .sum();
    }

    @Override
    public double checkBudget() {//сколько денег осталось
        return budget - calcBudget();
    }
    @Override
    public Purchase removePurchase(int id) {
        Purchase removedPurchase = purchaseList.stream()
                .filter(p->p.getId()==id)
                .findFirst()
                .orElse(null);
        if (removedPurchase != null){
            purchaseList.remove(removedPurchase);
        }
        System.out.println("Purchase " + removedPurchase.getId() + " removed successfully.");
        return removedPurchase;

    }
    @Override
    public void print() {
        purchaseList.forEach(System.out::println);
    }

    public List<Purchase>collect (){
        return purchaseList;
    }
}
