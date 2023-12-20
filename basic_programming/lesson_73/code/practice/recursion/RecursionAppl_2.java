package practice.recursion;

import java.util.Arrays;

//divide-and-conquer approach

public class RecursionAppl_2 {

	public static void main(String[] args) {
//		int res = factorialRecursion(5);
//		System.out.println(res);
//		int[] arr = { 2, 3, 5, 7, 11, 13, 17, 19 };
//		int index = binarySearchRecursion(arr, 17);
//		System.out.println(index);
//		double res = powRecursion(2, 4);
//		System.out.println(res);
//		int sum = sumArrayRecursion(arr);
//		System.out.println(sum);

		Integer[] arr = { 1, 3, 5, 7, 9, 11, 13, 15, 17, 19 };
		reverseArrayRecursion(arr);
		Arrays.stream(arr).forEach(System.out::println);
	}

	public static <T> void reverseArrayRecursion(T[] arr) {
		reverseArrayRecursion(arr, 0, arr.length - 1);
	}

	private static <T> void reverseArrayRecursion(T[] arr, int l, int r) {
		if (l >= r) {
			return;
		}
		T t = arr[l];
		arr[l] = arr[r];
		arr[r] = t;
		reverseArrayRecursion(arr, l + 1, r - 1);
	}

	public static int sumArrayRecursion(int[] arr) {
		return sumArrayRecursion(arr, 0);
	}

	private static int sumArrayRecursion(int[] arr, int i) {
		return i == arr.length - 1 ? arr[i] : arr[i] + sumArrayRecursion(arr, i + 1);
	}

	public static double powRecursion(double x, int n) {
		return n == 0 ? 1 : x * powRecursion(x, n - 1);
	}

	public static double pow(double x, int n) {
		double res = 1;
		for (int i = 1; i <= n; i++) {
			res *= x;
		}
		return res;
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

	public static int factorialRecursion(int n) {
		return n == 0 ? 1 : n * factorialRecursion(n - 1);
	}

	public static int factorial(int n) {
		int res = 1;
		for (int i = 1; i <= n; i++) {
			res *= i;
		}
		return res;
	}

}
