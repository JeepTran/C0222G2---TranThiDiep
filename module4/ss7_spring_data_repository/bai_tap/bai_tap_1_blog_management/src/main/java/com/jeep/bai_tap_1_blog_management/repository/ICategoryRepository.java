package com.jeep.bai_tap_1_blog_management.repository;

import com.jeep.bai_tap_1_blog_management.model.Blog;
import com.jeep.bai_tap_1_blog_management.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface ICategoryRepository extends JpaRepository<Category, Integer> {
    @Query(value = "select * from category where category_id = :id", nativeQuery = true)
    Category findById(@Param("id") int id);

    @Query(value = "select * from category ", nativeQuery = true)
    Page<Category> findAllCategory(Pageable pageable);

    @Modifying
    @Query(value = " delete from category where category_id = :id ", nativeQuery = true)
    void delete(@Param("id") int categoryId);

    @Query(value = "select * from category where category_name like :keyword", nativeQuery = true,
            countQuery = "select * from category where category_name like :keyword")
    Page<Category> findAllCategoryByKeyword(@Param("keyword") String keyword, Pageable pageable);
}
