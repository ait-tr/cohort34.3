package homework.sport;

// фамилия, имя, регистрационный номер спортсмена, клуб и результат в секундах

import java.util.Objects;

public class Sportsmen implements Comparable<Sportsmen>{
    private String lastName;
    private String name;
    private int regNumber;
    private String club;
    private double result;

    public Sportsmen(String lastName, String name, int regNumber, String club, double result) {
        this.lastName = lastName;
        this.name = name;
        this.regNumber = regNumber;
        this.club = club;
        this.result = result;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(int regNumber) {
        this.regNumber = regNumber;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Sportsmen{" +
                "lastName='" + lastName + '\'' +
                ", name='" + name + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", club='" + club + '\'' +
                ", result=" + result +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sportsmen sportsmen = (Sportsmen) o;
        return Objects.equals(regNumber, sportsmen.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regNumber);
    }

    @Override
    public int compareTo(Sportsmen o) {
        return Double.compare(this.result, o.result);
    }
}
