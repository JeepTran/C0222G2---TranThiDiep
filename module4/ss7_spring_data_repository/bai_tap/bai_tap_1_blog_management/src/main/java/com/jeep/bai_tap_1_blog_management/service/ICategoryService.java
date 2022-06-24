package com.jeep.bai_tap_1_blog_management.service;

import com.jeep.bai_tap_1_blog_management.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICategoryService {

    List<Category> findAll();

    Category save(Category category);

    Category findById(int id);

    void delete(int categoryId);

    Page<Category> findAllCategory(Pageable pageable);

    Page<Category> findAllCategoryByKeyword(String keyword, Pageable pageable);
}
