package practice;

// Создайте массив, который содержит возраст студентов группы.
//        - какой возраст максимальный?
//        - какой возраст минимальный?
//        - есть ли однокурсники с одинаковым возрастом? Если да, то сколько студентов, у
//        которых одинаковый возраст?

public class AgeOfStudents {
    public static void main(String[] args) {

        int[] ageOfStudent = { 30, 18, 45, 52, 43, 25, 61, 38, 40, 35, 36, 45, 47, 34, 29, 22, 18};

        // ищем максимальный элемент массива
        int max = ageOfStudent[0]; // это первый кандидат на maximum
        int indexMax = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if( ageOfStudent[i] > max ) { // когда текущий элемент массива будет больше, чем max
                max = ageOfStudent[i]; // взяли максимальный элемент
                indexMax = i; // взяли его индекс
            }
        }
        System.out.println("Max age : " + max);
        System.out.println("Index of max element : " + indexMax);

        // ищем минимальный элемент массива
        int min = ageOfStudent[0]; // это первый кандидат на minimum
        int indexMin = 0;

        for (int i = 0; i < ageOfStudent.length; i++) {
            if( ageOfStudent[i] < min ) { // когда текущий элемент массива будет меньше, чем max
                min = ageOfStudent[i]; // взяли минимальный элемент
                indexMin = i; // взяли его индекс
            }
        }
        System.out.println("Min age : " + min);
        System.out.println("Index of min element : " + indexMin);

        // ищем дубликаты
        // идём по всем элементам массива, начиная с 0-го, и для него ищем совпадение
        // ответ выглядит так: есть дубликат, его индекс - ..., всего таких дубликатов - ...
        int duplicate = ageOfStudent[0]; // кандидат на дупликата
        int dCount = 0; // счетчик дупликатов
        int index = 0;
        for (int i = 0; i < ageOfStudent.length; i++) {
            for (int j = i + 1; j < ageOfStudent.length; j++) { // начинаем поиск дубликата со следующего элемента
                if(ageOfStudent[i] == ageOfStudent[j]) {
                    duplicate = ageOfStudent[i];
                    dCount++;
                    index = j; // TODO возможно index += j; - проверить
                    System.out.println("Duplicate : " + duplicate + " index: " + index);
                    System.out.println("Quality of duplicate : " + dCount);
                }
            }
        }
    }
}
