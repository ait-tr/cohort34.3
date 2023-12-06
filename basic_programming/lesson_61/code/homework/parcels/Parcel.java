package homework.parcels;

import java.util.Objects;

public class Parcel {
    private double weight; // вес посылки

    public Parcel(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parcel parcel = (Parcel) o;
        return Double.compare(weight, parcel.weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    @Override
    public String toString() {
        return "Parcel{" + "weight=" + weight + '}';
    }
}
