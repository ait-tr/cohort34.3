package practice.sentencies;

public class Sentence {

    // Count words in Sentence
    public int countWords(String str) {
        String[] words = str.split(" "); // разделяем предложение на слова
        int n = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("–") || words[i].equals("-") || words[i].equals(",")) {
                n++;
            }
        }
//        System.out.println(words.length);
//        System.out.println(n);
        return words.length - n;
    }

    // Count symbols in Sentence
    public int countSymbols(String str) {
        String[] symbols = str.split("");
        return symbols.length;
        // TODO исключить пробелы из результата метода

    }

}
