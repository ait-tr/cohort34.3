package practice.car_garage.tests;

import practice.car_garage.dao.Garage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import practice.car_garage.dao.GarageSetImpl;
import practice.car_garage.model.Car;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {
    Garage garage;
    Car[] c;

    @BeforeEach
    void setUp() {
        garage = new GarageSetImpl(5);
        c = new Car[4];
        c[0] = new Car("N1", "M1", "C1", 1.5, "red");
        c[1] = new Car("N2", "M2", "C1", 2.5, "gray");
        c[2] = new Car("N3", "M3", "C2", 1.5, "red");
        c[3] = new Car("N4", "M3", "C2", 2.0, "gray");

        for (int i = 0; i < c.length; i++) {
            garage.addCar(c[i]);
        }

    }

    @Test
    void addCarTest() {
        // не добавлять null
        //assertFalse(garage.addCar(null));
        // не добавлять уже имеющийся объект
        assertFalse(garage.addCar(c[2]));
        // успешно добавить новый объект
        Car car = new Car("N5", "M1", "C1", 3.0, "white");
        assertTrue(garage.addCar(car));
        // не добавить, когда достигнута capacity
        car = new Car("N6", "M1", "C1", 3.0, "white");
        assertFalse(garage.addCar(car));
        assertEquals(5, garage.size());
    }

    @Test
    void removeCarTest() {
        // успешное удаление
        assertEquals(4, garage.size());
        assertEquals(c[1], garage.removeCar("N2"));
        assertEquals(3, garage.size());
        // не найдем удаленный объект
        assertNull(garage.findCarByRegNumber("N2"));
    }


    @Test
    void findCarByRegNumberTest() {
        // поиск успешный по regNumber
        assertEquals(c[0], garage.findCarByRegNumber("N1"));
        assertNull(garage.findCarByRegNumber("N6"));
    }

    @Test
    void findCarsByModelTest() {
        // поиск по модели
        Car[] expected = {c[2], c[3]};
        Car[] actual = garage.findCarsByModel("M3");
        assertArrayEquals(expected, actual);
    }

    @Test
    void findCarsByCompanyTest() {
        // поиск по компании
        Car[] expected = {c[2], c[3]};
        Car[] actual = garage.findCarsByCompany("C2");
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByEngineTest() {
        Car[] expected = {c[0], c[2], c[3] };
        Car[] actual = garage.findCarsByEngine( 1.0, 2.1 );
        assertArrayEquals(expected, actual);

    }

    @Test
    void findCarsByColorTest() {
        Car[] expected = {c[0], c[2]};
        Car[] actual = garage.findCarsByColor("red");
        assertArrayEquals(expected, actual);

    }

}