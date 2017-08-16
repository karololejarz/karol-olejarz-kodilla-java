package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BoardConfig {

    TaskList toDoList;
    TaskList inProgressList;
    TaskList doneList;

    @Bean
    public Board newBoard(){
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name="toDo")
    public TaskList getToDoList() {
        return new TaskList(TaskList.tasks);
    }

    @Bean(name="inProgress")
    public TaskList getInProgressList() {
        return new TaskList(TaskList.tasks);
    }

    @Bean(name="Done")
    public TaskList getDoneList() {
        return new TaskList(TaskList.tasks);
    }

}
