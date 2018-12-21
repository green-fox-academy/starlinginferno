package com.greenfox.rueppellii.seadog.week08day4.reddit;

import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {

    Iterable<Comment> findAllByOrderByVoteDesc();

    Iterable<Comment> findAllByPost_IdOrderByCreatedAt(Long id);

    Comment findCommentByPost_IdAndId(Long postId, Long commentId);

    Comment findCommentByPost_Id(Long postId);
}
