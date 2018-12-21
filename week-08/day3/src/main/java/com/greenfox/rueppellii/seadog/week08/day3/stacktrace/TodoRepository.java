package com.greenfox.rueppellii.seadog.week08.day3.stacktrace;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface TodoRepository extends CrudRepository<Todo, Long> {

    List<Todo> findAllByTitleContains(String keyword);

    @Query(value="SELECT i FROM Post i where i.description=?2 and i.id<=?1")
    Todo gimmeThePosts(Long id, String desc);

    @Query(value="SELECT id FROM assignee;", nativeQuery = true)
    List<Integer> selectAssigneeIds();
}
