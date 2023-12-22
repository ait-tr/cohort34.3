package practice.recursion;

public class SquareRoot {
    public static void main(String[] args) {

        double root = sqrt(64);
        System.out.println(root);

    }

    public static double sqrt(double n) {
        return sqrtRecursive (n, n / 2); // новое приближение к результату
    }

    public static double sqrtRecursive (double n, double guess){
        double newGuess = (guess + n/guess) / 2; // новое приближение
        System.out.println(newGuess);
        if(Math.abs(newGuess - guess) < 0.0001) { //  считаем абсолютную величину разницы, модуль
                return newGuess;
        }
        return sqrtRecursive(n, newGuess);
    }
}
