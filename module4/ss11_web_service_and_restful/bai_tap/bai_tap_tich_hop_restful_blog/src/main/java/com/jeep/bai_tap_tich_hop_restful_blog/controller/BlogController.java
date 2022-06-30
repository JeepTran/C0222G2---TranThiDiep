package com.jeep.bai_tap_1_blog_management.controller;

import com.jeep.bai_tap_1_blog_management.model.Blog;
import com.jeep.bai_tap_1_blog_management.service.IBlogService;
import com.jeep.bai_tap_1_blog_management.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String list(Model model, @PageableDefault(size = 3, page = 0) Pageable pageable,  //blog?page=0&size=5  //blog?page=1&size=5
                       @RequestParam Optional<String> searchName, @RequestParam("sort") Optional<String> sort) {

        String sortValue = sort.orElse("");
        String keyword = searchName.orElse("");
        model.addAttribute("keyword", keyword);
        Page<Blog> blogList = this.blogService.findAllBlogByKeyword("%" + keyword + "%", pageable);
        model.addAttribute("blogList", blogList);
        System.out.println(pageable.getSort());
        model.addAttribute("sortItem", sortValue);
        return "list-blog";
    }

    @GetMapping("/create")
    public String displayCreateForm(Model model, Pageable pageable) {
        model.addAttribute("categoryList", categoryService.findAllCategory(pageable));
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Add new blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String displayEditForm(@PathVariable int id, Model model, Pageable pageable) {
        model.addAttribute("categoryList", categoryService.findAllCategory(pageable));
        Blog blog = this.blogService.findById(id);
        model.addAttribute("blog", blog);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Update blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/delete")
    public String displayDeleteForm(@PathVariable int id, Model model) {
        Blog blog = this.blogService.findById(id);
        model.addAttribute("blog", blog);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        this.blogService.delete(blog.getId());
        redirectAttributes.addFlashAttribute("success", "Delete blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        Blog blog = this.blogService.findById(id);
        model.addAttribute("blog", blog);
        return "view";
    }
}

