package homework.shape;

public class Triangle extends Shape{

    public Triangle(double size) {
        super(size);
    }

    @Override
    public double calcArea() {
        return size * size * Math.sqrt(3.0) / 4.0;
    }

    @Override
    public double calcPerimeter() {
        return 3 * size;
    }

}
