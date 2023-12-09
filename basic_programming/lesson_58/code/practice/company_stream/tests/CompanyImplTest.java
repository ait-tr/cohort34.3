package practice.company_stream.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company_stream.dao.Company;
import practice.company_stream.dao.CompanySetImpl;
import practice.company_stream.model.Employee;
import practice.company_stream.model.Manager;
import practice.company_stream.model.SalesManager;
import practice.company_stream.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {

    Company company;
    Employee[] employee;

    @BeforeEach
    void setUp() {
        company = new CompanySetImpl(5);
        employee = new Employee[4];
        employee[0] = new Manager(101, "John", "Smith", 45, 160, 5000, 5);
        employee[1] = new SalesManager(102,"Anna", "Black", 36, 160, 25000, 0.1);
        employee[2] = new SalesManager(103,"Thomas", "White", 28, 160, 30000, 0.1);
        employee[3] = new Worker(104, "Gans", "Bauer", 30, 160, 5);
    }

    @Test
    void addEmployee() {
        // не можем добавить null
        // assertFalse(company.addEmployee(null));
        // не можем добавить второй раз, уже существующий
        assertFalse(company.addEmployee(employee[1]));
        Employee employee1 = new Manager(105, "Ivan", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertTrue(company.addEmployee(employee1)); // добавили нового сотрудника
        assertEquals(5, company.quantity()); // теперь в компании 5 сотрудников
        // создаем еще одного нового
        Employee employee2 = new Manager(106, "Peter", "Dubin", 55, 160, 6000, 6); // создали нового сотрудника
        assertFalse(company.addEmployee(employee2)); // не можем превысить capacity
    }

    @Test
    void removeEmployee() {
        // удаляем сотрудника
        assertEquals(employee[1] ,company.removeEmployee(102));
        assertEquals(3, company.quantity()); // сотрудников стало на 1 меньше (4 - 1)
        assertNull(company.removeEmployee(102)); // дважды не можем удалить
        assertNull(company.findEmployee(102)); // не можем найти после удаления
    }

    @Test
    void findEmployee() {
        // ищем сотрудника по id
        assertEquals( employee[1], company.findEmployee(102));
        // ищем несуществующего сотрудника
        assertNull(company.findEmployee(105));
    }

    @Test
    void quantity() {


    }

    @Test
    void totalSalary() {


    }

    @Test
    void avgSalary() {


    }

    @Test
    void totalSales() {
    }

    @Test
    void printEmployees() {


    }
}