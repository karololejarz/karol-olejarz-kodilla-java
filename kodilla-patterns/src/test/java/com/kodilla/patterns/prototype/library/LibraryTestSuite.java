package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    Book book1 = new Book("Title1", "Author1", LocalDate.now());
    Book book2 = new Book("Title2", "Author1", LocalDate.now());
    Book book3 = new Book("Title3", "Author1", LocalDate.now());
    Library library1 = new Library("Library1");

    @Test
    public void cloneLibrary() {
        library1.addBook(book1);
        library1.addBook(book2);
        library1.addBook(book3);
        System.out.println(library1);

        Library shallowCopy = null;
        try {
            shallowCopy = library1.shallowCopy();
            shallowCopy.setName("Library2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Assert.assertEquals(true, shallowCopy.getBooks().contains(book1));
        Assert.assertEquals(true, shallowCopy.getBooks().contains(book2));
        Assert.assertEquals(true, shallowCopy.getBooks().contains(book3));
        System.out.println(shallowCopy);

        Library deepCopy = null;
        try {
            deepCopy = library1.deepCopy();
            deepCopy.setName("Library3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }
        Assert.assertEquals(true, deepCopy.getBooks().contains(book1));
        Assert.assertEquals(true, deepCopy.getBooks().contains(book2));
        Assert.assertEquals(true, deepCopy.getBooks().contains(book3));
        System.out.println(deepCopy);
    }
}
