package com.greenfox.rueppellii.seadog.week08day4.reddit.service;

import com.greenfox.rueppellii.seadog.week08day4.reddit.models.Comment;
import com.greenfox.rueppellii.seadog.week08day4.reddit.models.Post;
import com.greenfox.rueppellii.seadog.week08day4.reddit.models.PostDTO;
import com.greenfox.rueppellii.seadog.week08day4.reddit.models.User;
import com.greenfox.rueppellii.seadog.week08day4.reddit.repositories.CommentRepository;
import com.greenfox.rueppellii.seadog.week08day4.reddit.repositories.PostRepository;
import com.greenfox.rueppellii.seadog.week08day4.reddit.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    private PostRepository postRepository;
    private CommentRepository commentRepository;
    private UserRepository userRepository;

    @Autowired
    public PostService(PostRepository postRepository, CommentRepository commentRepository, UserRepository userRepository) {
        this.postRepository = postRepository;
        this.commentRepository = commentRepository;
        this.userRepository = userRepository;
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


    // Comments

    public Iterable<Comment> findCommentsByID(Long id) {
        return commentRepository.findAllByPost_IdOrderByCreatedAt(id);
    }

    public Comment findComment(Long id) {
        if (commentRepository.findById(id).isPresent()) {
            return commentRepository.findById(id).get();
        }
        return null;
    }

    public void saveCommentForPost(Long id, Comment comment) {
        Post post = findPostByID(id);
        int match = 0;
        boolean foundMatch = false;
        for (int i = 0; i < post.getComments().size(); i++) {
            if (post.getComments().get(i).getId().equals(comment.getId())) {
                match = i;
                foundMatch = true;
            }
        }
        if (foundMatch) {
            post.getComments().get(match).setContent(comment.getContent());
            comment.setPost(post);
            commentRepository.save(post.getComments().get(match));
            postRepository.save(post);
        } else {
            post.getComments().add(comment);
            comment.setPost(post);
            commentRepository.save(comment);
            postRepository.save(post);
        }
    }

    public void deleteCommentFromUnderPost(Long postId, Long commentId) {
        Post post = postRepository.findById(postId).get();
        Comment comment = commentRepository.findById(commentId).get();
        post.getComments().remove(comment);
        commentRepository.delete(comment);
        postRepository.save(post);
    }

    public PostDTO listPostsInJson() {
        PostDTO postDTO = new PostDTO();
        postDTO.setPosts(postRepository.findAll());
        postDTO.setPostCount(postRepository.count());
        return postDTO;
    }

    public Iterable<Post> searchPostsAndTitlesByKeyword(String keyword) {
        return postRepository.findAllByTitleContainsOrContentContains(keyword, keyword);
    }

    public void upvoteComment(Long postId, Long commentId) {
        Post post = findPostByID(postId);
        int match = 0;
        boolean foundMatch = false;
        for (int i = 0; i < post.getComments().size(); i++) {
            if (post.getComments().get(i).getId().equals(commentId)) {
                match = i;
                foundMatch = true;
            }
        }
        if (foundMatch) {
            post.getComments().get(match).setVote(post.getComments().get(match).getVote() + 1);
            commentRepository.findById(commentId).get().setPost(post);
            commentRepository.save(commentRepository.findById(commentId).get());
            postRepository.save(post);
        }
    }

    public void downvoteComment(Long postId, Long commentId) {
        Post post = findPostByID(postId);
        int match = 0;
        boolean foundMatch = false;
        for (int i = 0; i < post.getComments().size(); i++) {
            if (post.getComments().get(i).getId().equals(commentId)) {
                match = i;
                foundMatch = true;
            }
        }
        if (foundMatch) {
            post.getComments().get(match).setVote(post.getComments().get(match).getVote() - 1);
            commentRepository.findById(commentId).get().setPost(post);
            commentRepository.save(commentRepository.findById(commentId).get());
            postRepository.save(post);
        }
    }

    // Users

    public void saveUser(User user) {
        userRepository.save(user);
    }
}
