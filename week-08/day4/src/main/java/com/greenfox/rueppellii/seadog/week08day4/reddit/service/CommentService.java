package com.greenfox.rueppellii.seadog.week08day4.reddit.service;

import com.greenfox.rueppellii.seadog.week08day4.reddit.Comment;
import com.greenfox.rueppellii.seadog.week08day4.reddit.CommentRepository;
import com.greenfox.rueppellii.seadog.week08day4.reddit.Post;
import com.greenfox.rueppellii.seadog.week08day4.reddit.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {

    private CommentRepository commentRepository;
    private PostRepository postRepository;
 //   private PostService postService;

    @Autowired
    public CommentService(CommentRepository commentRepository, PostRepository postRepository, PostService postService) {
        this.commentRepository = commentRepository;
        this.postRepository = postRepository;
//        this.postService = postService;
    }

    public void addCommentByPostId(Long postId, Comment comment) {
//        postService.saveCommentForPost(postId, comment);
    }

    public Iterable<Comment> findCommentsByID(Long id) {
        return commentRepository.findAllByPost_IdOrderByCreatedAt(id);
    }

    public void deleteCommentFromUnderPost(Long postId, Long commentId) {
        Post post = postRepository.findById(postId).get();
        post.getComments().remove(commentRepository.findById(commentId).get());
        postRepository.save(post);
    }

    public Comment findComment(Long id) {
        if (commentRepository.findById(id).isPresent()) {
            return commentRepository.findById(id).get();
        }
        return null;
    }

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
