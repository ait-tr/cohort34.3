package practice;

public class StringEqualsAppl {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = new String("Hello");
        System.out.println(str1);
        System.out.println(str2);
        boolean checker = str1.equals(str2);
        System.out.println(checker);
    }
}
