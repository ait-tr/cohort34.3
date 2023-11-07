package homework.array_methods;

// Реализуйте в классе ArrayMethods следующие методы для массивов целых чисел:
//        - сумма всех элементов массива;
//        - поиск элемента в массиве;

// Подсчитайте, сколько в этом массиве оказалось:
//        - положительных чисел;
//        - отрицательных чисел;
//        - четных чисел;
//        - нулей.

public class ArrayMethods {

    public int sumElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public int findElement(int[] arr, int el) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == el){
                index = i;
            }
        }
        return index;
    }

    public int sumPositiveElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public int sumNegativeElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public int sumEvenElements(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        return sum;
    }

    public int quantityOfZero(int[] arr) {
        int q = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]  == 0){
                q++;
            }
        }
        return q;
    }

}
