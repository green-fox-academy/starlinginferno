package com.greenfox.rueppellii.tribes2.authentication.models;

public class ToDoDTO {

    private String title;
    private String detail;

    public ToDoDTO(String title, String detail) {
        this.title = title;
        this.detail = detail;
    }

    public ToDoDTO() {
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
}
