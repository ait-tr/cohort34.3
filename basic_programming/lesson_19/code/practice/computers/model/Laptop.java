package practice.computers.model;

public class Laptop extends Computer {
    private String display;
    private int batteryCapacity;
    private double weight;

    public Laptop(String cpu, int ram, int hdd, String brand, String display, int batteryCapacity, double weight) {
        super(cpu, ram, hdd, brand);
        this.display = display;
        this.batteryCapacity = batteryCapacity;
        this.weight = weight;
    }

    @Override
    public String toString() {
        ;
        return super.toString() + "Laptop{" +
                "display='" + display + '\'' +
                ", batteryCapacity=" + batteryCapacity +
                ", weight=" + weight +
                '}';
    }
}
