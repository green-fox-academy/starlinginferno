package com.greenfox.rueppellii.seadog.week08day4.reddit.models;

import com.greenfox.rueppellii.seadog.week08day4.reddit.models.Post;

public class PostDTO {

    private Iterable<Post> posts;
    private Long postCount;

    public PostDTO() {
    }

    public Iterable<Post> getPosts() {
        return posts;
    }

    public void setPosts(Iterable<Post> posts) {
        this.posts = posts;
    }

    public Long getPostCount() {
        return postCount;
    }

    public void setPostCount(Long postCount) {
        this.postCount = postCount;
    }
}
