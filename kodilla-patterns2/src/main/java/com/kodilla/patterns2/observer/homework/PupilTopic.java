package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class PupilTopic implements PupilObservable {
    private MentorObserver mentor;
    private final List<Task> allTasks;
    private final List<Task> completedTasks;
    private final String name;

    public PupilTopic(String name) {
        allTasks = new ArrayList<>();
        completedTasks = new ArrayList<>();
        this.name = name;
    }

    public void addTask(Task task) {
        allTasks.add(task);
        notifyObserver();
    }
    public void completeTask(Task task) {
        completedTasks.add(task);
        task.completeTask();
        notifyObserver();
    }
    @Override
    public void registerObserver(MentorObserver observer) {
        mentor=observer;
    }
    @Override
    public void notifyObserver() {
        mentor.update(this);
    }

    public List<Task> getAllTasks() {
        return allTasks;
    }

    public List<Task> getCompletedTasks() {
        return completedTasks;
    }

    public String getName() {
        return name;
    }
}
