package com.greenfox.rueppellii.seadog.week08day4.reddit;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    Iterable<Comment> findAllByOrderByVoteDesc();
}
