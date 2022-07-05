package com.jeep.bai_tap_tich_hop_restful_blog.service.impl;

import com.jeep.bai_tap_tich_hop_restful_blog.model.Blog;
import com.jeep.bai_tap_tich_hop_restful_blog.repository.IBlogRepository;
import com.jeep.bai_tap_tich_hop_restful_blog.service.IBlogService;
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
    public Page<Blog> findAllBlog(Pageable pageable) {
        return this.blogRepository.findAllBlog(pageable);
    }

    @Override
    public Page<Blog> findAllBlogByCategory(int categoryId, Pageable pageable) {
        return this.blogRepository.findAllBlogByCategory(categoryId,pageable);
    }

    @Override
    public Blog findBlogById(int id) {
        return this.blogRepository.findById(id);
    }

}
