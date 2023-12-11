package practice.employee_save_read;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class Employee implements Serializable {
    private final int id; // final - не может никто поменять
    private String name;
    private LocalDate birthDate;
    private double salary;
    private Address address;

    public Employee(int id, String name, LocalDate birthDate, double salary, Address address) {
        System.out.println("Constructor Employee is working...");
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthDate=" + birthDate +
                ", salary=" + salary +
                ", address=" + address +
                '}';
    }
}
