package com.greenfox.rueppellii.seadog.week08day4.reddit.service;

import com.greenfox.rueppellii.seadog.week08day4.reddit.Comment;
import com.greenfox.rueppellii.seadog.week08day4.reddit.CommentRepository;
import com.greenfox.rueppellii.seadog.week08day4.reddit.Post;
import com.greenfox.rueppellii.seadog.week08day4.reddit.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PostService {

    private PostRepository postRepository;

    @Autowired
    public PostService(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    public Iterable<Post> listEverythingByVote() {
        return postRepository.findAllByOrderByVoteDesc();
    }

    public void saveNewPost(Post post) {
        postRepository.save(post);
    }

    public Post findPostByID(Long id) {
        return postRepository.findById(id).get();
    }

    public void upVote(Long id) {
        Post post = findPostByID(id);
        post.setVote(post.getVote() + 1);
        postRepository.save(post);
    }

    public void downVote(Long id) {
        Post post = findPostByID(id);
        post.setVote(post.getVote() - 1);
        postRepository.save(post);
    }

    public void deletePostById(Long id) {
        postRepository.deleteById(id);
    }

    public void saveCommentForPost(Long id, Comment comment) {
        Post post = findPostByID(id);
        post.getComments().add(comment);
        postRepository.save(post);
    }

//    public void editCommentUnderPost(Long id, Comment comment) {
//        Post post = findPostByID(id);
//        commentRepository.findCommentByPost_IdAndId(id, comment.getId());
//
//    }
}
