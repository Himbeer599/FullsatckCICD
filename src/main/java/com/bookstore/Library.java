package com.bookstore;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Library {
    private Book[] books;
    public Library(Book[] books){
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                " books=" + Arrays.toString(books) +
                '}';
    }

    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell", "978-0451524935");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565");
        Book[] books = {book1, book2, book3};
        Library library = new Library(books);
        System.out.println(library);
    }
}
