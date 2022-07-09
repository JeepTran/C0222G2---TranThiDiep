package com.jeep.furama.controller;

import com.jeep.furama.model.customer.Customer;
import com.jeep.furama.service.customer.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Optional;

@Controller
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping
    public ModelAndView displayCustomerList(@PageableDefault(value = 5) Pageable pageable,
                                            @RequestParam Optional<String> search) {
        String keyword = search.orElse("");
        Page<Customer> customerPage = this.customerService.findAllCustomerByKeyword("%" + keyword + "%", pageable);
        ModelAndView modelAndView = new ModelAndView("customer/customer-list");

        if (customerPage.hasContent()) {
            modelAndView.addObject("customerList", customerPage);
        } else {
            modelAndView.addObject("msgNotFound", "Not found customer name containing <strong>" + keyword + "</strong>!");
        }
        modelAndView.addObject("keyword", keyword);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView displayCreateCustomerForm(Customer customer) {
        ModelAndView modelAndView = new ModelAndView("customer/customer-create");
        modelAndView.addObject("customer", customer);
        modelAndView.addObject("customerTypeList", this.customerService.findAllCustomerType());
        return modelAndView;
    }

    @PostMapping("/create")
    public String createCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        this.customerService.save(customer);
        redirectAttributes.addFlashAttribute("msg", "Add new customer <strong>" + customer.getCustomerName() + "</strong> successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/edit/{id}")
    public ModelAndView displayEditCustomerForm(@PathVariable int id) {
        Optional<Customer> customerOptional = this.customerService.findCustomerById(id);
        ModelAndView modelAndView = new ModelAndView("customer/customer-edit");
        modelAndView.addObject("customer", customerOptional.get());
        modelAndView.addObject("customerTypeList", this.customerService.findAllCustomerType());
        return modelAndView;
    }

    @PostMapping("/edit")
    public String editCustomer(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        this.customerService.save(customer);
        redirectAttributes.addFlashAttribute("msg",
                "Update customer <strong>" + customer.getCustomerName() + "</strong> successfully!");
        return "redirect:/customer";
    }

    @GetMapping("/delete/{id}")
    public String deleteCustomer(@PathVariable int id, RedirectAttributes redirectAttributes) {
        Optional<Customer> customerOptional = this.customerService.findCustomerById(id);
        String customerName = customerOptional.get().getCustomerName();
        this.customerService.deleteCustomerById(id);
        redirectAttributes.addFlashAttribute("msgDelete",
                "Remove customer <strong>" + customerName + "</strong> successfully!");
        return "redirect:/customer";
    }
}