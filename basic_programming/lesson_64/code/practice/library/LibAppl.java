package practice.library;

import practice.library.model.Book;
import practice.library.model.Email;
import practice.library.model.Library;
import practice.library.model.Reader;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class LibAppl {
    public static void main(String[] args) {

        Library library = new Library();

        library.getBooks().forEach(System.out::println);

        System.out.println("----------------- Activities ---------------");
        library.getReaders().forEach(System.out::println);


        System.out.println("----------------- Books Unsorted ---------------");
        library.getBooks().forEach(System.out::println);

        System.out.println("----------------- Books Sorted ---------------");
        List<Book> listBooksByYearIssue = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getIssueYear))
                .toList();
        listBooksByYearIssue.forEach(System.out::println);

        System.out.println("----------------- Mailing List All Users ---------------");
//        ArrayList<Email> emailList = new ArrayList<>();
//        for (Reader reader : library.getReaders()) {
//            emailList.add(new Email(reader.getEmail()));
//        }
//        for (Email email : emailList) {
//            System.out.println(email);
//        }

        List<Email> addresses = library.getReaders().stream()
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();
        addresses.forEach(System.out::println);

        System.out.println("----------------- Mailing List Subscribed Users ---------------");
//        List<Email> addressesSubscribed = new ArrayList<>();
//        for (Reader reader : library.getReaders()){
//            if (reader.isSubscriber() && reader.getBooks().size() >= 1 )
//                addressesSubscribed.add(new Email(reader.getEmail()));
//        }
//        addressesSubscribed.forEach(System.out::println);

        List<Email> addressesSubscribed = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(r -> r.getBooks().size()>= 1)
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();
        addressesSubscribed.forEach(System.out::println);

        System.out.println("------------ List of Books ------------");
//        Set<Book> rentedBooks = new HashSet<>();
//        for (Reader reader : library.getReaders()) {
//            rentedBooks.addAll(reader.getBooks());
//        }
//        rentedBooks.forEach(System.out::println);

        List<Book> rentedBooks = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
        rentedBooks.forEach(System.out::println);

        System.out.println("----------------Max books rented -----------------------");
//        int max = 0;
//        for (Reader reader : library.getReaders()) {
//            if(reader.getBooks().size() > max){
//                max = reader.getBooks().size();
//            }
//        }
//        System.out.println(max);

        Integer res = library.getReaders().stream()
                .map(reader -> reader.getBooks().size())
                .reduce(0,(max, size) -> size > max ? size : max);
        System.out.println(res);

        System.out.println("-------------- List E-mails for User's group-----------------------");
        // Соберем всех пользователей, которые взяли более 2-х книг в группу "TO_MUCH", остальных
        // в группу с ключем "OK"

        Map<String, List<Email>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {
                    if (!result.containsKey("TOO_MUCH")) { // по этому ключу еще нет значений
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) { // по этому ключу еще нет значений
                        result.put("OK", new ArrayList<>());
                    }
                    result.get("OK").add(new Email(reader.getEmail()));
                }
            }
        }
        // Print keys and values - проход по всем ключам и их значениям
        for (String key : result.keySet()) {
            System.out.println("key: " + key + " value: " + result.get(key));
        }
        System.out.println("----------------------------------------------------");
        System.out.println(result.entrySet());

        System.out.println("=====================================================");
        Map<String, List<Email>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        mapping(r -> new Email(r.getEmail()), Collectors.toList())));
        System.out.println(map.entrySet());
        System.out.println("-------------------- Check Book ----------------------------------");
        // Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Л. Толстого.
        boolean check = checkBook(library, "Harper Lee");
        System.out.println(check);

        System.out.println("-------------------- Groups of Users II ----------------------------");
        Map<Integer, String> readersMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size(),
                        mapping(Reader::getFio, joining(", ", "{", "}"))));
        System.out.println(readersMap.entrySet());

        System.out.println("-------------------- Groups of Users III (from Yurii Koval) ----------------------------");
        Map<Integer, Reader> mapReader = library.getReaders().stream()
                .collect(Collectors.toMap(
                        reader -> reader.getBooks().size(),
                        reader -> reader
                ));

        System.out.println(mapReader.entrySet());

    } // end of main

    private static boolean checkBook(Library library, String author) {
        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> author.equals(book.getAuthor()));
        return match;
    }

}// end of main
