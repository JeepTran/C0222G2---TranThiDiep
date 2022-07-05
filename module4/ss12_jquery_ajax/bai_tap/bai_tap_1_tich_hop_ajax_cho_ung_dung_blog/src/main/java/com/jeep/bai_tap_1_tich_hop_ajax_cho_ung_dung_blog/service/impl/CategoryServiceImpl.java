package com.jeep.bai_tap_tich_hop_restful_blog.service.impl;

import com.jeep.bai_tap_tich_hop_restful_blog.model.Category;
import com.jeep.bai_tap_tich_hop_restful_blog.repository.ICategoryRepository;
import com.jeep.bai_tap_tich_hop_restful_blog.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements ICategoryService {
    @Autowired
    private ICategoryRepository categoryRepository;

    @Override
    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    @Override
    public Category save(Category category) {
        return categoryRepository.save(category);
    }

    @Override
    public Category findById(int id) {
        return categoryRepository.findById(id);
    }

    @Override
    public void delete(int categoryId) {
        categoryRepository.delete(categoryId);
    }

    @Override
    public Page<Category> findAllCategory(Pageable pageable) {
        return categoryRepository.findAllCategory(pageable);
    }

    @Override
    public Page<Category> findAllCategoryByKeyword(String keyword, Pageable pageable) {
        return categoryRepository.findAllCategoryByKeyword(keyword, pageable);
    }
}
