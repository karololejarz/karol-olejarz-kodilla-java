package com.kodilla.patterns.factory.tasks;

import java.util.HashMap;

public final class TaskFactory {
    public static final String DRIVING = "DRIVING";
    public static final String PAINTING = "PAINTING";
    public static final String SHOPPING = "SHOPPING";

    public final Task createTask(final String taskClass) {
        switch(taskClass){
            case DRIVING:
                return new DrivingTask("Drive home using car","Home","Car");
            case PAINTING:
                return new PaintingTask("Paint red rectangle","Red","Rectangle");
            case SHOPPING:
                return new ShoppingTask("Buy 19.5 euro", "Carrots", 19.5);
            default:
                return null;
        }
    }
}
