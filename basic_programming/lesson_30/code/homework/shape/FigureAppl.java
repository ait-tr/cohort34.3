package homework.shape;

//  3. Напишите класс FigureAppl с методом main. В методе создайте массив фигур. Добавьте в массив два круга,
//  один треугольник и один квадрат. Рассчитайте общую площадь и общий периметр всех фигур из массива фигур.

public class FigureAppl {
    public static void main(String[] args) {

        Shape[] fig = new Shape[4];

        fig[0] = new Circle(10);
        fig[1] = new Circle(100);
        fig[2] = new Triangle(100);
        fig[3] = new Square(100);

        double s = 0;
        double p = 0;
        for (int i = 0; i < fig.length; i++) {
            s = s + fig[i].calcArea();
            p = p + fig[i].calcPerimeter();
        }
        System.out.println("S = " + s);
        System.out.println("P = " + p);

        double circlesArea = totalCirclesArea(fig);
        System.out.println("Circles area = " + circlesArea);

    }

    private static double totalCirclesArea(Shape[] figures) {
        double res = 0;
        for (int i = 0; i < figures.length; i++) {
            if(figures[i] instanceof Circle) {
                res += figures[i].calcArea();
            }
        }
        return res;
    }
}
