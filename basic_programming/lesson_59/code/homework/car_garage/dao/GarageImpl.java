package homework.car_garage.dao;

import homework.car_garage.model.Car;

import java.util.ArrayList;
import java.util.List;

public class GarageImpl implements Garage {
    private List<Car> cars;
    private int size;

    public GarageImpl(int capacity) {
        cars = new ArrayList<>(capacity);
        this.size = 0;
    }


    @Override
    public boolean addCar(Car car) {
        if (car == null || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars.add(car);
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        Car victim = findCarByRegNumber(regNumber);
        if (victim == null) {
            return null;
        }
        cars.remove(victim);
        return victim;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        return cars.stream()
                .filter(c -> c.getRegNumber().equals(regNumber))
                .findFirst()
                .orElse(null);


    }

    @Override
    public Car[] findCarsByModel(String model) {
        return cars.stream()
                .filter(c -> c.getModel().equals(model))
                .toArray(Car[]::new);
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return cars.stream()
                .filter(c -> c.getCompany().equals(company))
                .toArray(Car[]::new);

    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return cars.stream()
                .filter(c -> c.getEngine() >= min && c.getEngine() <= max)
                .toArray(Car[]::new);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return cars.stream()
                .filter(c -> c.getColor().equals(color))
                .toArray(Car[]::new);
    }

    @Override
    public int size() {
        return size;
    }
}
