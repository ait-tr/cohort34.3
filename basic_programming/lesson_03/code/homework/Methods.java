package homework;

public class Methods {

    //        1. Метод main вызывает method1. method1 вызывает method2. method2 вызывает method3.
//        2. В каждом методе должно происходить следующее:
//        + Печатает в консоль информацию, что метод такой-то стартовал
//                + Вызывает следующий метод
//        + Печатает в консоль, что метод такой-то финишировал

    public static void main(String[] args) {
        method1();

    }

    public static void method1(){
        System.out.println("Method 1 is starting.");
        method2();
        System.out.println("Method 1 is finished.");
    }

    public static void method2(){
        System.out.println("Method 2 is starting.");
        method3();
        System.out.println("Method 2 is finished.");
    }

    public static void method3(){
        System.out.println("Method 3 is starting.");
        System.out.println("Method 3 is finished.");
    }

}
