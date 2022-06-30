package com.jeep.bai_tap_1_blog_management.service;

import com.jeep.bai_tap_1_blog_management.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Blog findById(int id);

    Page<Blog> findAllBlog(Pageable pageable);

    Page<Blog> findAllBlogByKeyword(String keyword, Pageable pageable);
}
