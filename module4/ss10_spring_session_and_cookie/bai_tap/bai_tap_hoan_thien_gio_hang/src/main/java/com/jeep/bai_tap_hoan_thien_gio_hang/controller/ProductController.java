package com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.controller;

import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.model.Cart;
import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.model.Product;
import com.jeep.thuc_hanh_3_them_san_pham_vao_gio_hang.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    private IProductService productService;

    @ModelAttribute("cart")
    public Cart setUpCart() {
        return new Cart();
    }

    @GetMapping("/shop")
    public ModelAndView showShop() {
        ModelAndView modelAndView = new ModelAndView("shop");
        modelAndView.addObject("products", this.productService.findAll());
        return modelAndView;
    }

    @GetMapping("/add/{id}")
    public String addToCart(@PathVariable Long id, @ModelAttribute Cart cart,
                            @RequestParam("action") String action) {
        Optional<Product> product = productService.findById(id);
        if (!product.isPresent()) {
            return "error404";
        }
        if (action.equals("show")) {
            cart.addProduct(product.get());
            return "redirect:/shopping-cart";
        }
        cart.addProduct(product.get());
        return "redirect:/shop";
    }

    @GetMapping("/create-item")
    public ModelAndView displayCreateItemForm(Product product, ModelAndView modelAndView) {
        modelAndView = new ModelAndView("create-item");
        modelAndView.addObject("product", product);
        return modelAndView;
    }

    @PostMapping("/create")
    public String createItem(@ModelAttribute Product product, RedirectAttributes redirectAttributes) {
        this.productService.save(product);
        redirectAttributes.addFlashAttribute("msg", "Add new product successfully!");
        return "redirect:/shop";
    }


}
