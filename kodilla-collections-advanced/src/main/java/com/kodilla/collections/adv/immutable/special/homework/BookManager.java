package com.kodilla.collections.adv.immutable.special.homework;

import java.util.HashSet;
import java.util.Set;

public class BookManager {
    private static Set<Book> books = new HashSet<>();

    public static Book createBook(String title, String author){
        Book book = new Book(title, author);
        if (books.contains (book)) {
            return book;
        }
        else {
            books.add(book);
            return book;
        }



    } }

