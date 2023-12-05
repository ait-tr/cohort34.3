package homework.student;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

// Код Кирилла Ботта

public class DekanatAppl {
    // В приложении DekanatAppl создать студентов из разных стран,
    // которые учатся на разных курсах, в разных группах.
    // Сделать списки студентов по курсам, по группам, отсортированные по фамилиям и возрасту.
    // Сколько студентов мужчин? Сколько женщин? Какой у них средний возраст по курсу? По всем студентам?
    public static void main(String[] args) {
        Student[] student = new Student[10];
        student[0] = new Student( 1, "Alex", "Müller", "19.12.2000", "Mathematics", 1, "Germany", "male" );
        student[1] = new Student( 2, "Anna", "Mayer", "21.11.1999", "Physics", 2, "Germany", "female" );
        student[2] = new Student( 3, "Julia", "Andreeva", "02.04.2001", "Biology", 3, "Russia", "female" );
        student[3] = new Student( 4, "Max", "Schneider", "13.11.2002", "Mathematics", 1, "Austria", "male" );
        student[4] = new Student( 5, "Yaroslav", "Petrenko", "09.12.1998", "Physics", 2, "Ukraine", "male" );
        student[5] = new Student( 6, "Olesia", "Petrenko", "04.10.2002", "Mathematics", 1, "Ukraine", "female" );
        student[6] = new Student( 7, "John", "Smith", "09.06.2003", "Economy", 4, "USA", "male" );
        student[7] = new Student( 9, "Eva", "Johnson", "07.01.2004", "Economy", 4, "USA", "female" );
        student[8] = new Student( 9, "Andrey", "Volkov", "29.11.2002", "Physics", 2, "Russia", "male" );
        student[9] = new Student( 10, "Sophie", "Wagner", "04.02.2001", "Biology", 3, "Austria", "female" );

        List<Student> studentList = new ArrayList<>();
        for (int i = 0; i < student.length; i++) {
            studentList.add( student[i] );// положили student в список типа ArrayList
        }
        // Список студентов по курсу
        Map<String, List<Student>> studentsByCourse = studentList.stream()

                .collect( Collectors.groupingBy( Student::getCourse ) );

        // Вывод списков студентов по курсам
        studentsByCourse.forEach( (course, students) -> {
            System.out.println( "Students on the course " + course );
            students.forEach( System.out::println );
            System.out.println( "=============================================" );
        } );

        // список студентов по группам
        Map<Integer, List<Student>> studentsByGroup = studentList.stream()
                .collect( Collectors.groupingBy( Student::getGroupNum ) );

        // Вывод списков студентов по группам
        studentsByGroup.forEach( (group, students) -> {
            System.out.println( "Students in a group " + group );
            students.forEach( System.out::println );
            System.out.println( "=============================================" );
        } );

        // Сортировка списка студентов только по фамилии
        List<Student> sortedByLastName = studentList.stream().sorted( Comparator.comparing( Student::getLastName ) ).collect( Collectors.toList() );
        // Вывод отсортированного списка студентов только по фамилии
        sortedByLastName.forEach( System.out::println );
        System.out.println( "=============================================" );

        // Сортировка списка студентов по дате рождения
        List<Student> sortedByBirthDate = studentList.stream().sorted( Student.birthdayComparator ).collect( Collectors.toList() );
        sortedByBirthDate.forEach( System.out::println );
        System.out.println( "=============================================" );


        // Средний возраст для всех студентов
        double averageAgeAllStudents = studentList.stream().mapToDouble( Student::getAge ).average().orElse( 0.0 );
        System.out.println( "Average age of all students: " + averageAgeAllStudents );

        // Средний возраст по курсу
        Map<String, Double> averageAgeByCourse = studentList.stream().collect( Collectors.groupingBy( Student::getCourse, Collectors.averagingDouble( Student::getAge ) ) );
        System.out.println( "Average age by course: " + averageAgeByCourse );
        System.out.println( "=============================================" );

        // Сортировка списка студентов по фамилии и возрасту
        List<Student> sortedByLastNameAndAge = studentList.stream()
                .sorted(Comparator.comparing(Student::getLastName)
                        .thenComparing(Student::getAge))
                .collect(Collectors.toList());

        System.out.println("Students sorted by last name and age:");
        sortedByLastNameAndAge.forEach(System.out::println);
        System.out.println("=============================================");

        // Сортировка студентов по странам
        List<Student> sortedByCountry = studentList.stream()
                .sorted(Comparator.comparing(Student::getCountry))
                .collect(Collectors.toList());

        System.out.println("Students sorted by country:");
        sortedByCountry.forEach(System.out::println);
        System.out.println("=============================================");

        // Сколько студентов мужчин и женщин
        countGender( studentList );


    }

    public static void countGender(List<Student> students) {
        long maleCount = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("male"))
                .count();

        long femaleCount = students.stream()
                .filter(student -> student.getGender().equalsIgnoreCase("female"))
                .count();

        System.out.println("Number of males: " + maleCount);
        System.out.println("Number of females: " + femaleCount);
    }

}
