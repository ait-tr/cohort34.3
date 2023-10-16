package homework.shape;

public class Triangle extends Shape{

    public Triangle(double size) {
        super(size);
    }

    @Override
    public double calcArea(double size) {
        return size * size * Math.sqrt(3) / 4;
    }

    @Override
    public double calcPerimeter(double size) {
        return 3 * size;
    }
}
