package practice.company.dao;

import practice.company.model.Employee;

public class CompanyImpl implements Company{

    private Employee[] employees;
    private int size;

    public CompanyImpl(int capacity){
        employees = new Employee[capacity];
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return false;
    }

    @Override
    public Employee removeEmployee(int id) {
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        return null;
    }

    @Override
    public int quantity() {
        return 0;
    }

    @Override
    public double totalSalary() {
        return 0;
    }

    @Override
    public double avgSalary() {
        return 0;
    }

    @Override
    public double totalSales() {
        return 0;
    }

    @Override
    public void printEmployees() {

    }
}
