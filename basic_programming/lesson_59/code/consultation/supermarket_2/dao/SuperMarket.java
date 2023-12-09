package consultation.supermarket_2.dao;

import consultation.supermarket_2.model.Product;

public interface SuperMarket {
    boolean addProduct(Product product);
    Product removeProduct(Long barCode);
    Product findByBarCode(Long barCode);
    Iterable<Product> findByCategory(String category);
    Iterable<Product> findByBrand(String brand);
    Iterable<Product> findProductWithExpDate();
    int skuQuantity();
}
