package homework;

public class Test2 {
    public static void main(String[] args) {
        int[] cube = new int[20];
        int a = 1;
        int b = 6;
        randNum(cube, 1, 6);
        printArr(cube);
        period(cube);

        System.out.println();
    }

    public static void period(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int current = arr[i];
            int counter = 0;

            for (int j = 0; j < arr.length; j++) {
                if (current == arr[j]) {
                    counter++;
                }
            }
            System.out.println("Numbers: " + current + " repeat" + counter + " times");
        }
    }

    public static void randNum(int[] arr, int a, int b) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (b - a + 1) + a);
        }
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ,");
        }
        System.out.println();
    }
}

