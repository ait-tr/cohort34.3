package family_budget.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Purchase implements Comparable<Purchase>{
    private int id;
    private LocalDate date;
    private double cost;
    private String store; // поствщик
    private String person;
    private List<Product> products;

    public Purchase(int id, LocalDate date, double cost, String store, String person, List<Product> products) {
        this.id = id;
        this.date = date;
        this.cost = calculatePurchaseCost(products);
        this.store = store;
        this.person = person;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getCost() {
        return calculatePurchaseCost(products);
    }

    public String getStore() {
        return store;
    }

    public String getPerson() {
        return person;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculatePurchaseCost(List<Product> productList) {
        return productList.stream()
                .mapToDouble(p -> p.getPrice() * p.getQuantity())
                .sum();
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (!(object instanceof Purchase purchase)) return false;

        return id == purchase.id;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", date=" + date +
                ", totalCost=" + cost +
                ", store='" + store + '\'' +
                ", person='" + person + '\'' +
                ", products=" + products +
                '}';
    }

    @Override
    public int compareTo(Purchase o) {
        return this.date.compareTo(o.getDate()); // сортировка по датам
    }
}
