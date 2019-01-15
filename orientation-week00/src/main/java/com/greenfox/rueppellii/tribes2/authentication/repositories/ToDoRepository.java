package com.greenfox.rueppellii.tribes2.authentication.repositories;

import com.greenfox.rueppellii.tribes2.authentication.models.ToDo;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends CrudRepository<ToDo, Long> {

    List<ToDo> findAllByUser_Id(Long id);
}
