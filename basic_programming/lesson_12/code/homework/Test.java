package homework;

public class Test {
    public static void main(String[] args) {

        int[] arrTen = new int[10];
        int a = -10;
        int b = 10;
        for (int i = 0; i < arrTen.length; i++) {
            arrTen[i] = (int) (Math.random() * (b - a + 1) + a);
        }
        for (int i = 0; i < arrTen.length; i++) {
            System.out.print(arrTen[i] + " | ");
        }
        System.out.println();

        int[] reversArrTen = new int[]{metReversTen(arrTen)};
        System.out.println("Reverse numbers is  ");

    }

    public static int metReversTen(int[] arrTen) {
        int res = 0;
        for (int i = arrTen.length - 1; i >= 0; i--) {
            System.out.print(arrTen[i] + " | ");
            res = arrTen[i];
        }

        return res;
    }

}
