package homework;

// Задать в программе три стороны треугольника.
// Проверить выполнимость неравенства треугольника - любая из сторон должна быть меньше
// суммы двух других.
// Сообщить результат - существует или нет треугольник с заданными сторонами.

public class Triangle_1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int с = 15;

        if(a < b + с && b < a + с && с < a + b ){
            System.out.println("This triangle exists");
        } else {  // иначе, когда условие, которое стоит в скобках (), не выполнилось
            System.out.println("This triangle doesn't exists");
        }
    }
}
