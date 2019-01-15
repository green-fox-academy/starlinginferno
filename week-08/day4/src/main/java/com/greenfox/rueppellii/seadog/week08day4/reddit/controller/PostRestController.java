package com.greenfox.rueppellii.seadog.week08day4.reddit.controller;

import com.greenfox.rueppellii.seadog.week08day4.reddit.models.PostDTO;
import com.greenfox.rueppellii.seadog.week08day4.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostRestController {

    private PostDTO postDTO;
    private PostService postService;

    @Autowired
    public PostRestController(PostService postService) {
        this.postService = postService;
    }

    @GetMapping("/reddit/statistics")
    public PostDTO listPostsAndCountThem() {
        return postService.listPostsInJson();
    }
}
