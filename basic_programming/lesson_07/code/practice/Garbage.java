package practice;

import java.util.Scanner;

public class Garbage {
    public static void main(String[] args) {

        // ввод названия мусора - строкой, может быть много значений
        // желтый бак должен принять упаковки, пластик, пакеты
        // черный бак должен принять - отходы, мусор
        // синий бак - бумага

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input type of garbage: ");
        System.out.println("package, plastic, bag, rest, waste, paper, cartoon");
        String garbage = scanner.next(); // принимаем ответы пользователя

        if(garbage.equals("package")  | garbage.equals("plastic") | garbage.equals("bag") ){ // == не применяется для String
            System.out.println("Put it into '\n' yellow box ");
        } else if (garbage.equals("rest") | garbage.equals("waste")) {
            System.out.println("Put it into black box");
        } else {
            System.out.println("Put it into blue box");
        }
    }
}
