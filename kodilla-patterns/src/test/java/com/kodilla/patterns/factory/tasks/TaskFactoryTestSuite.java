package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;

public class TaskFactoryTestSuite {
    TaskFactory factory = new TaskFactory();
    Task driving = factory.createTask(TaskFactory.DRIVING);
    Task painting = factory.createTask(TaskFactory.PAINTING);
    Task shopping = factory.createTask(TaskFactory.SHOPPING);

    @Test
    public void testTaskFactory() {
        Assert.assertEquals("Drive home using car",driving.getTaskName());
        Assert.assertEquals("Paint red rectangle",painting.getTaskName());
        Assert.assertEquals("Buy 19.5 euro",shopping.getTaskName());
        Assert.assertEquals(false,driving.isTaskExecuted());
        Assert.assertEquals(false,painting.isTaskExecuted());
        Assert.assertEquals(false,shopping.isTaskExecuted());
        System.out.println(driving);
        System.out.println(painting);
        System.out.println(shopping);

        System.out.println("Executing...");
        driving.executeTask();
        painting.executeTask();
        shopping.executeTask();
        Assert.assertEquals(true,driving.isTaskExecuted());
        Assert.assertEquals(true,painting.isTaskExecuted());
        Assert.assertEquals(true,shopping.isTaskExecuted());
        System.out.println(driving);
        System.out.println(painting);
        System.out.println(shopping);


    }
}
