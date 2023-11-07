package practice.binary_search;

public class ArrayAppl3 {
    public static void main(String[] args) {

        int[] array = {-50, -10, 20, -100, 70, -10, 60, 40, 30, 50};

        ArrayMethods3.printArray(array); // напечатать
        ArrayMethods3.bubbleSort(array); // отсортировать
        ArrayMethods3.printArray(array); // напечатать
        ArrayMethods3.split();

        // вызываем binarySearch
        int index = ArrayMethods3.binarySearch(array, 20);
        System.out.println(index);
        index = ArrayMethods3.binarySearch(array, 40);
        System.out.println(index);

        int count = ArrayMethods3.searchDuplicate(array, -10);
        System.out.println("Duplicates: " + count);

    }
}
