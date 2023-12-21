package practice.recursion;

public class Sqrt_recursion {
    public static void main(String[] args) {

        // square root

        double root = sqrt(64);
        System.out.println(root); // 10

    }

    public static double sqrt(double n) {
        return sqrtRecursive(n, n / 2); // Начальное предположение о корне
    }

    private static double sqrtRecursive(double n, double guess) {
        double newGuess = (guess + n/guess) / 2; // новое предположение о значении корня
        System.out.println((newGuess));

        if(Math.abs(newGuess - guess) < 0.0001){
            return newGuess;
        }

        return sqrtRecursive(n, newGuess);
    }


}
