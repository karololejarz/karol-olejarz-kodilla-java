package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase) {
        this.libraryDatabase = libraryDatabase;
    }
    HashMap<Book, LibraryUser> allBooksBorrowed = new HashMap();

    public void borrowBook(Book book, LibraryUser user) {
        allBooksBorrowed.put(book, user);
    }

    public HashMap<Book, LibraryUser> listAllBooksBorrowed() {
        return allBooksBorrowed;
    }

    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    public HashMap<Book, LibraryUser> listBooksInHandsOf(LibraryUser libraryUser) {

        HashMap<Book, LibraryUser> bookList = new HashMap<>();

        for (Map.Entry<Book, LibraryUser> entry : listAllBooksBorrowed().entrySet()) {
            if (entry.getValue().equals(libraryUser)) {
                bookList.put(entry.getKey(), entry.getValue());
            }
        }

        System.out.println(bookList.keySet().toString());
        return bookList;
    }

}