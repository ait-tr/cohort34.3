package homework.shape;

//  3. Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
//  один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class FigureAppl {
    public static void main(String[] args) {

        Shape[] fig = new Shape[4];

        fig[0] = new Circle(10);
        fig[1] = new Circle(100);
        fig[2] = new Triangle(10);
        fig[3] = new Square(10);

        double s = 0;
        double p = 0;
        for (int i = 0; i < fig.length; i++) {
            s = s + fig[i].calcArea(fig[i].getSize());
            System.out.println(fig[i].calcArea(fig[i].getSize()));
            p = p + fig[i].calcPerimeter(fig[i].getSize());
            System.out.println(fig[i].calcPerimeter(fig[i].getSize()));
        }
        System.out.println("S = " + s);
        System.out.println("P = " + p);

    }
}
