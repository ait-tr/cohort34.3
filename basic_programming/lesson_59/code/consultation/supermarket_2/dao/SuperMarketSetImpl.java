package consultation.supermarket_2.dao;

import consultation.supermarket_2.model.Product;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SuperMarketSetImpl implements SuperMarket {

    // поля
    // Product[] products;

    Set<Product> productSet;
    // int size; // текущее кол-во товаров
    int capacity; // максимально-возможное кол-во товаров SKU

    // конструктор
    public SuperMarketSetImpl() {
        productSet = new HashSet<>();
        //this.capacity = capacity;
    }

    public SuperMarketSetImpl(List<Product> productList){
        this();
        for (Product p : productList) {
            addProduct(p);
        }
    }

    @Override
    public boolean addProduct(Product product) {
        if(product == null ){
            return false;
        }
        return productSet.add(product);
    }

    @Override
    public Product removeProduct(Long barCode) {
        Product removed = findByBarCode(barCode);
        productSet.remove(removed);
        return removed;
    }

    @Override
    public Product findByBarCode(Long barCode) {
        return productSet.stream()
                .filter(p -> p.getBarCode() == barCode)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return productSet.stream()
                .filter(p -> p.getCategory().equals(category))
                .toList();
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return productSet.stream()
                .filter(p -> p.getBrand().equals(brand))
                .toList();
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        LocalDate currentDay = LocalDate.now(); // текущая дата
        return productSet.stream()
                .filter(p -> p.getExpDate().isAfter(currentDay))
                .toList();
    }

    @Override
    public int skuQuantity() {
        return productSet.size();
    }
}
