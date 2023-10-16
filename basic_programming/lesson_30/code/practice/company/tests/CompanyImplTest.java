package practice.company.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.company.dao.Company;
import practice.company.dao.CompanyImpl;
import practice.company.model.Employee;
import practice.company.model.Manager;
import practice.company.model.SalesManager;
import practice.company.model.Worker;

import static org.junit.jupiter.api.Assertions.*;

class CompanyImplTest {
    Company company;
    Employee[] employee;

    @BeforeEach
    void setUp() {
        company = new CompanyImpl(5);
        employee = new Employee[4];
        employee[0] = new Manager(100, "John", "Smith", 45, 160, 5000, 5);
        employee[1] = new SalesManager(101,"Anna", "Black", 36, 160, 25000, 0.1);
        employee[2] = new SalesManager(102,"Thomas", "White", 28, 160, 30000, 0.1);
        employee[3] = new Worker(103, "Gans", "Bauer", 30, 160, 5);

    }

    @Test
    void addEmployeeTest() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employee[1]));
        Employee employee = new SalesManager(104,"Thomas", "White", 28, 160, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        //employee = new SalesManager(6000, "Rabindranat", "Anand", 80, 20000, 0.1);
        assertFalse(company.addEmployee(employee));

    }

    @Test
    void removeEmployeeTest() {

    }

    @Test
    void findEmployee() {
    }

    @Test
    void quantityTest() {
        assertEquals(4, company.quantity());
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