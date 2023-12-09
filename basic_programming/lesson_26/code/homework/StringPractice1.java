package homework;

//      * Распечатать последний символ строки.
//      * Найти позицию подстроки “Java” в строке.
//      * Проверить, содержит ли заданная строка подстроку “Java”.
//      * Заменить все символы “o” на “a”.
//      * Преобразуйте строку к верхнему регистру.
//      * Преобразуйте строку к нижнему регистру.
//      * Вырезать подстроку Java c помощью метода substring().
//      * Проверить, заканчивается ли строка подстрокой “!!!”.
//      * Проверить, начинается ли строка подстрокой “I'm proud”.

public class StringPractice1 {
    public static void main(String[] args) {

        String str = "I'm proud to learn Java! Java is the most famous programming language!!!";
        //      * Распечатать последний символ строки.
        System.out.println(str.charAt(str.length() - 1));
        //      * Найти позицию подстроки “Java” в строке.
        int index = str.indexOf("Java"); // с какого индекса начинается подстрока "Java"
        System.out.println(index);
        //      * Заменить все символы “o” на “a”.
        System.out.println(str.replace("o", "a"));
        //      * Преобразуйте строку к верхнему регистру.
        System.out.println(str.toUpperCase());
        //      * Преобразуйте строку к нижнему регистру.
        System.out.println(str.toLowerCase());
        //      * Вырезать подстроку Java c помощью метода substring().
        System.out.println(str.substring(19,23)); // печатаем подстроку с индекса до индекса
        //      * Проверить, заканчивается ли строка подстрокой “!!!”.
        System.out.println(str.endsWith("!!!"));
        //      * Проверить, начинается ли строка подстрокой “I'm proud”.
        System.out.println(str.startsWith("I'm proud"));
    }
}
