package practice.student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {

    Student student;

    @BeforeEach
    void setUp() {
        student = new Student();
    }

    @Test
    @DisplayName ("В этом ТЕСТЕ мы тестируем расчет среднего балла")
    void averageMark() {
        int[] marks = {1, 2, 1, 3, 2, 1, 6, 5, 4, 2 };
        assertEquals(2.7,student.averageMark(marks));
    }


}