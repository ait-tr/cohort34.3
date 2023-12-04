package consultation.supermarket_2.model;

import java.time.LocalDate;
import java.util.Objects;

public class Product {
    private long barCode;
    private String name;
    private String brand;
    private String category;
    private double price;
    private LocalDate expDate;

    public Product(long barCode, String name, String brand, String category, double price, LocalDate expDate) {
        this.barCode = barCode;
        this.name = name;
        this.brand = brand;
        this.category = category;
        this.price = price;
        this.expDate = expDate;
    }

    public long getBarCode() {
        return barCode;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    @Override
    public String toString() {
        return "Product{" +
                "barCode=" + barCode +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", expDate=" + expDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return barCode == product.barCode;
    }

    @Override
    public int hashCode() {
        return Objects.hash(barCode);
    }
}
