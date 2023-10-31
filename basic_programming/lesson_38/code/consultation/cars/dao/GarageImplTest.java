package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GarageImplTest {

    Garage garage;
    Car[] c;

    @BeforeEach
    void setUp() {
        garage = new GarageImpl(5);
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

    }

    @Test
    void removeCarTest() {

    }

    @Test
    void findCarByRegNumberTest() {

    }

    @Test
    void findCarsByModelTest() {

    }

    @Test
    void findCarsByCompanyTest() {

    }

    @Test
    void findCarsByEngineTest() {

    }

    @Test
    void findCarsByColorTest() {

    }
}