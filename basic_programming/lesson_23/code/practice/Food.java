package practice;

public class Food extends Product {
    private String expDate;
    private boolean organic;

    public Food(long barcode, String name, double price, String expDate, boolean organic) {
        super(barcode, name, price);
        this.expDate = expDate;
        this.organic = organic;
    }

    public String getExpDate() {
        return expDate;
    }

    public boolean isOrganic() {
        return organic;
    }

    @Override
    public String toString() {
        return "Food{" +
                "expDate='" + expDate + '\'' +
                ", organic=" + organic +
                "} " + super.toString();
    }
}
