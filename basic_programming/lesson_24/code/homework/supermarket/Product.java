package homework.supermarket;

public class Product {
    // поля класса
    private long barcode; // штрих-код
    private String name;
    private double price;

    // конструктор
    public Product(long barcode, String name, double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    // геттеры и сеттеры
    public long getBarcode() {
        return barcode;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // наследуем от Object
    @Override
    public String toString() {
        return "Product{" +
                "barcode=" + barcode +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    // наследуем от Object
    @Override
    public boolean equals(Object object) {
        if (this == object) return true; //
        if (object == null || getClass() != object.getClass()) return false;
        Product product = (Product) object; // down casting
        return barcode == product.barcode;
    }

    @Override
    public int hashCode() {
        return (int) (barcode ^ (barcode >>> 32));
    }

}
