package projects.group2_calorie.сalorie.model;


import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

public class CalorieEntry implements Serializable {
    private LocalDateTime dateTime;
    private List <Product> products;

    public CalorieEntry(LocalDateTime dateTime, List<Product> products) {
        this.dateTime = dateTime;
        this.products = products;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public List<Product> getProducts() {
        return products;
    }
}