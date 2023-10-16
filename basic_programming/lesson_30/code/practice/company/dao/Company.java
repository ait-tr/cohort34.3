package practice.company.dao;

import practice.company.model.Employee;

public interface Company {
    boolean addEmployee(Employee employee);

    Employee removeEmployee(int id);

    Employee findEmployee(int id);

    int quantity();

    double totalSalary();

    double avgSalary();

    double totalSales();

    void printEmployees();

}
