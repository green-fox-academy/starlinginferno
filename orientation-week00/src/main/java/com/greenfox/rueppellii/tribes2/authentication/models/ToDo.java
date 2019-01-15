package com.greenfox.rueppellii.tribes2.authentication.models;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;

@Entity
public class ToDo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String title;
    private String detail;

//    @JsonBackReference
    @ManyToOne
//    @JoinTable(name="user_todo_list", joinColumns = @JoinColumn(name="to_do_id", referencedColumnName = "id"),
//        inverseJoinColumns = @JoinColumn(name="application_user_id", referencedColumnName = "id"))
    private ApplicationUser applicationUser;

    public ToDo() {
    }

    public ToDo(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public ApplicationUser getApplicationUser() {
        return applicationUser;
    }

    public void setApplicationUser(ApplicationUser applicationUser) {
        this.applicationUser = applicationUser;
    }
}
