package practice.sentencies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    Sentence sentence; // поле класса типа Sentence

    @BeforeEach
    void setUp() {
        sentence = new Sentence(); // вызвали пустой конструктор, который есть по умолчанию у всех объектов
    }

    @Test
    void countWordsTest() {
        String str = "One – two - three , four.";
        assertEquals(4, sentence.countWords(str));
    }

    @Test
    void countSymbolsTest() {
        String str = "One? Two. Three%";
        assertEquals(16, sentence.countSymbols(str));

    }
}