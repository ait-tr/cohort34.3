package practice.company_v3.dao;

//    - добавить сотрудника
//    - удалить сотрудника
//    - найти сотрудника
//    - кол-во сотрудников
//    - ФОТ
//    - средняя з/п
//    - объем продаж
//    - напечатать список сотрудников

import practice.company_v3.model.Employee;

public interface Company {
    // объявляем методы, только сигнатуры, без тела метода
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    Employee findEmployee(int id);
    int quantity();
    double totalSalary(); // - ФОТ, зарплата всех
    double avgSalary(); // средняя зарплата по компании, average - средний
    double totalSales(); // - объем продаж
    void printEmployees();
    //---------------------
//      - список работников, у которых отработано больше часов, чем...
    treeset_company.model.Employee[] findEmployeesHoursGreaterThan(int hours);
//      - список работников, у которых зарплата в интервале от... и до...
    treeset_company.model.Employee[] findEmployeesSalaryRange(int minSalary, int maxSalary);

}
