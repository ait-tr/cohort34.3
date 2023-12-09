package consultation;

public class Coditions {
    public static void main(String[] args) {

        int a = 10;
        int b = -17;

        int min1 = (a < b) ? a : b; // тернарный оператор
        System.out.println(min1);

        System.out.println("=========================");
        // нахождение min с помощью if() ... else
        int min2 = 0;
        if (a < b) {
            min2 = a;
        } else {
            min2 = b;
        }
        System.out.println(min2);
    }
}
