package homework;

public class Triangle {
    // некорректное с точки зрения математики решение
    public static void main(String[] args) {
        double a = 11;
        double h = 3;
        double s = sTriangle(a, h);
        System.out.println("S triangle = " + s);
    }

    public static double sTriangle(double a, double h){
        return 1.0 / 2.0 * a * h;
    }
}
