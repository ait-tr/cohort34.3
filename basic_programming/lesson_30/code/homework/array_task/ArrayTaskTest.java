package homework.array_task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayTaskTest {

    ArrayTask arrayTask;
    @BeforeEach
    void setUp() {
        arrayTask = new ArrayTask();
    }

    @Test
    void averageEvenElementsTest() {
        int[] arr = {-10, 11, 10, 13};
        assertEquals(11, arrayTask.averageEvenElements(arr));
    }
}