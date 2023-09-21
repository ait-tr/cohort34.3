package homework;

// Напишите метод, принимающий массив целых чисел, и печатающий его в обратном порядке.
// Сначала последний элемент, потом предпоследний, и т.д.
//
// Измените (лучше скопируйте и сделайте еще один метод) метод так, чтобы он работал с массивом,
// заполненном "цифрами прописью":
// zero, one, two, three, ..., nine
//  Выполните "разворот" это массива.

public class ArrayTask1 {
    public static void main(String[] args) {

        // int[] myArrayNew = new int[5]; // здесь только объявляем

        int[] myArray = {10, 20, 30, 40, 50}; // объявили и заполнили массив из целых чисел
        printArray(myArray); // вызываем метод, передаем на вход массив myArray
        printArrayReverse(myArray); // вызываем еще один метод, передаем на вход массив myArray

        // объявили и заполнили массив типа String
        String[] digitInWord = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        printArrayString(digitInWord); // печатаем массив
        reverseArrrayString(digitInWord); // вызываем метод для разворота массива
        printArrayString(digitInWord); // печатаем массив

    }

    public static void reverseArrrayString(String[] arr){
        String temp = "";
        for (int i = 0; i < arr.length/2 ; i++) {
            temp = arr[i]; // берем левый элемент во временную переменную
            arr[i] = arr[arr.length - 1 - i]; // переносим правый элемент на место левого
            arr[arr.length - 1 - i] = temp; // место правого ставим тот, что во временной переменной
        }
    }

    public static void printArrayString(String[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArrayReverse(int[] arr){
        for (int i = arr.length - 1 ; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

}
