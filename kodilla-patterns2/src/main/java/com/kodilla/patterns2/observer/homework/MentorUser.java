package com.kodilla.patterns2.observer.homework;

import java.util.List;

public class MentorUser implements MentorObserver {
    private final String username;
    private List<PupilTopic> pupils;

    public MentorUser(String username) {
        this.username = username;
    }

    @Override
    public void update(PupilTopic pupil) {
        System.out.println(username + ": all tasks for pupil " + pupil.getName() + "\n" +
            " (total: " + pupil.getAllTasks().size() + ", done: " + pupil.getCompletedTasks().size() + ")");
    }

    public String getUsername() {
        return username;
    }

    public List<PupilTopic> getPupils() {
        return pupils;
    }

}
