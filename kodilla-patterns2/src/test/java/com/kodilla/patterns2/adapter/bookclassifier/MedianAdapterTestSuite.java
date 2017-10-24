package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclassifier.librarya.Book;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        MedianAdapter adapter = new MedianAdapter();
        Set<Book> books = new HashSet<>();
        books.add(new Book("A1","T1",2001,"1"));
        books.add(new Book("A2","T2",2002,"2"));
        books.add(new Book("A3","T3",2003,"3"));
        books.add(new Book("A1","T4",2004,"4"));
        books.add(new Book("A2","T5",2005,"5"));
        books.add(new Book("A3","T6",2006,"6"));
        books.add(new Book("A3","T7",2007,"7"));

        int median = adapter.publicationYearMedian(books);
        Assert.assertEquals(median,2004);
    }
}