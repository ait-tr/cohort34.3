package projects.group4_family_budget.model;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

public class Purchase implements Comparable<Purchase>{
    private final int id;
    private final LocalDate data;
    private final double totalCost;
    private final String store;
    private final String person;
    private final List<Product> products;

    public Purchase(int id, LocalDate data, double totalCost, String store, String person, List<Product> products) {
        this.id = id;
        this.data = data;
        this.totalCost = totalCost;
        this.store = store;
        this.person = person;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public LocalDate getData() {
        return data;
    }

    public double getTotalCost() {
        return totalCost;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Purchase purchase = (Purchase) o;
        return id == purchase.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Purchase{" +
                "id=" + id +
                ", data=" + data +
                ", totalCost=" + totalCost +
                ", store='" + store + '\'' +
                ", person='" + person + '\'' +
                ", products=" + products +
                '}';
    }
    @Override
    public int compareTo(Purchase o) {
        return this.data.compareTo(o.getData());//сортировка по датам
    }
}
