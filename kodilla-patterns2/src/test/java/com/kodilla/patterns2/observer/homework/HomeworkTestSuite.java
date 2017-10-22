package com.kodilla.patterns2.observer.homework;

import org.junit.Assert;
import org.junit.Test;

public class HomeworkTestSuite {
    @Test
    public void shouldGoWell() {
        MentorUser mentor1 = new MentorUser("Mentor1");
        MentorUser mentor2 = new MentorUser("Mentor2");
        PupilTopic pupil1 = new PupilTopic("Pupil1");
        PupilTopic pupil2 = new PupilTopic("Pupil2");
        PupilTopic pupil3 = new PupilTopic("Pupil3");
        PupilTopic pupil4 = new PupilTopic("Pupil4");
        PupilTopic pupil5 = new PupilTopic("Pupil5");
        PupilTopic pupil6 = new PupilTopic("Pupil6");
        Task task1 = new Task ("Task1",false);
        Task task2 = new Task ("Task2",false);
        pupil1.registerObserver(mentor1);
        pupil3.registerObserver(mentor1);
        pupil5.registerObserver(mentor1);
        pupil2.registerObserver(mentor2);
        pupil4.registerObserver(mentor2);
        pupil6.registerObserver(mentor2);
        pupil1.addTask(task1);
        pupil2.addTask(task1);
        pupil3.addTask(task1);
        pupil4.addTask(task1);
        pupil5.addTask(task1);
        pupil6.addTask(task1);
        pupil1.addTask(task2);
        pupil2.addTask(task2);
        pupil3.addTask(task2);
        pupil4.addTask(task2);
        pupil5.addTask(task2);
        pupil6.addTask(task2);
        pupil1.completeTask(task1);
        pupil2.completeTask(task1);
        pupil3.completeTask(task1);
        pupil4.completeTask(task1);
        pupil5.completeTask(task1);
        pupil6.completeTask(task1);
        pupil1.completeTask(task2);

        Assert.assertEquals(pupil1.getCompletedTasks().size(),2);
        Assert.assertEquals(pupil2.getCompletedTasks().size(),1);
        Assert.assertEquals(pupil3.getCompletedTasks().size(),1);
        Assert.assertEquals(pupil4.getCompletedTasks().size(),1);
        Assert.assertEquals(pupil5.getCompletedTasks().size(),1);
        Assert.assertEquals(pupil6.getCompletedTasks().size(),1);
    }
}
