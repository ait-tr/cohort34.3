package practice.company.dao;

import practice.company.model.Employee;

public class CompanyImpl implements Company{
    // поля, которые описывают компанию
    private Employee[] employees; // массив для хранения сотрудников
    private int size; // текущее кол-во сотрудников в компании

    // конструктор
    public CompanyImpl(int capacity){
        employees = new Employee[capacity]; // capacity - максимальный размер компании
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
