package com.jeep.blog_management.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private String content;
    private String summary;
    private String creatingDate;

    public Blog() {
    }

    public Blog(String title, String content, String summary, String creatingDate) {
        this.title = title;
        this.content = content;
        this.summary = summary;
        this.creatingDate = creatingDate;
    }

    public Blog(int id, String title, String content, String summary, String creatingDate) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.summary = summary;
        this.creatingDate = creatingDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getCreatingDate() {
        return creatingDate;
    }

    public void setCreatingDate(String creatingDate) {
        this.creatingDate = creatingDate;
    }

}
