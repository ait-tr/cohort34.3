package practice.recursion;

public class BinarySearchRecursion {
    public static void main(String[] args) {

        int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19 };
        int index = binarySearchRecursion(arr, 17);
        System.out.println(index);

    }

    public static int binarySearchRecursion(int[] arr, int value) {
        return binarySearchRecursion(arr, value, 0, arr.length - 1);
    }

    private static int binarySearchRecursion(int[] arr, int value, int l, int r) {
        if (l > r) {
            return -l - 1;
        }
        int mid = (l + r) / 2;
        if (arr[mid] == value) {
            return mid;
        }
        if (arr[mid] < value) {
            return binarySearchRecursion(arr, value, mid + 1, r);

        } else {
            return binarySearchRecursion(arr, value, l, mid - 1);
        }

    }

    public static int binarySearch(int[] arr, int value) {
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == value) {
                return mid;
            }
            if (arr[mid] < value) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return -l - 1;

    }
}
