package com.greenfox.rueppellii.seadog.week08day4.reddit.service;

import com.greenfox.rueppellii.seadog.week08day4.reddit.Post;
import com.greenfox.rueppellii.seadog.week08day4.reddit.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Post saveNewPost(Post post) {
        return postRepository.save(post);
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
}
