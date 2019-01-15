package com.greenfox.rueppellii.seadog.week08day4.reddit.models;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String password;

    @OneToMany(mappedBy = "user", targetEntity = Comment.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Post> posts;

    @OneToMany(mappedBy = "user", targetEntity = Comment.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Comment> comments;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
