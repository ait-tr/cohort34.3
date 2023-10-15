package homework.shape;

//  1. Создайте абстрактный класс Shape с типом поля double и абстрактными методами calcArea и calcPerimeter.
//  2. Создать классы Circle, Triangle, Square, расширяющие класс Shape и реализующие абстрактные методы.

public abstract class Shape {
    private double size;

    public Shape(double size) {
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public abstract double calcArea(double size);
    public abstract double calcPerimeter(double size);

}
