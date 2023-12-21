package practice.recursion;

public class Factorial {
    public static void main(String[] args) {

        int a = 10;
        System.out.println(factorialRecursion(30));

        System.out.println(factorial(30));

    }

    public static int factorialRecursion(int n) {
        return
                n == 0 ? 1 : n * factorialRecursion(n - 1);
    }

    public static int factorial(int n) {
        int res = 1;
        for (int i = 1; i <= n; i++) {
            res *= i;
        }
        return res;
    }

}
