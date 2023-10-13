package homework.calculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcMethodsTest {

    CalcMethods calcMethods;

    @BeforeEach
    void setUp() {
        calcMethods = new CalcMethods();
    }

    @Test
    void sumTest() {
        int a = 20;
        int b = 15;
        assertEquals(35, calcMethods.sum(a, b));
    }

    @Test
    void subTest() {
        int a = 20;
        int b = 15;
        assertEquals(5, calcMethods.sub(a, b));
    }

    @Test
    void mulTest() {
        int a = 20;
        int b = 15;
        assertEquals(300, calcMethods.mul(a, b));
    }

    @Test
    void divTest() {
        int a = 20;
        int b = 15;
        System.out.println(a/b);
        assertEquals(1, calcMethods.div(a, b));
    }

    @Test
    void divRest() {
        int a = 20;
        int b = 15;
        assertEquals(5, calcMethods.divRest(a, b));
    }
}