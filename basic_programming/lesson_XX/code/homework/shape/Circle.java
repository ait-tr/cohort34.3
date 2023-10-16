package homework.shape;

public class Circle extends Shape{

    public Circle(double size) {
        super(size);
    }


    @Override
    public double calcArea(double size) {
        return Math.PI * size * size;
    }

    @Override
    public double calcPerimeter(double size) {
        return 2 * Math.PI * size;
    }
}
