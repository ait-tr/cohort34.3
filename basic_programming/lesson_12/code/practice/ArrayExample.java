package practice;

// Задан массив целых чисел: 75, 34, -15, -123, 57, -145, 86, 77, 48, -59.
// Найдите минимальный элемент массива и его индекс.
// Напечатайте все элементы массива с НЕчетными индексами.
// Найдите произведение всех четных элементов массива.

public class ArrayExample {
    public static void main(String[] args) {

        int[] array = {75, -250, -15, -123, 57, -145, 86, -250, 48, -251};

        int m = minElOfArray(array);
        System.out.println("Min element of array is: " + m);

        int i = minElOfArrayIndex(array);
        System.out.println("Index of Min element of array is: " + i);

    } // ==== end of main========
    // ================Methods===========

    public static int minElOfArrayIndex(int[] array){
        // пробегаем по массиву, каждый элемент сравним с min
        // если элемент будет меньше min, то делаем min = этому элементу
        int min = array[0];
        int indexMin = 0;
        for (int i = 0; i < array.length; i++) {
            if( array[i] <= min ) { // если элемент массива с индексом i меньше min
                min = array[i];
                indexMin = i;
            }
        }
        return indexMin;
    }

    public static int minElOfArray(int[] array){
        // пробегаем по массиву, каждый элемент сравним с min
        // если элемент будет меньше min, то делаем min = этому элементу
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if( array[i] < min ) { // если элемент массива с индексом i меньше min
                min = array[i];
            }
        }
        return min;
    }

    // ========end of methods============
}
