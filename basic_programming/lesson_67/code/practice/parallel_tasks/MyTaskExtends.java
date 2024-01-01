package practice.parallel_tasks;

public class MyTaskExtends extends Thread {

    String name;
    int max;

    public MyTaskExtends(String name, int max) {
        this.name = name;
        this.max = max;
    }

    @Override
    public void run() {
        System.out.println(name + " task started."); // доклад о начале работы
        // Считаем в цикле от 0 до max
        for (int i = 0; i < max; i++) {
            System.out.println(name + " cont " + i); // докладывает на каждом шаге цикла
            try {
                Thread.sleep(10); // положили поток спать
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println(name + " task finished.");
    }

}
