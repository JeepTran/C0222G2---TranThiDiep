package com.jeep.blog_management.controller;

import com.jeep.blog_management.model.Blog;
import com.jeep.blog_management.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/blog")
public class BlogController {

    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String list(Model model) {
        List<Blog> blogList = this.blogService.findAll();
        model.addAttribute("blogList", blogList);
        return "list";
    }

    @GetMapping("/create")
    public String displayCreateForm(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Blog blog, RedirectAttributes redirectAttributes) {
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Add new blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/{id}/edit")
    public String displayEditForm(@PathVariable int id, Model model) {
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
        this.blogService.delete(blog);
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

