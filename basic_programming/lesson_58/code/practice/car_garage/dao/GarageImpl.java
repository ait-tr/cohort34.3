package practice.car_garage.dao;

import practice.car_garage.model.Car;

import java.util.function.Predicate;

public class GarageImpl implements Garage{

    // поля класса
    private Car[] cars; // массив для объектов типа Car
    private int size; // текущее кол-во автомобилей в массиве

    // конструктор
    public GarageImpl(int capacity) {
        cars = new Car[capacity];
        this.size = 0;
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
                cars[size] = null; // затираем последний элемент в массиве
                return temp;
            }

        }
        return null;
    }

    @Override
    public Car findCarByRegNumber(String regNumber) {
        // пробегаем по массиву, ищем по условию элемент массива
        for (int i = 0; i < size; i++) {
            if (cars[i].getRegNumber().equals(regNumber)) {
                return cars[i];
            }
        }
        return null;
    }

    @Override
    public Car[] findCarsByModel(String model) {
        return findCarsByPredicate (c -> model.equals(c.getModel()));
    }

    @Override
    public Car[] findCarsByCompany(String company) {
        return findCarsByPredicate(c -> company.equals(c.getCompany()));
    }

    @Override
    public Car[] findCarsByEngine(double min, double max) {
        return findCarsByPredicate(c -> c.getEngine() >= min && c.getEngine()<= max);
    }

    @Override
    public Car[] findCarsByColor(String color) {
        return findCarsByPredicate(c -> color.equals(c.getColor()));
    }

    private Car[] findCarsByPredicate(Predicate<Car> predicate) {
        int count = 0;
        for (int i = 0; i < size; i++) { // обегаем массив
            if(predicate.test(cars[i])) { // проверяем все элементы массива на тест в предикате
                count++;
            }
        }
       Car[] res = new Car[count];
        // fill array
        for (int i = 0, j = 0; j < res.length ; i++) {
            if(predicate.test(cars[i])) {
                res[j] = cars[i];
                j++;
            }
        }
        return res;
    }

    @Override
    public int size() {
        return size;
    }
}
