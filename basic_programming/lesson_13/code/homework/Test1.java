package homework;

public class Test1 {
    public static void main(String[] args) {
        int[] cube = new int[20];
        int a = 1;
        int b = 6;

        for (int i = 0; i < cube.length; i++) {
            cube[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        printArray(cube);

        int one = 0;
        int two = 2;
        int three = 3;
        int four = 4;
        int five = 5;
        int six = 6;
        for (int i = 0; i < cube.length; i++) {
            if (cube[i] == 1) {
                one++;
            } else if (cube[i] == 2) {
                two++;

            } else if (cube[i] == 3) {
                three++;

            } else if (cube[i] == 4) {
                four++;

            } else if (cube[i] == 5) {
                five++;

            } else {
                six++;
            }
        }
        System.out.println("one " + one);
        System.out.println("two " + two);
        System.out.println("three " + three);
        System.out.println("four " + four);
        System.out.println("five " + five);
        System.out.println("six " + six);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

    }
}
