package practice.supermarket;

public interface Supermarket extends Iterable<Product>{
    boolean addProduct(Product product); // добавить

    Product removeProduct(long barCode); // удалить

    Product findByBarCode(long barCode); // найти по barcode

    Iterable<Product> findByCategory(String category); // найти все продукты в категории

    Iterable<Product> findByBrand(String brand); // найти все продукты по бренду

    Iterable<Product> findProductWithExpDate(); // найти все продукты с истекшим сроком годности

    int skuQuantity(); // кол-во товарных единиц
}
