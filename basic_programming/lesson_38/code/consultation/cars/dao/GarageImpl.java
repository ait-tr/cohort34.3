package consultation.cars.dao;

import consultation.cars.Garage;
import consultation.cars.model.Car;

public class GarageImpl implements Garage {

    // поля класса
    private Car[] cars; // массив для объектов типа Car
    private int size; // текущее кол-во автомобилей в массиве

    // конструктор
    public GarageImpl(int capacity){
        cars = new Car[capacity];
    }

    @Override
    public boolean addCar(Car car) {
        if (car == null || size == cars.length || findCarByRegNumber(car.getRegNumber()) != null) {
            return false;
        }
        cars[size++] = car; // добавляем в массив car в конец массива (первая свободная позиция)
        return true;
    }

    @Override
    public Car removeCar(String regNumber) {
        for (int i = 0; i < size; i++) {
            if (regNumber.equals(cars[i].getRegNumber())) {
                Car temp = cars[i];
                cars[i] = cars[--size]; // ставим на место удаляемого элемента ставим последнй из массива
                cars[size] = null;
                return temp;
            }

        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
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
    public Car[] findCarsByEngine(double min, double max) {
        return new Car[0];
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return new Car[0];
    }
}
