// Класс Card для представления карты
public class Card implements Comparable<Card> {
    private final int value;
    private final String suit;

    public Card(int value, String suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    @Override
    public String toString() {
        return suit + " " + value;
    }

    @Override
    public int compareTo(Card o) {
        int suiteCompare = suit.compareTo(o.suit);
        if (suiteCompare != 0) {
            return suiteCompare;
        }
        return Integer.compare(this.value, o.value);
    }
}
