package homework.student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Comparator;
import java.util.Objects;

public class Student {
    //По аналогии с классом User
    // создать класс Student с полями:
    // id, firstName, lastName, birtDay,
    // course, groupNum (номер группы), country, gender(пол)
    private long id;
    private String firstName;
    private String lastName;
    private String birtDay;
    private String course;
    private int groupNum;
    private String country;
    private String gender;

    public Student(long id, String firstName, String lastName, String birtDay, String course, int groupNum, String country, String gender) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birtDay = birtDay;
        this.course = course;
        this.groupNum = groupNum;
        this.country = country;
        this.gender = gender;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirtDay() {
        return birtDay;
    }

    public void setBirtDay(String birtDay) {
        this.birtDay = birtDay;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getGroupNum() {
        return groupNum;
    }

    public void setGroupNum(int groupNum) {
        this.groupNum = groupNum;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birtDay='" + birtDay + '\'' +
                ", course='" + course + '\'' +
                ", groupNum=" + groupNum +
                ", country='" + country + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash( id );
    }
    public static Comparator<Student> birthdayComparator = (s1, s2) -> {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate1 = LocalDate.parse(s1.getBirtDay(), formatter);
        LocalDate birthDate2 = LocalDate.parse(s2.getBirtDay(), formatter);

        return birthDate1.compareTo(birthDate2);
    };

    public double getAge() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate birthDate = LocalDate.parse(birtDay, formatter);
        LocalDate currentDate = LocalDate.now();
        // Вычисление возраста в годах
        long years = ChronoUnit.YEARS.between(birthDate, currentDate);
        return (int) years;
    }

}
