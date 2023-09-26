package homework.array;

public class Methods {

    public static int[] positiveNumbers(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > 0){
                count++;
            }
        }
        int[] arrPositive = new int[count];
        int indexPositive = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] > 0 ){
                arrPositive[indexPositive] = arr[i];
                indexPositive++;
            }
        }
        return arrPositive;
    }

    public static int binarySearch(int[] arr, int n){
        int left = 0;
        int right = arr.length - 1;
        while (left<=right){
            int mid = (left + right) / 2;
            if (arr[mid] == n) {
                return mid;
            } else if (n < arr[mid]) {
                right = mid -1;
            } else {
                left = mid + 1;
            }
        }
        return - left - 1;
    }

    // сортировка выбором от меньшего к большему
    public static int[] selectedSort(int[] arr){
        int min = arr[0];
        int indexMin = 0;
        for (int i = 0; i < arr.length; i++) {
            min = arr[i];
            indexMin = i;
            for (int j = i; j < arr.length; j++) {
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

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] fillArray(int n, int a, int b){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        return arr;
    }

    public static void split(){
        System.out.println("-------------------------------");
    }

}
