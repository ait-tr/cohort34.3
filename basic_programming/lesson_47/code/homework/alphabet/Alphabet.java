package homework.alphabet;

import java.util.ArrayList;
import java.util.List;

public class Alphabet {
    public static void main(String[] args) {

        List<Character> alphabet = new ArrayList<>();
        for (int i = 0; i < 26; i++) {
            alphabet.add((char) (i + 65));
        }

        for (Character ch : alphabet) {
            System.out.print(ch + " | ");
        }
    }
}
