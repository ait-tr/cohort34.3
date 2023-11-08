import java.util.Arrays;

/**
 * @author Andrej Reutow
 * created on 08.11.2023
 */
public class Player {

    private final String name;
    private int totalScore;
    private Card[] currentCards;
    private int currentScore;

    public Player(String name) {
        this.name = name;
        this.currentCards = new Card[0];
    }

    public void addCard(Card card) {
        Card[] copied = Arrays.copyOf(this.currentCards, this.currentCards.length + 1);
        copied[copied.length - 1] = card;
        Arrays.sort(copied);
        this.currentCards = copied;

        this.currentScore += this.currentCards[copied.length - 1].getValue();
    }

    public void printPlayerCards() {
        System.out.println("#".repeat(30));
        System.out.println("Текущие карты игрока");
        for (Card currentCard : this.currentCards) {
            System.out.println(currentCard);
        }
        System.out.println("#".repeat(30));
    }

    public void addPointToTotalScore() {
        this.totalScore++;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public int getCurrentScore() {
        return currentScore;
    }

    public String getName() {
        return name;
    }

    public void resetRound() {
        this.currentScore = 0;
        this.currentCards = new Card[0];
    }

    @Override
    public String toString() {
        return name + '\'' +
                ", totalScore=" + totalScore +
                ", currentCards=" + Arrays.toString(currentCards) +
                ", currentScore=" + currentScore;
    }
}
