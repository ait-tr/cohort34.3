package homework.shape;

public class Circle extends Shape{

    public Circle(double size) {
        super(size);
    }

    @Override
    public double calcArea() {
        return Math.PI * size * size;
    }

    @Override
    public double calcPerimeter() {
        return 2 * Math.PI * size;
    }

}
