package homework.shape;

public class Square extends Shape {
    public Square(double size) {
        super(size);
    }

    @Override
    public double calcArea() {
        return size * size;
    }

    @Override
    public double calcPerimeter() {
        return 4 * size;
    }
}
