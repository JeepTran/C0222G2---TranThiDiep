package com.jeep.bai_tap_1_blog_management.repository;

import com.jeep.bai_tap_1_blog_management.model.Blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog", nativeQuery = true)
    List<Blog> findAll();

    @Query(value = "select * from blog ", nativeQuery = true)
    Page<Blog> findAllBlog(Pageable pageable);

    @Modifying
    @Query(value = " delete from blog where id = :id ", nativeQuery = true)
    void delete(@Param("id") int id);

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    Blog findById(@Param("id") int id);

    @Query(value = "select * from blog where title like :keyword", nativeQuery = true,
            countQuery = "select * from blog where title like :keyword")
    Page<Blog> findAllBlogByKeyword(@Param("keyword") String keyword, Pageable pageable);
}
