package practice.user;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class UserAppl {
    public static void main(String[] args) {
        //  Ваша задача - создать список пользователей
//  выполнить фильтрацию с помощью лямбда-выражений и вывести результат на экран.
//  Найти всех пользователей старше 18 лет.
//  Найти всех пользователей младше 30 лет с именем, начинающимся на букву "A".

        List<User> userList = Arrays.asList(
                new User("Alice", 25),
                new User("Aob", 15),
                new User("Alex", 22),
                new User("Eve", 19),
                new User("Anna", 16),
                new User("John", 28),
                new User("Ali", 45)
        );

        // печать
        for (User user : userList) {
            System.out.println(user);
        }
        System.out.println();
        System.out.println("----------------------------");
        List<User> userList18 = findUserByPredicate(userList, user -> user.getAge() > 18 && user.getAge() < 25);

        // печать
        System.out.println("----------------------------");
        for (User user : userList18) {
            System.out.println(user);
        }
        System.out.println();
        System.out.println("----------------------------");

        List<User> userList30 = findUserByPredicate(userList, user -> user.getAge() < 30 && user.getName().charAt(0) == 'A');
        // печать
        System.out.println("----------------------------");
        for (User user : userList30) {
            System.out.println(user);
        }
        System.out.println();
        System.out.println("----------------------------");


    }

    private static List<User> findUserByPredicate(List<User> userList, Predicate<User> predicate) {
        List<User> resList = new ArrayList<>(); // создаем структуру для получения результата
        for (User user: userList ) {
            if(predicate.test(user)) { // если тест пройден (true)
                resList.add(user);
            }
        }
        return resList;
    }
}
