package homework.array_task;

//  Задан массив целых чисел {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2}. Найдите среднюю
//  величину по всем четным элементам массива.
//  Разработайте соответсвующий тест (набор тестов).

public class ArrayTask {
    public static void main(String[] args) {
        int[] array = {-5, 17, 23, -30, 22, 18, -3, 77, 19, -2};
        double result = averageEvenElements(array);
        System.out.println(result);
    }

    public static double averageEvenElements(int[] arr){
        double result = 0;
        int sum = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] % 2 == 0) {
                sum += arr[i];
                count++;
            }
        }
        result = (double) sum / count;
        return result;
    }
}
