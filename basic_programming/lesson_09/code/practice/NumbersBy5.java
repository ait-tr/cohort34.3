package practice;

// Распечатать в консоли все числа от 1 до 100, которые делятся на 5 без остатка.

public class NumbersBy5 {
    public static void main(String[] args) {
        int count = 1;
        while ( count <= 100  ) {
            if ( count % 5 == 0) {
                System.out.print(count + " , " );
            }
            count++;
        }
    }
}
