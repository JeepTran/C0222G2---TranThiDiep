package com.jeep.bai_tap_1_blog_management.model;

import javax.persistence.*;

@Entity
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    @Column(columnDefinition = "text")
    private String content;
    private String summary;
    private String creatingDate;

    @ManyToOne
    @JoinColumn(name="category_id", referencedColumnName = "categoryId")
    private Category category;

    public Blog() {
    }

    public Blog(String title, String content, String summary, String creatingDate, Category category) {
        this.title = title;
        this.content = content;
        this.summary = summary;
        this.creatingDate = creatingDate;
        this.category = category;
    }

    public Blog(int id, String title, String content, String summary, String creatingDate, Category category) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.summary = summary;
        this.creatingDate = creatingDate;
        this.category = category;
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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
