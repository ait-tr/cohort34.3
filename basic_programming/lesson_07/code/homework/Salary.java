package homework;

import java.util.Scanner;

// Напишите программу расчета выдачи денег работнику с учётом надбавки за стаж, если базовая зарплата 500$.
// За 3 года работы надбавка 10%, за 5 лет работы надбавка 50%, за 10 лет работы надбавка 100%,
// за 15 лет работы надбавка 150%. Сколько лет проработал работник вводится с клавиатуры.
public class Salary {
    public static void main(String[] args) {

        double baseSalary = 500.0;
        double salary = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input how many years has the employee worked: ");
        int experience = scanner.nextInt();

        if (experience > 0 && experience < 3) {
            System.out.println("Salary is: " + baseSalary);
        } else if (experience >= 3 && experience < 5) {
            salary = baseSalary + baseSalary * 0.1;
            System.out.println("Salary is: " + salary);
        } else if (experience >= 5 && experience < 10) {
            salary = baseSalary + baseSalary * 0.5;
            System.out.println("Salary is: " + salary);
        } else if (experience >= 10 && experience < 15) {
            salary = baseSalary + baseSalary * 1.0;
            System.out.println("Salary is: " + salary);
        } else if (experience >= 15) {
            salary = baseSalary + baseSalary * 1.5;
            System.out.println("Salary is: " + salary);
        }
    }
}
