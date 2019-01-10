package com.greenfox.rueppellii.seadog.week08day4.reddit;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByOrderByVoteDesc();

    Iterable<Post> findAllByTitleContainsOrContentContains(String keyword, String keyword2);


}
