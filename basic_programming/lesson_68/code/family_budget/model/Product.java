package family_budget.model;

import java.util.Objects;

public class Product {
    private String prod;
    private double price;
    private int quantity;

    public Product(String prod, double price, int quantity) {
        this.prod = prod;
        this.price = price;
        this.quantity = quantity;
    }

    public String getProduct() {
        return prod;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "product='" + prod + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return Double.compare(price, product1.price) == 0 && Objects.equals(prod, product1.prod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(prod, price);
    }
}
