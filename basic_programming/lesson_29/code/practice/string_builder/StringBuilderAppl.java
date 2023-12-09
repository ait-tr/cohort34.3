package practice.string_builder;

public class StringBuilderAppl {
    public static void main(String[] args) {
        // StringBuilder - это класс, в нем есть полезные методы для работы со строками
        // append - добавить

        String str = "Java";
        // str = str + "_" + 11
        str = str.concat("_"); // concat - это склеивание
        str = str.concat("" + 11); // к строке добавляем примитив int
        System.out.println(str);

        // StringBuilder - mutable!
        StringBuilder sb = new StringBuilder("Java");
        System.out.println(sb);
        sb.append("_").append(11);
        System.out.println(sb); // объект sb - мутирует
        sb.reverse(); // строка задом наперед
        System.out.println(sb);
        // можно ли вернуть тип StringBuilder обратно в тип String?
        str = sb.toString(); // да, можно
        System.out.println(str);

    }
}
