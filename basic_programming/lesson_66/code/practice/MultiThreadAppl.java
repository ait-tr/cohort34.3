package practice;

public class MultiThreadAppl {

    private static final int MAX = 10;

    //    Чтобы новый тред стартовал, надо создать объект типа Thread передав в конструктор объект типа Runnable,
//    и после этого вызвать у объекта типа Thread метод start.
    public static void main(String[] args) {

        System.out.println("Main thread started"); // это начал работать 1-й tread

//        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX);
//        task.run(); // это запуск второго thread

        MyTaskImplements task = new MyTaskImplements("Parallel task", MAX); // создали задачу

        Thread thread = new Thread(task); // создали новый поток и передали ему эту задачу

        thread.start(); // поток запустили

        for (int i = 0; i < MAX; i++) {
            System.out.println("Main coun = " + i); // докладывает main
            try {
                Thread.sleep(10); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Main tread finished.");
    }
}
