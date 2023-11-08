package homework.array_methods;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayMethodsTest {

    ArrayMethods arrayMethods;

    @BeforeEach
    void setUp() {
        arrayMethods = new ArrayMethods();
    }

    @Test
    void sumElementsTest() {
        int[] num = {10, 20, -10, -20, 50};
        assertEquals(50, arrayMethods.sumElements(num));
    }

    @Test
    void findElementTest() {
        int[] num = {10, 20, -10, -20, 50};
        assertEquals(2, arrayMethods.findElement(num, -10));
        assertEquals(-1, arrayMethods.findElement(num, 100));
    }

    @Test
    void sumPositiveElementsTest(){
        int[] num = {10, 20, -10, -20, 50};
        assertEquals(80, arrayMethods.sumPositiveElements(num));
    }

    @Test
    void sumNegativeElementsTest(){
        int[] num = {10, 20, -10, -20, 50};
        assertEquals(-30, arrayMethods.sumNegativeElements(num));
    }

    @Test
    void sumEvenElementsTest(){
        int[] num = {10, 20, -10, -20, 50};
        assertEquals(50, arrayMethods.sumEvenElements(num));
    }

    void quantityOfZeroTest(){
        int[] num = {10, 0, -10, 0, 50};
        assertEquals(2, arrayMethods.quantityOfZero(num));
    }
}