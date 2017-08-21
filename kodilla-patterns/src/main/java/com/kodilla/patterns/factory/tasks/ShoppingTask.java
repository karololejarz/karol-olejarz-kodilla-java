package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {
    final String taskName;
    final String whatToBuy;
    final double quantity;
    boolean executed;

    public ShoppingTask(final String taskName, final String whatToBuy, final double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public void executeTask() {
        executed = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executed;
    }

    @Override
    public String toString() {
        return "ShoppingTask{" +
                "taskName='" + taskName + '\'' +
                ", whatToBuy='" + whatToBuy + '\'' +
                ", quantity=" + quantity +
                ", executed=" + executed +
                '}';
    }
}
