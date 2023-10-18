package practice.company_v1.dao;

import practice.company_v1.model.Employee;
import practice.company_v1.model.SalesManager;

public class CompanyImpl implements Company {
    // поля, которые описывают компанию
    private Employee[] employees; // сотрудники - массив для хранения сотрудников
    private int size; // текущее кол-во сотрудников в компании

    // конструктор
    public CompanyImpl(int capacity){
        employees = new Employee[capacity]; // capacity - максимальный размер компании
    }

    @Override
    public boolean addEmployee(Employee employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if( employee == null || size == employees.length || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees[size] = employee; // новый элемент
        size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){
                Employee victim = employees[i]; // убрали найденный элемент в в переменную
                employees[i] = employees[size - 1]; // на место найденного поставили последнего существ. в массиве
                employees[size - 1] = null; // обнулили последнего
                size--;
                // можно написать короче этот код TODO
                return victim;
            }
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (int i = 0; i < size; i++) {
            if(employees[i].getId() == id){ // нашелся элемент массива, у которого совпал id
                return employees[i]; // вернули найденный элемент массива типа Employee
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return size;
    }

    // удалить
    @Override
    public double totalSalary() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            res += employees[i].calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / size;
    }

    @Override
    public double totalSales() {
        double res = 0;
        for (int i = 0; i < size; i++) {
            if(employees[i] instanceof SalesManager){
                SalesManager salesManager = (SalesManager) employees[i]; // провели кастинг
                res += salesManager.getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        for (int i = 0; i < size; i++) {
            System.out.println(employees[i]);
        }
    }
}
