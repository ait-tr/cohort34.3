package homework;

// Для всех задач задайте массив из 10 случайных чисел в интервале от -10 до 10.
// Протестируйте работу методов на созданном массиве.
//
//  ***Задача 1.***
//  Написать метод, принимающий массив целых чисел, и возвращающий сумму всех его
//  нечетных элементов (не индексы!, а сами элементы).
//
//  ***Задача 2.***
//  Написать метод, принимающий массив целых чисел, и возвращающий произведение
//  всех его элементов с четными индексами.
//
//  ***Задача 3.(*)***
//  Написать метод, принимающий массив целых чисел, и разворачивающий его.
//  Последний элемент становится нулевым, предпоследний, первым, и т. д.
//  Подсказка: этот метод должен изменить полученный массив.

public class ArrayMethods {
    public static void main(String[] args) {

        int[] myArray = new int[10];
        int a = -10;
        int b = 10;
        fillArray(myArray, -10, 10);
        printArray(myArray);
        System.out.println("=================================");
        System.out.println("Sum of odd elements is = " + sumOfOddElements(myArray));
        System.out.println("Multiplication of elements with even indexes is: " + multOfElEvenIndex(myArray));
        System.out.println("=================================");
        reverseArrray(myArray);
        printArray(myArray);
    }

    // reverse array
    public static void reverseArrray(int[] arr){
        int temp = 0;
        for (int i = 0; i < arr.length/2 ; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static int multOfElEvenIndex(int[] arr){
        int mult = 1;
        for (int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                mult *= arr[i];
            }
        }
        return mult;
    }

    public static int sumOfOddElements(int[] arr){
        int sumOfOddEl = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 != 0){
                sumOfOddEl += arr[i];
            }
        }
        return sumOfOddEl;
    }

    // filling array
    public static void fillArray(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }

    //print array
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
