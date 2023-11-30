package homework;

import java.util.Objects;

public class Car {
    private String model;
    private String regNumber;
    private String color;

    public Car(String model, String regNumber, String color) {
        this.model = model;
        this.regNumber = regNumber;
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
