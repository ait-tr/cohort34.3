package homework.yachts;

public class Yacht {
    private String shipyard;
    private int year;
    private double length;
    private String material;
    private double price;

    public Yacht(String shipyard, int year, double length, String material, double price) {
        this.shipyard = shipyard;
        this.year = year;
        this.length = length;
        this.material = material;
        this.price = price;
    }

    public String getManufacturer() {
        return shipyard;
    }

    public void setManufacturer(String manufacturer) {
        this.shipyard = manufacturer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Yacht { " +
                "shipyard = '" + shipyard + '\'' +
                ", year = " + year +
                ", length = " + length +
                ", material = '" + material + '\'' +
                ", price = " + price +
                '}';
    }
}
