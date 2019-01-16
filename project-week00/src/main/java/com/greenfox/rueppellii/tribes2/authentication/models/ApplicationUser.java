package com.greenfox.rueppellii.tribes2.authentication.models;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
//@Table(name="user")
public class ApplicationUser {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String username;
    private String password;

    @JsonManagedReference
    @OneToMany(mappedBy = "applicationUser", targetEntity = ToDo.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<ToDo> toDos;

    public ApplicationUser() {
        this.toDos = new ArrayList<>();
    }

    public ApplicationUser(String userName, String password) {
        this();
        this.username = userName;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<ToDo> getToDos() {
        return toDos;
    }

    public void setToDos(List<ToDo> toDos) {
        this.toDos = toDos;
    }
}
