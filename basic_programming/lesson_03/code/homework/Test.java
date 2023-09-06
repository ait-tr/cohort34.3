package homework;

public class Test {

    public static void main(String[] args) {
        lessonstarted();
        students();
        lessonover();
    }

    public static void lessonstarted(){
        System.out.println("lesson started!");
    }
    public static void students(){
        teacher();
        student1();
        student2();
        student3();
    }
    public static void lessonover(){
        System.out.println("lesson over!");
    }
    public static void teacher(){
        System.out.println("My name is John");
        System.out.println("I will teach you programming!");
    }
    public static void student1(){
        System.out.println("My name is Olga");
        System.out.println("I know Java well!");
    }
    public static void student2(){
        System.out.println("My name is Alex");
        System.out.println("I´m bad at computers!");
    }
    public static void student3(){
        System.out.println("My name is Ilya");
        System.out.println("I am good with computers and I can make a Telegram group for our course!");
    }
}
