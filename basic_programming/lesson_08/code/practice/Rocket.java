package practice;
//  Запустить обратный отсчет старта ракеты от 10 до 0.
//  Последнее сообщение: "Поехали!...".
public class Rocket {
    public static void main(String[] args) {

        int countDown = 10;
        System.out.println("До старта осталось " + countDown);

        while (countDown > 0) {
            countDown--; // изменение параметра цикла
            System.out.println("До старта осталось " + countDown);
        }
        System.out.println("Поехали!...");
    }
}
