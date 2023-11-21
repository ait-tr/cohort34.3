package practice.company_v3.dao;

import practice.company_v3.model.Employee;
import practice.company_v3.model.SalesManager;

import java.util.ArrayList;
import java.util.List;

public class CompanyArrayListImpl implements Company {

    List<Employee> employees; // вместо массива делаем List
    int capacity; // вместимость компании


    public CompanyArrayListImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new ArrayList<>(); // длину (размер) указывать не надо
    }

    // O(n)
    @Override
    public boolean addEmployee(Employee employee) {
        // не добавляем null, не превышаем capacity, не добавляем уже существующий элемент
        if(employee == null || employees.size() == capacity || findEmployee(employee.getId()) != null) {
            return false;
        }
        employees.add(employee); // добавили в список сотрудника (элемент списка)
        return true;
    }

    // O(n)
    @Override
    public Employee removeEmployee(int id) {

        Employee victim = findEmployee(id);
        if (victim != null) { // а надо ли это проверять?
            employees.remove(victim);
            return victim;
        }
        return null;
    }

    // O(n)
    @Override
    public Employee findEmployee(int id) {

        for (Employee e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    // O(1)
    @Override
    public int quantity() {
        return employees.size(); // вернули длину списка
    }

    // O(n)
    @Override
    public double totalSalary() {
        double res = 0;

        for (Employee e : employees) {
            res += e.calcSalary();
        }
        return res;
    }

    @Override
    public double avgSalary() {
        return totalSalary() / employees.size();
    }

    // O(n)
    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if(e instanceof SalesManager) {
                //    SalesManager salesManager = (SalesManager) e;
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    // O(n)
    @Override
    public void printEmployees() {
        for (Employee e : employees) {
            System.out.println(e);
        }

    }

    @Override
    public Employee[] findEmployeesHoursGreaterThan(int hours) {

//        // считаем сколько будет элементов массива, удовлетворяющих условию
        int count = 0;
        for (Employee e : employees) {
            if(e.getHours() > hours) {
                count++;
            }
        }
        Employee[] res = new Employee[count]; // создаем массив размером count
        count = 0;
        for (Employee e : employees) {
            if(e.getHours() > hours){
                res[count] = employees.get(count);
                count++;
            }
        }
        return res;
    }

    // реализация от Кирилла Соколова
    // O(n)
    @Override
    // подсчет количества элементов, удовлетворяющих критерию
    public Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        // O(1)
        int count = 0;
        // O(n)
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                count++;
            }
        }
        // O(1)
        Employee[] res = new Employee[count]; // создали новый массив
        count = 0;
        // O(n)
        for (Employee e : employees) {
            if (e.calcSalary() > minSalary && e.calcSalary() < maxSalary) {
                res[count] = e;
                count = count + 1;
            }
        }
        return res;
    }

}
