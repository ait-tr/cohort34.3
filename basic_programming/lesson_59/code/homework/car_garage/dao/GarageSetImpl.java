package homework.car_garage.dao;

import homework.car_garage.model.Car;

import java.util.HashSet;
import java.util.Set;

public class GarageSetImpl implements Garage {
    private Set<Car> cars;
    private int size;
    private int capacity;

    public GarageSetImpl(int capacity) {
        cars = new HashSet<>();
        this.size = 0;
        this.capacity = capacity;
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null) {
            throw new RuntimeException("null");
        }
        if (capacity == cars.size() || cars.contains(car.getRegNumber())) {
            return false;
        }
        return cars.add(car);
    }

    // =======================================
    @Override
    public Car removeCar(String regNumber) {
        Car car = findCarByRegNumber(regNumber);
        cars.remove(car);
        return car;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        for (Car car : cars) {
            if(car.getRegNumber().equals(regNumber)){
                return car;
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return null;
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return null;
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return null;
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return null;
    }

    @Override
    public int size() {
        return cars.size();
    }
}
