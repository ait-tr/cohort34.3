package practice.employee;

import java.io.Serializable;
import java.time.LocalDate;

public class Employee implements Serializable {
    private static final long serialVersionUID = 30112023135530L;
    private final int id;
    private String name;
    private LocalDate birthDate;
    private double salary;
    private Address address;

    public Employee(int id, String name, LocalDate birthDate, double salary, Address address) {
        System.out.println("Constructor Employee");
        this.id = id;
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public Address getAddress() {
        return address;
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

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        Employee employee = (Employee) object;

        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
