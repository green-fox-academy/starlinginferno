package com.greenfox.rueppellii.seadog.week08day1.todo.todo;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {
}