package homework;

public class MethodsAdvAppl {
    public static void main(String[] args) {
//        ## Написать аппликацию с методами для вычисления различных величин
//        1. Метод вычисляющий площадь круга;
//        2. Метод вычисляющий площадь квадрата;
//        3. Метод вычисляющий площадь прямоугольника (чуть сложнее чем 1. и 2.);
//        4. В методе main вызвать вышеуказанные методы с различными аргументами, и результаты вывести в консоль.

        double radius = 100;
        double sCircle = circleArea(radius);
        System.out.println("Circle area = " + sCircle);

        double side = 200;
        double sSquare = squareArea(side);
        System.out.println("Square area = " + sSquare);

        double a = 100;
        double b = 200;
        double sRectangle = squareRectangle(a, b);
        System.out.println("Rectangle area = " + sRectangle);

    }

    public static double circleArea(double r){
        double pi = 3.1415926;
        return pi * r * r;
    }

    public static double squareArea (double s){
        return s * s;
    }

    public static double squareRectangle(double a, double b){
        return a * b;
    }

}
