package homework;

public class ArrayMethods1 {

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // ищем максимальный элемент массива целые числа
    public static int maxArray(int[] arr){
        int max = arr[0]; // первое приближение для max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // ищем индекс максимального элемента
    public static int maxArrayIndex(int[] arr){
        int max = arr[0]; // первое приближение для max
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    // ищем минимальный элемент массива целые числа
    public static int minArray(int[] arr){
        int min = arr[0]; // первое приближение для max
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // ищем индекс минимального элемента
    public static int minArrayIndex(int[] arr){
        int min = arr[0]; // первое приближение для max
        int minIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minIndex = i;
            }
        }
        return minIndex;
    }

    // сортировка выбором от меньшего к большему
    public static int[] sortArray(int[] arr){
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i + 1; j < arr.length; j++) {
                if( arr[j] < min ) {
                    min = arr[j];
                    indexMin = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMin];
            arr[indexMin] = tmp;
        }
        return arr;
    }

    //  сортировка выбором от большего к меньшему
    public static int[] sortArrayAsc(int[] arr){
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            max = arr[i];
            indexMax = i;
            for (int j = i; j < arr.length; j++) {
                if( arr[j] > max ) {
                    max = arr[j];
                    indexMax = j;
                }
            }
            // переставляем минимальный элемент в начало
            int tmp = arr[i];
            arr[i] = arr[indexMax];
            arr[indexMax] = tmp;
        }
        return arr;
    }

    // метод печатает разделитель
    public static void split(){
        System.out.println("---------------------------------------");
    }
}
