package ait.book;

import ait.book.model.Book;

public class BookAppl {
    public static void main(String[] args) {
        Book book0 = new Book(2000000000000l, "Book0", 1988);
        Book book1 = new Book(3000000000000l, "Book1", "Author1", 1998);
        Book book2 = new Book(4000000000000l, "Book2", "Author1", 1995);
        Book book3 = new Book(5000000000000l, "Book3", "Author2", 1990);
        Book book4 = new Book(6000000000000l, "Book4", 1981);
        book0.display();
        book1.display();
        book2.display();
        book3.display();
        book4.display();
    }
}
