package practice.supermarket;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class SupermarketImpl implements Supermarket{

    private Collection<Product> products = new ArrayList<>();

    @Override
    public boolean addProduct(Product product) {
        if (product == null || products.contains(product)) {
            return false;
        }
        return products.add(product);
    }

    @Override
    public Product removeProduct(long barCode) {
        Product removed = findByBarCode(barCode);
        products.remove(removed);
        return removed;
    }

    @Override
    public Product findByBarCode(long barCode) {
        for (Product product : products) {
            if (barCode == product.getBarCode()) {
                return product;
            }
        }
        return null;
    }

    @Override
    public Iterable<Product> findByCategory(String category) {
        return findByPredicate(p -> category.equalsIgnoreCase(p.getCategory()));
    }

    @Override
    public Iterable<Product> findByBrand(String brand) {
        return findByPredicate(p -> brand.equalsIgnoreCase(p.getBrand()));
    }

    @Override
    public Iterable<Product> findProductWithExpDate() {
        LocalDate currentDay = LocalDate.now();
        return findByPredicate(p -> currentDay.isAfter(p.getExpDate()));
    }

    private Iterable<Product> findByPredicate(Predicate<Product> predicate) {
        List<Product> res = new ArrayList<>(); // список для результатов
        for (Product product : products) {
            if(predicate.test(product)){
                res.add(product);
            }
        }
        return res;
    }

    @Override
    public int skuQuantity() {
        return products.size();
    }

    @Override
    public Iterator<Product> iterator() {
        return products.iterator();
    }
}
