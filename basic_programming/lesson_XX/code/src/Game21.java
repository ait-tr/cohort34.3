import java.util.Iterator;
import java.util.Scanner;

public class Game21 {
    public static void main(String[] args) {
        int roundCounter = 0;

        Deck deck = new Deck();
        // Iterator<Card> iterator = deck.iterator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите имя игрока:");
        Player player = new Player(scanner.nextLine());

        System.out.println("Добро пожаловать: " + player.getName());
        System.out.println();

        // Игровой процесс
        do {
            System.out.println("\nStart round " + ++roundCounter);
            System.out.println("#".repeat(30));

            System.out.println("Введите y что бы получить карту");
            String input = scanner.nextLine();
            if ("y".equalsIgnoreCase(input)) {
                Card card = iterator.next();
                System.out.println("Вы вытянули: " + card);
                player.addCard(card);
                System.out.println("вот все ваши карты:");
                player.printPlayerCards();
            }

            System.out.println("Введите e что завершить раунд");
            input = scanner.nextLine();
            if ("e".equalsIgnoreCase(input)) {
                if (player.getCurrentScore() > 21) {
                    System.out.println("Перебор! Начинаем с нуля.");
                } else if (player.getCurrentScore() == 21) {
                    System.out.println("21! Отлично!");
                    player.addPointToTotalScore();
                }
                player.resetRound();
            }

            System.out.println("\nEnd round " + roundCounter);
        } while (iterator.hasNext());

        System.out.println("Игра окончена. Ваш счёт: " + player.getTotalScore());
        scanner.close();
    }
}
