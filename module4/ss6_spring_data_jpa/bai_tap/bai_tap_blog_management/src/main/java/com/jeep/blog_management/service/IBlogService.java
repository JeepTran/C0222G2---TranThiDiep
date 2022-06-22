package com.jeep.blog_management.service;

import com.jeep.blog_management.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(Blog blog);

    Blog findById(int id);
}
