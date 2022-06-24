package com.jeep.bai_tap_1_blog_management.service.impl;

import com.jeep.bai_tap_1_blog_management.model.Blog;
import com.jeep.bai_tap_1_blog_management.repository.IBlogRepository;
import com.jeep.bai_tap_1_blog_management.service.IBlogService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    public void delete(int id) {
        this.blogRepository.delete(id);
    }

    @Override
    public Blog findById(int id) {
        return this.blogRepository.findById(id);
    }

    @Override
    public Page<Blog> findAllBlog(Pageable pageable) {
        return this.blogRepository.findAllBlog(pageable);
    }

    @Override
    public Page<Blog> findAllBlogByKeyword(String keyword, Pageable pageable) {
        return this.blogRepository.findAllBlogByKeyword(keyword,pageable);
    }

}
