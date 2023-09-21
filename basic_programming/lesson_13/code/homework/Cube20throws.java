package homework;

// Бросьте кубик с 6-ю гранями 20 раз.
// Подсчитайте, сколько раз выпала каждая цифра.

public class Cube20throws {
    public static void main(String[] args) {

        int[] cubeGame = new int[20];

        int a = 1; // переменная для датчика случайных чисел, левый край отрезка
        int b = 6; // переменная для датчика случайных чисел, правый край отрезка

        // заполняем массив бросками кубика
        for (int i = 0; i < cubeGame.length; i++) {
            cubeGame[i] = (int) (Math.random() * (b - a + 1) + a);
        }

        printArray(cubeGame); // вызвал метод для печати

        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;

        for (int i = 0; i < cubeGame.length; i++) {
            int move = cubeGame[i];
            switch (move) {
                case 1 -> count1++;
                case 2 -> count2++;
                case 3 -> count3++;
                case 4 -> count4++;
                case 5 -> count5++;
                case 6 -> count6++;
            }
        }

        System.out.println("Digit 1 : " + count1);
        System.out.println("Digit 2 : " + count2);
        System.out.println("Digit 3 : " + count3);
        System.out.println("Digit 4 : " + count4);
        System.out.println("Digit 5 : " + count5);
        System.out.println("Digit 6 : " + count6);

    }
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
