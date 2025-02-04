package com.bookstore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Library {
//    private Book[] books;
    private ArrayList<Book> books;
//    public Library(Book[] books){
//        this.books = books;
//    }
public Library(ArrayList<Book> books){
    this.books = books;
}

    @Override
    public String toString() {
        return "Library{" +
                "books=" + books +
                '}';
    }

    //    @Override
//    public String toString() {
//        return "Library{" +
//                " books=" + Arrays.toString(books) +
//                '}';
//    }
//    public void add(Book newBook){
//        books = Arrays.copyOf(books,books.length+1);
//        books[books.length-1] = newBook;
//    }
    public void add(Book newBook){
    books.add(newBook);
    }
    public void delete(Book deleteBook){
    books.remove(deleteBook);
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "978-0451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        ArrayList<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        Library library = new Library(books);
        System.out.println(library);
        Book book4 = new Book("Ahhh", "Max", "01234689");
        library.add(book4);
        System.out.println(library);
        System.out.println("delete book: "+book1);
    }
}
