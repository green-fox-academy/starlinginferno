package com.greenfox.rueppellii.seadog.week08day4.reddit.controller;

import com.greenfox.rueppellii.seadog.week08day4.reddit.Comment;
import com.greenfox.rueppellii.seadog.week08day4.reddit.Post;
import com.greenfox.rueppellii.seadog.week08day4.reddit.service.CommentService;
import com.greenfox.rueppellii.seadog.week08day4.reddit.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/reddit")
public class PostController {

    private PostService postService;
    private CommentService commentService;

    @Autowired
    public PostController(PostService postService, CommentService commentService) {
        this.postService = postService;
        this.commentService = commentService;
    }

    @GetMapping("/")
    public String list(Model model) {
        model.addAttribute("posts", postService.listEverythingByVote());
        return "index";
    }

    @GetMapping("/submit")
    public String submit(@ModelAttribute(name="postItemObject") Post post, Model model) {
        model.addAttribute("postItemObject", post);
        return "newpost";
    }

    @PostMapping("/submit")
    public String submit(@ModelAttribute(name="postItemObject") Post post) {
        postService.saveNewPost(post);
        return "redirect:/reddit/";
    }

    @PostMapping("/{postID}/up")
    public String upVotePost(@PathVariable(value="postID") Long id) {
        postService.upVote(id);
        return "redirect:/reddit/";
    }

    @PostMapping("/{postID}/down")
    public String downVotePost(@PathVariable(value="postID") Long id) {
        postService.downVote(id);
        return "redirect:/reddit/";
    }

    @PostMapping("/{postID}/delete")
    public String deletePost(@PathVariable(value="postID") Long id) {
        postService.deletePostById(id);
        return "redirect:/reddit/";
    }

    @GetMapping("/{postID}/edit")
    public String editPost(@PathVariable(value="postID") Long id, Model model) {
        Post post = postService.findPostByID(id);
        model.addAttribute("postToEdit", post);
        return "edit";
    }

    @PostMapping("/{postID}/edit")
    public String editPost(@PathVariable(value="postID") Long id, @ModelAttribute(name="postToEdit") Post post) {
        postService.saveNewPost(post);
        return "redirect:/reddit/";
    }

    // Comments

    @GetMapping("/{postID}/post")
    public String seePost(@PathVariable(value="postID") Long id, Model model, @ModelAttribute(name="commentToEdit") Comment comment) {
        model.addAttribute("commentToEdit", comment);
        Post post = postService.findPostByID(id);
        model.addAttribute("originalPost", post);
        model.addAttribute("comments", commentService.findCommentsByID(id));
        return "content";
    }

    @PostMapping("/{postID}/post/add")
    public String addComment(@PathVariable(value="postID") Long id, @ModelAttribute(name="comment") Comment comment, Model model) {
     //   model.addAttribute("originalPostObject", postService.findPostByID(id));
//        if (comment != null) {
//            commentService.findComment(comment.getId()).setContent(comment.getContent());
//        }
//        commentService.addCommentByPostId(id, comment);
        postService.saveCommentForPost(id, comment);
        return "redirect:/reddit/{postID}/post";
    }

    @GetMapping("/{postID}/post/{commentID}/edit")
    public String editComment(@PathVariable(value="postID") Long postID, @PathVariable(value="commentID") Long commentID, RedirectAttributes attributes) {
        if (commentService.findComment(commentID) != null) {
            attributes.addFlashAttribute("commentToEdit", commentService.findComment(commentID));
            // postService.saveCommentForPost(postID, commentService.findComment(commentID));
        }
        return "redirect:/reddit/{postID}/post";
    }

    @PostMapping("/{postID}/post/{commentID}/delete")
    public String deleteComment(@PathVariable(value="postID") Long postID, @PathVariable(value="commentID") Long commentID) {
        commentService.deleteCommentFromUnderPost(postID, commentID);
        return "redirect:/reddit/{postID}/post";
    }

}
