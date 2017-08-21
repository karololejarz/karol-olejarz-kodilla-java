package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    Book book1 = new Book("Title1", "Author1", LocalDate.now());
    Book book2 = new Book("Title2", "Author1", LocalDate.now());
    Book book3 = new Book("Title3", "Author1", LocalDate.now());
    Library library = new Library("original");

    @Test
    public void testGetBooks() {
        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        System.out.println(library);

        Library shallowCopy = null;
        try {
            shallowCopy = library.shallowCopy();
            shallowCopy.setName("shallowCopy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Assert.assertEquals(true, shallowCopy.getBooks().contains(book1));
        Assert.assertEquals(true, shallowCopy.getBooks().contains(book2));
        Assert.assertEquals(true, shallowCopy.getBooks().contains(book3));
        System.out.println(shallowCopy);

        Library deepCopy = null;
        try {
            deepCopy = library.deepCopy();
            deepCopy.setName("deepCopy");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Assert.assertEquals(true, deepCopy.getBooks().contains(book1));
        Assert.assertEquals(true, deepCopy.getBooks().contains(book2));
        Assert.assertEquals(true, deepCopy.getBooks().contains(book3));
        System.out.println(deepCopy);
    }
}
