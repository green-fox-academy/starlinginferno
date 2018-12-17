package com.greenfox.rueppellii.seadog.week08day1.todo;

import com.greenfox.rueppellii.seadog.week08day1.todo.todo.Todo;
import com.greenfox.rueppellii.seadog.week08day1.todo.todo.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication implements CommandLineRunner {

    @Autowired
    private TodoRepository repo;

    public static void main(String[] args) {
        SpringApplication.run(TodoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repo.save(new Todo("I have to learn Object Relational Mapping"));
        repo.save(new Todo("I have to learn Object Relational Mapping"));
    }
}

