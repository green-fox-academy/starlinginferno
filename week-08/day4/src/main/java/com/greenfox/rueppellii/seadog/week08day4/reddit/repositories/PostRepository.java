package com.greenfox.rueppellii.seadog.week08day4.reddit.repositories;

import com.greenfox.rueppellii.seadog.week08day4.reddit.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {

    Iterable<Post> findAllByOrderByVoteDesc();

    Iterable<Post> findAllByTitleContainsOrContentContains(String keyword, String keyword2);


}
