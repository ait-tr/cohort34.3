package homework.supermarket;

public class Product {
    // поля класса
    private long barСode; // штрих-код
    private String name;
    private double price;

    // конструктор
    public Product(long barСode, String name, double price) {
        this.barСode = barСode;
        this.name = name;
        this.price = price;
    }

    // геттеры и сеттеры
    public long getBarСode() {
        return barСode;
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
                "barcode=" + barСode +
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
        return barСode == product.barСode;
    }

    @Override
    public int hashCode() {
        return (int) (barСode ^ (barСode >>> 32));
    }

}
