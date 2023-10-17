package homework.shape;

//  1. Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//  2. Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.

public abstract class Shape {
    protected double size;

    public Shape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    //абстрактные методы
    public abstract double calcArea();

    public abstract double calcPerimeter();

}
