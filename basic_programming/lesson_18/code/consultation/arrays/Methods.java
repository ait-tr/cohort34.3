package consultation.arrays;

public class Methods {
    // печать массива
    public static void printArray(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
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

    // bubble sort
    // сравниваем левый элемент с правым элементом (стоят рядом) и если левый больше правого, то
    // меняем местами. То есть "больший элемент" будет "всплывать" к правому концу массива.
    // arr[i] - текущий, arr[i+1] - это соседний элемент справа
    // этот цикл надо повторять после всплытия каждого пузырька
    public static int[] bubbleSort(int[] arr){
        // int tmp = 0;
        for (int i = 0; i < arr.length - 1 ; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

//    public static void bubbleSort(int[] arr){
//        for (int i = 0; i < arr.length - 1 ; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) { // правый конец будет двигаться к началу
//                if(arr[j] > arr[j + 1]) { // если левый из соседей больше правого, то их меняем местами
//                    int tmp = arr[j];
//                    arr[j] = arr[j+1];
//                    arr[j+1] = tmp;
//                }
//            }
//        }
//    }

}
