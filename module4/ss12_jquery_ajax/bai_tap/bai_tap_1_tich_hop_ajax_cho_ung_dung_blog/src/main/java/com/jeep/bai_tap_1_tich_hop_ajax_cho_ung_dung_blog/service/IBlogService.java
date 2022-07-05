package com.jeep.bai_tap_tich_hop_restful_blog.service;

import com.jeep.bai_tap_tich_hop_restful_blog.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    void delete(int id);

    Page<Blog> findAllBlog(Pageable pageable);

    Page<Blog> findAllBlogByCategory(int categoryId, Pageable pageable);

    Blog findBlogById(int id);
}
