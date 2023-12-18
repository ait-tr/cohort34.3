package homework.home;

import java.time.LocalDate;
import java.util.Objects;

// Фамилия, Имя, пол, дата рождения, этаж, номер квартиры.
public class Resident {
    private String secondName;
    private String firstName;
    private String gender;
    private LocalDate birthDay;
    private int floor;
    private int apartNum;

    public Resident(String secondName, String firstName, String gender, LocalDate birthDay, int floor, int apartNum) {
        this.secondName = secondName;
        this.firstName = firstName;
        this.gender = gender;
        this.birthDay = birthDay;
        this.floor = floor;
        this.apartNum = apartNum;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getGender() {
        return gender;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public int getFloor() {
        return floor;
    }

    public int getApartNum() {
        return apartNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Resident resident = (Resident) o;
        return Objects.equals(secondName, resident.secondName) && Objects.equals(firstName, resident.firstName) && Objects.equals(gender, resident.gender) && Objects.equals(birthDay, resident.birthDay);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondName, firstName, gender, birthDay);
    }

    @Override
    public String toString() {
        return "Resident{" +
                "secondName='" + secondName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", gender='" + gender + '\'' +
                ", birthDay=" + birthDay +
                ", floor=" + floor +
                ", apartNum=" + apartNum +
                '}';
    }
}
