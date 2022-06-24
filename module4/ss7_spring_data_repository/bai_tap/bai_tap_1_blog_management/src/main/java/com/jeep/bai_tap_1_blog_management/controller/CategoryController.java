package com.jeep.bai_tap_1_blog_management.controller;

import com.jeep.bai_tap_1_blog_management.model.Category;
import com.jeep.bai_tap_1_blog_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String listCategory(Model model, @PageableDefault(value = 3) Pageable pageable, @RequestParam Optional<String> searchName) {
        String keyword = searchName.orElse("");
        model.addAttribute("keyword", keyword);
        Page<Category> categoryList = this.categoryService.findAllCategoryByKeyword("%" + keyword + "%", pageable);
        model.addAttribute("categoryList", categoryList);
        return "list-category";
    }

    @GetMapping("/create")
    public String displayCreateCategoryForm(Model model) {
        model.addAttribute("category", new Category());
        return "create-category";
    }

    @PostMapping("/create")
    public String createCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        categoryService.save(category);
        redirectAttributes.addFlashAttribute("success", "Add new category successfully!");
        return "redirect:/category";
    }

    @GetMapping("/{id}/edit")
    public String displayEditCategoryForm(@PathVariable int id, Model model) {
        Category category = this.categoryService.findById(id);
        model.addAttribute("category", category);
        return "edit-category";
    }

    @PostMapping("/edit")
    public String editCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        this.categoryService.save(category);
        redirectAttributes.addFlashAttribute("success", "Update category successfully!");
        return "redirect:/category";
    }

    @GetMapping("/{id}/delete")
    public String displayDeleteCategoryForm(@PathVariable int id, Model model) {
        Category category = this.categoryService.findById(id);
        model.addAttribute("category", category);
        return "delete-category";
    }

    @PostMapping("/delete")
    public String deleteCategory(@ModelAttribute Category category, RedirectAttributes redirectAttributes) {
        this.categoryService.delete(category.getCategoryId());
        redirectAttributes.addFlashAttribute("success", "Delete category successfully!");
        return "redirect:/category";
    }
}
