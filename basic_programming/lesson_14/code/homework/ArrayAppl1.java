package homework;

public class ArrayAppl1 {
    public static void main(String[] args) {

        int[] xNum = {15, 0, 32, -39, 47, 51, 89, - 73, - 200, 101};

        ArrayMethods1.printArray(xNum);
        System.out.println(ArrayMethods1.minArray(xNum));
        System.out.println(ArrayMethods1.minArrayIndex(xNum));
        ArrayMethods1.split();
        ArrayMethods1.sortArray(xNum);
        ArrayMethods1.printArray(xNum);
        ArrayMethods1.split();
        ArrayMethods1.sortArrayAsc(xNum);
        ArrayMethods1.printArray(xNum);

    }
}
