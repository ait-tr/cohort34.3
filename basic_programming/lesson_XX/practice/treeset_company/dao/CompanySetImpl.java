package treeset_company.dao;

import treeset_company.model.Employee;
import treeset_company.model.SalesManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Predicate;

public class CompanySetImpl implements Company {

    private Set<Employee> employees; // вместо List создаем Set
    int capacity; // вместимость компании

    public CompanySetImpl(int capacity) {
        this.capacity = capacity; // это ограничение по кол-ву сотрудников в компании
        employees = new TreeSet<>(); // employees - это теперь TreeSet
    }

    @Override
    public boolean addEmployee(Employee employee) {
        return employee!=null && employees.size() != capacity && employees.add(employee);
    }

    @Override
    public Employee removeEmployee(int id) {
        Employee victim = findEmployee(id);
        if (victim != null) {
            employees.remove(victim);
            return victim; // вернули удаленный элемент
        }
        return null;
    }

    @Override
    public Employee findEmployee(int id) {
        for (Employee e : employees) { // e - это employee из списка employees
            if (e.getId() == id) {
                return e; // вернули найденный элемент
            }
        }
        return null;
    }

    @Override
    public int quantity() {
        return employees.size();
    }

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

    @Override
    public double totalSales() {
        double res = 0;
        for (Employee e : employees) {
            if(e instanceof SalesManager) {
                // SalesManager salesManager = (SalesManager) e; // проводим кастинг до нужного типа
                res += ((SalesManager) e).getSalesValue();
            }
        }
        return res;
    }

    @Override
    public void printEmployees() {
        employees.forEach(e -> System.out.println(e)); // отправляем все элементы на печать
    }

    public Employee[] findEmployeesHoursGreaterThan(int hours) {
        return findEmploeesByPredicate(e -> e.getHours() >= hours);
    }

    @Override
    public treeset_company.model.Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary) {
        return findEmploeesByPredicate(e -> e.calcSalary() >= minSalary && e.calcSalary() < maxSalary);
    }

    private Employee[] findEmploeesByPredicate(Predicate<Employee> predicate) {
        List<Employee> res = new ArrayList<>();
        for (Employee employee: employees) {
            if(predicate.test(employee)){
                res.add(employee);
            }
        }
        return res.toArray(new Employee[0]); // новинка!!!
    }
}
