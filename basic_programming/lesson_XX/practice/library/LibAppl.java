package practice;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

public class LibAppl {
    public static void main(String[] args) {

        Library library = new Library();

        library.getBooks()
                .forEach(System.out::println);

        System.out.println("-------------------------------");

        library.getReaders()
                .forEach(System.out::println);

        System.out.println("------------ Books Unsorted  ------------");

//        for (Book book: library.getBooks()) {
//            System.out.println(book);
//        }

        library.getBooks().forEach(System.out::println);

        System.out.println("------------ Books Sorted  ------------");
        List<Book> listBooksByYearIssue = library.getBooks().stream()
                .sorted(Comparator.comparing(Book::getAuthor))
                .toList();

        listBooksByYearIssue.forEach(System.out::println);

        System.out.println("------------ Readers ------------");
        List<String> readers = library.getReaders().stream()
                .map(r -> r.getFio() + ", " + r.getEmail())
                .toList();

        readers.forEach(System.out::println);

        System.out.println("------------ Mailing List All Users------------");

//        ArrayList<Email> emailList = new ArrayList<>();
//        for (Reader reader : library.getReaders()) {
//            emailList.add(new Email(reader.getEmail()));
//        }
//        for (Email r : emailList) {
//            System.out.println(r);
//        }

        List<Email> addresses = library.getReaders().stream()
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();
        addresses.forEach(System.out::println);

        System.out.println("------------ Mailing List Subscribed Users ------------");
//        List<Email> addressesSubscribed = new ArrayList<>();
//        for (Reader reader : library.getReaders()){
//            if (reader.getBooks().size() >=  && 1reader.isSubscriber())
//                addressesSubscribed.add(new Email(reader.getEmail()));
//        }
//        addressesSubscribed.forEach(System.out::println);

        List<Email> addressesSubscribed = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .filter(r -> r.getBooks().size() >= 1)
                .map(Reader::getEmail)
                .map(Email::new)
                .toList();
        addressesSubscribed.forEach(System.out::println);

        System.out.println("------------ List of Books ------------");
//        Получить список всех книг, взятых читателями.
//        Список не должен содержать дубликатов (книг одного автора, с одинаковым названием и годом издания).
        // List<book> rentedBooks = new ArrayList<>(); // это будет список с дубликатами
//        Set<Book> rentedBooks = new HashSet<>(); // сделаем множество
//        for (Reader reader : library.getReaders()) {
//            rentedBooks.addAll(reader.getBooks());
//        }
//        rentedBooks.forEach(System.out::println);

        List<Book> rentedBook = library.getReaders().stream()
                .flatMap(r -> r.getBooks().stream())
                .distinct()
                .collect(Collectors.toList());
        rentedBook.forEach(System.out::println);

        System.out.println("--------------- Is the book rented anyone?  -------------");
        // Проверить, взял ли кто-то из читателей библиотеки какие-нибудь книги Л. Толстого.
        boolean check = checkBook(library, "Джорж Оруэлл");
        System.out.println(check);

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
                .reduce(0, (max,size) -> size > max ? size : max);
        System.out.println(res);

        System.out.println("-------------- E-mails for User's group-----------------------");
        // Соберем всех пользователей, которые взяли более 2-х книг в группу "TO_MUCH", остальных
        // в группу с ключем "OK"
        Map<String, List<Email>> result = new HashMap<>();
        for (Reader reader : library.getReaders()) {
            if (reader.isSubscriber()) {
                if (reader.getBooks().size() > 2) {
                    if (!result.containsKey("TOO_MUCH")) {
                        result.put("TOO_MUCH", new ArrayList<>());
                    }
                    result.get("TOO_MUCH").add(new Email(reader.getEmail()));
                } else {
                    if (!result.containsKey("OK")) {
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

        System.out.println("------------------------------------------------");
        System.out.println(result.entrySet());
        System.out.println("=================================================");
        Map<String, List<Email>> map = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        mapping(r -> new Email(r.getEmail()), Collectors.toList())));

        System.out.println(map.entrySet());

        System.out.println("-------------------- Groups of Users ----------------------------");

        Map<String, String> readersFIOMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size() > 2 ? "TOO_MUCH" : "OK",
                        mapping(Reader::getFio, joining(", ", "{", "}"))));
        System.out.println(readersFIOMap.entrySet());

        System.out.println("-------------------- Groups of Users II ----------------------------");
        Map<Integer, String> readersMap = library.getReaders().stream()
                .filter(Reader::isSubscriber)
                .collect(groupingBy(r -> r.getBooks().size(),
                        mapping(Reader::getFio, joining(", ", "{", "}"))));
        System.out.println(readersMap.entrySet());


    } // end of main

    private static boolean checkBook(Library library, String author) {

        boolean match = library.getReaders().stream()
                .flatMap(reader -> reader.getBooks().stream())
                .anyMatch(book -> author.equals(book.getAuthor()));
        return match;

//        boolean result = false;
//        for (Reader reader : library.getReaders()){
//            for (Book book :reader.getBooks()){
//                if (author.equals(book.getAuthor())){
//                    result = true;
//                    break;
//                }
//            }
//        }
//        return result;
    }
}
