package consultation;

import java.util.Arrays;

public class BinarySearchEx {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 7, 9, 9, 9, 9, 9, 9, 15, 20, 23, 23, 23, 23, 25, 26, 30, 31};

        System.out.println(arr.length);

        int index = Arrays.binarySearch(arr, 9);
        System.out.println(index);

        index = Arrays.binarySearch(arr, 23);
        System.out.println(index);
        System.out.println(arr[14]);


    }
}
