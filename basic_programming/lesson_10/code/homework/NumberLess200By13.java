package homework;

//Распечатайте все числа меньшие 200 и кратные 13.

public class NumberLess200By13 {
    public static void main(String[] args) {

        int num = 10;
        while (num < 200){
            if(num % 13 == 0){
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println(); // переход на новую строку
        System.out.println("Done!");
    }
}
