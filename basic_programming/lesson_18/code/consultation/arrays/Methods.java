package consultation.arrays;

public class Methods {
    // печать массива
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void split(){
        System.out.println("----------------------------------------");
    }

    // метод заполняет массив длиной n элементов случайными числами в интервале от a до b
    public static int[] fillArray(int n, int a, int b){
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * (b - a + 1) + a);
        }
        return arr; // возвращаем массив (объект)
    }

    // сколько положительных в массиве?
    public static int positiveNum(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            // если элемент массива > 0 , то счетчик увеличим
            if (arr[i] >= 0) {
                count++;
            }
        }
        return count;
    }

    // поиск индекса максимального элемента массива
    public static int indexMaxEl(int[] arr){
        int max = arr[0];
        int indexMax = 0;
        for (int i = 0; i < arr.length; i++) {
            // если найдется еще больший элемент массива, то max = этому элементу
            if(arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }
        }
        return indexMax;
    }


}
