package com.jeep.blog_management.repository;

import com.jeep.blog_management.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
}
