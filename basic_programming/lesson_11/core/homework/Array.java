package homework;

// Создайте массив из целых чисел в интервале от 10 до 30.
// Выведите массив на печать.
// Поменяйте местами первый и последний элементы массива и снова выведите массив на печать.

public class Array {
    public static void main(String[] args) {

        int[] array = new int[21];

        for (int i = 0; i < array.length; i++) {
            array[i] = 10 + i;
            System.out.print(array[i] + " ");
        }



    }
}
