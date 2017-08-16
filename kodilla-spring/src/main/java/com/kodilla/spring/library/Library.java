package com.kodilla.spring.library;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public final class Library {
    private final List<String> books = new ArrayList<>();
    private LibraryDBController libraryDBController;

    public Library(final LibraryDBController libraryDBController) {
        this.libraryDBController = libraryDBController;
    }

    public Library() {
    }

    public void saveToDB() {
        libraryDBController.saveData();
    }

    public void loadFromDB() {
        libraryDBController.loadData();
    }
}