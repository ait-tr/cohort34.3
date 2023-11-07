package practice;

public class UserAppl {
    public static void main(String[] args) {

        User user = new User("peter@gmail.com", "12345"); // создаем пользователя
        System.out.println(user); // печатаем

        user.setEmail("peter@gmail.com");
        System.out.println(user); // печатаем



    }
}
