package com.jeep.controller;

import com.jeep.model.Product;
import com.jeep.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping("")
    public String list(Model model) {
        List<Product> productList = this.productService.findAll();
        model.addAttribute("productList", productList);
        return "list-product";
    }

    @GetMapping("/create")
    public String displayCreateForm(Model model) {
        model.addAttribute("product", new Product());
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        productService.save(product);
        redirectAttributes.addFlashAttribute("success", "Add new product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/edit")
    public String displayEditForm(@PathVariable int id, Model model) {
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        return "edit";
    }

    @PostMapping("/edit")
    public String edit(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        this.productService.update(product.getId(), product);

        redirectAttributes.addFlashAttribute("success", "Update product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/delete")
    public String displayDeleteForm(@PathVariable int id, Model model) {
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        this.productService.remove(product);
        redirectAttributes.addFlashAttribute("success", "Delete product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/{id}/view")
    public String view(@PathVariable int id, Model model) {
        Product product = this.productService.findById(id);
        model.addAttribute("product", product);
        return "view";
    }

    @PostMapping("/search")
    public String searchByName(@RequestParam String searchName, Model model) {
        List<Product> searchList = this.productService.findByName(searchName);
        model.addAttribute("productList", searchList);
        return "list-product";
    }
}
