package practice.employee_save_read;

import java.io.Serializable;

public class Address implements Serializable {

    private String city;
    private String street;
    private int building;
    private int aprt;

    public Address(String city, String street, int building, int aprt) {
        System.out.println("Constructor Address is working...");
        this.city = city;
        this.street = street;
        this.building = building;
        this.aprt = aprt;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getBuilding() {
        return building;
    }

    public int getAprt() {
        return aprt;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", building=" + building +
                ", aprt=" + aprt +
                '}';
    }
}
