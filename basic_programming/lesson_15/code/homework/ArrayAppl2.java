package homework;

public class ArrayAppl2 {
    public static void main(String[] args) {
        int[] array1 = new int[10];
        int[] array2 = new int[20];

        ArrayMethods2.fillArrayRandomInt(array1, -5, 5);
        ArrayMethods2.fillArrayRandomInt(array2, -10, 10);

        ArrayMethods2.printArray(array1); // печать до сортировки
        ArrayMethods2.bubbleSort(array1); // сортировка
        ArrayMethods2.printArray(array1); // печать после сортировки

        ArrayMethods2.split();

        ArrayMethods2.printArray(array2); // печать до сортировки
        ArrayMethods2.sortedSort(array2); // сортировка
        ArrayMethods2.printArray(array2); // печать после сортировки

    }
}
