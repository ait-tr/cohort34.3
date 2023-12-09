package practice.employee;

import practice.employee.Address;
import practice.employee.Employee;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class SaveEmployeeAppl {
    public static void main(String[] args) {
        Address address = new Address("Berlin", "Gustav", 23, 15);
//        Employee employee1 = new Employee(1, "Peter", LocalDate.of(1990, 5, 12), 2500, address);
//        Employee employee2 = new Employee(2, "John", LocalDate.of(1992, 11, 3), 2700.5, address);
        Employee employee1 = new Employee(1, "Peter", LocalDate.of(1990, 5, 12), 2500, address);
        Employee employee2 = new Employee(2, "John", LocalDate.of(1992, 11, 3), 2700.5, address);
        Set<Employee> employees = new HashSet<>();
        employees.add(employee1);
        employees.add(employee2);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.dat"))) {
            oos.writeObject(employees); //serializing from object to stream of bytes
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
