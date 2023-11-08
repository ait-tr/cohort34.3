package homework.array;

// Создать массив из 20-ти случайных целых чисел из интервала от -100 до 100.
// Выполните сортировку полученного массива.
// Попало ли число 0 в этот массив? (выяснить с помощью binary search)
// Если да, то на какое место (индекс) в массиве?
// Если нет, то на какой индекс его следует поставить?

public class Appl {
    public static void main(String[] args) {

        int[] array = Methods.fillArray(10, -100, 100);
        Methods.printArray(array);
        Methods.selectedSort(array);
        Methods.printArray(array);
        int index = Methods.binarySearch(array, 0);
        System.out.println("Index = " + index);
        if (index >= 0) {
            System.out.println(0 + " presents in array, index = " + index);
        } else {
            System.out.println(0 + " doesn't presetn in array, index for possible position is " + (-index -1));
        }
        Methods.split();
        int[] array1 = Methods.fillArray(10, -100, 100);
        Methods.printArray(array1);
        int[] array2 = Methods.positiveNumbers(array1);
        Methods.printArray(array2);

    }
}
