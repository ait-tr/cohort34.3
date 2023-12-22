package practice.recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] arr = {1, 3, 6, 9, 11, 13, 15, 17, 19, 21, 10}; // массив как есть
        Arrays.stream(arr).forEach(a-> System.out.print(a + " | "));
        System.out.println();
        // reverse {21, 19, 17, ... , 6, 3, 1}

        reverseArrayRecursion(arr); // разворот массива

        Arrays.stream(arr).forEach(a-> System.out.print(a + " | "));
        System.out.println();

    }

    public static <T> void reverseArrayRecursion(T[] arr){
        // меняем 1-й элемент с последним, потом второй с предпоследним и т.д.
        reverseArrayRecursion(arr, 0, arr.length - 1);
    }

    public static <T> void reverseArrayRecursion (T[] arr, int l, int r) {

        if(l >= r){
            return;
        }
        T tmp = arr[l];
        arr[l] = arr[r];
        arr[r] = tmp;
        reverseArrayRecursion(arr, l + 1, r - 1); // вызываем с новыми значениями
    }

}
