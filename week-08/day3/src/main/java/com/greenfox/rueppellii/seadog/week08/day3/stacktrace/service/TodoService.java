package com.greenfox.rueppellii.seadog.week08.day3.stacktrace.service;

import com.greenfox.rueppellii.seadog.week08.day3.stacktrace.Todo;
import com.greenfox.rueppellii.seadog.week08.day3.stacktrace.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TodoService {

    private TodoRepository repository;

    @Autowired
    public TodoService(TodoRepository repository) {
        this.repository = repository;
    }

    public Iterable<Todo> list() {
        return repository.findAll();
    }

    public void saveTodo(Todo todo) {
        repository.save(todo);
    }

    public void deleteTodo(Long id) {
        repository.existsById(id);
    }

    public Optional<Todo> findTodoById(Long id) {
        return repository.findById(id);
    }

    public List<Todo> findByKeyword(String keyword) {
        return repository.findAllByTitleContains(keyword);
    }
}
