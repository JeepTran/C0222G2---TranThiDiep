package com.jeep.blog_management.service.impl;

import com.jeep.blog_management.model.Blog;
import com.jeep.blog_management.repository.IBlogRepository;
import com.jeep.blog_management.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return this.blogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        this.blogRepository.save(blog);
    }

    @Override
    public void delete(Blog blog) {
        this.blogRepository.delete(blog);
    }

    @Override
    public Blog findById(int id) {
        return this.blogRepository.findById(id).orElse(null);
    }

}
