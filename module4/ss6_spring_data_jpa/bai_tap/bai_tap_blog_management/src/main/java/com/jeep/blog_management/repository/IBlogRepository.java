package com.jeep.blog_management.repository;

import com.jeep.blog_management.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface IBlogRepository extends JpaRepository<Blog, Integer> {
    @Query(value = "select * from blog", nativeQuery = true)
    public List<Blog> findAll();

    @Modifying
    @Transactional
    @Query(value = " delete from blog where id = :id ", nativeQuery = true)
    public void delete(@Param("id") int id);

    @Query(value = "select * from blog where id = :id", nativeQuery = true)
    public Blog findById(@Param("id") int id);
}
