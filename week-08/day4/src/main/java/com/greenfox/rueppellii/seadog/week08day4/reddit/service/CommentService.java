package com.greenfox.rueppellii.seadog.week08day4.reddit.service;

import com.greenfox.rueppellii.seadog.week08day4.reddit.Comment;
import com.greenfox.rueppellii.seadog.week08day4.reddit.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {

    private CommentRepository commentRepository;

    @Autowired
    public CommentService(CommentRepository commentRepository) {
        this.commentRepository = commentRepository;
    }

    public Iterable<Comment> listCommentsByVote() {
        return commentRepository.findAllByOrderByVoteDesc();
    }

    public Comment saveNewComment(Comment comment) {
        return commentRepository.save(comment);
    }

    public Comment findCommentByID(Long id) {
        return commentRepository.findById(id).get();
    }

    public void upVoteComment(Long id) {
        Comment comment = findCommentByID(id);
        comment.setVote(comment.getVote() + 1);
        commentRepository.save(comment);
    }

    public void downVoteComment(Long id) {
        Comment comment = findCommentByID(id);
        comment.setVote(comment.getVote() - 1);
        commentRepository.save(comment);
    }

    public void deleteCommentById(Long id) {
        commentRepository.deleteById(id);
    }
}
