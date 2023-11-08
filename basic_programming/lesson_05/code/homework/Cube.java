package homework;

public class Cube {
    public static void main(String[] args) {

        double a = 100;
        double v = volume(a);
        System.out.println("Cube volume = " + v);
        double s = square(a);
        System.out.println("Cube square = " + s);
    }

    public static double volume(double a){
        return a * a * a;
    }

    public static double square(double a) {
        return 6 * a * a;
    }
}
