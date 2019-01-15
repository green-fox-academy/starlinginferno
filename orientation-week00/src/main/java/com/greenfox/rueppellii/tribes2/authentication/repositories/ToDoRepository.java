package com.greenfox.rueppellii.tribes2.authentication.repositories;

import com.greenfox.rueppellii.tribes2.authentication.models.ToDo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {

    List<ToDo> findAllByApplicationUser_Id(Long id);
}
