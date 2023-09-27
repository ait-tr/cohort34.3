package homework.student;

import homework.student.model.Student;

public class StudentAppl {
    public static void main(String[] args) {
        Student ivanov = new Student(1," Nikolay ", "Ivanov", 2000, "medicine");
        Student petrov = new Student(2," Mikhail ", "Petrov", 1999, "history");
        Student sidorov = new Student(3," Alexander ", "Sidorov", 2006, "art");

        ivanov.hierIs();
        ivanov.display();
        ivanov.exam();
        ivanov.split();
        petrov.hierIs();
        petrov.display();
        petrov.work();
        ivanov.split();
        sidorov.hierIs();
        sidorov.display();
        sidorov.eat();
        sidorov.study();
    }
}
