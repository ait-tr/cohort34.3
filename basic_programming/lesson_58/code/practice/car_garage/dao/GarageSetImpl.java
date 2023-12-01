package practice.car_garage.dao;

import practice.car_garage.model.Car;
import practice.company_stream.dao.Company;
import practice.company_stream.model.Employee;

import java.util.HashSet;
import java.util.Set;

public class GarageSetImpl implements Garage {

    // поля класса
    private Set<Car> cars; // для объектов типа Car
    private int size; // текущее кол-во автомобилей в массиве
    private int capacity; // максимальное кол-во автомобилей

    // конструктор
    public GarageSetImpl(int capacity) {
        cars = new HashSet<>();
        this.size = 0;
        this.capacity = capacity;
    }

    @Override
    public boolean addCar(Car car) {
        if(car == null){
            throw new RuntimeException("null");
        }
        if(capacity == cars.size()){
            return false;
        }
        return cars.add(car);
    }

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
        return new Car[0];
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public int size() {
        return cars.size();
    }
}
