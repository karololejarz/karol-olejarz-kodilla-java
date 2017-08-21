package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class BoardConfig {

    @Bean
    public Board newBoard(){
        return new Board(getToDoList(), getInProgressList(), getDoneList());
    }

    @Bean(name="toDo")
    public TaskList getToDoList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("toDo1");
        return new TaskList(tasks);
    }

    @Bean(name="inProgress")
    public TaskList getInProgressList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("inProgress1");
        return new TaskList(tasks);
    }

    @Bean(name="done")
    public TaskList getDoneList() {
        List<String> tasks = new ArrayList<>();
        tasks.add("done1");
        return new TaskList(tasks);
    }

}
