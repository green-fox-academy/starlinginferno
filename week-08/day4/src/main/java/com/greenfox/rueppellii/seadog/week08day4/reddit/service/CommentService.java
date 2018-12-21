package com.greenfox.rueppellii.seadog.week08day4.reddit.service;

import com.greenfox.rueppellii.seadog.week08day4.reddit.Comment;
import com.greenfox.rueppellii.seadog.week08day4.reddit.CommentRepository;
import com.greenfox.rueppellii.seadog.week08day4.reddit.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;
    private PostService postService;

    @Autowired
    public CommentService(CommentRepository commentRepository, PostRepository postRepository, PostService postService) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
        this.postService = postService;
    }

//    public Iterable<Comment> listCommentsByVote() {
//        return commentRepository.findAllByOrderByVoteDesc();
//    }

    public void saveNewComment(Comment comment) {
        commentRepository.save(comment);
    }

    public void addCommentByPostId(Long postId, Comment comment) {
        postService.saveCommentForPost(postId, comment);
    }

    public Iterable<Comment> findCommentsByID(Long id) {
        return commentRepository.findAllByPost_IdOrderByCreatedAt(id);
    }

    public Comment findCommentByIDs(Long postId, Long commentId) {
        return commentRepository.findCommentByPost_IdAndId(postId, commentId);
    }

    public Comment findCommentByPostId(Long postId) {
        return commentRepository.findCommentByPost_Id(postId);
    }

//    public void upVoteComment(Long id) {
//        Comment comment = findCommentByID(id);
//        comment.setVote(comment.getVote() + 1);
//        commentRepository.save(comment);
//    }
//
//    public void downVoteComment(Long id) {
//        Comment comment = findCommentByID(id);
//        comment.setVote(comment.getVote() - 1);
//        commentRepository.save(comment);
//    }

    public void deleteCommentById(Long id) {
        commentRepository.deleteById(id);
    }
}
