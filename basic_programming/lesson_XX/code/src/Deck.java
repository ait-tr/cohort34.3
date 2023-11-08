import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

// Класс Deck для представления колоды карт
public class Deck implements Iterable<Card> {
    private final Card[] CARDS;

    public Deck() {
        CARDS = new Card[40]; // предполагаем, что в колоде 40 карт
        fillDeck();
        shuffleDeck();
    }

    // заполнение колоды картами
    private void fillDeck() {
        String[] suits = {"Пики", "Червы", "Бубны", "Трефы"};
        int index = 0;
        for (String suit : suits) {
            for (int i = 1; i < 11; i++) {
                CARDS[index++] = new Card(i, suit);
            }
        }
    }

    // Метод для перемешивания колоды
    private void shuffleDeck() {
        Random rnd = new Random();
        for (int i = CARDS.length - 1; i > 0; i--) {
            int index = rnd.nextInt(i + 1);
            Card a = CARDS[index];
            CARDS[index] = CARDS[i];
            CARDS[i] = a;
        }
    }

    // Метод возвращает итератор для колоды
    @Override
    public Iterator<Card> iterator() {
        return new Iterator<>() {
            private int currentPosition;

            @Override
            public boolean hasNext() {
                return currentPosition < CARDS.length;
            }

            @Override
            public Card next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                return CARDS[currentPosition++];
            }
        };
    }
}
