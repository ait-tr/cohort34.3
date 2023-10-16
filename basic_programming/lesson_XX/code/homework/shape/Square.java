package homework.shape;

public class Square extends Shape{
    public Square(double size) {
        super(size);
    }

    @Override
    public double calcArea(double size) {
        return size * size;
    }

    @Override
    public double calcPerimeter(double size) {
        return 4 * size;
    }
}
