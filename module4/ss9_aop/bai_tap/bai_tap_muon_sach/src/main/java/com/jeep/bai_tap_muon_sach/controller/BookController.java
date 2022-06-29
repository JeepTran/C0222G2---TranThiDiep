package com.jeep.bai_tap_muon_sach.controller;

import com.jeep.bai_tap_muon_sach.model.Book;
import com.jeep.bai_tap_muon_sach.model.BookDetails;
import com.jeep.bai_tap_muon_sach.service.IBookDetailService;
import com.jeep.bai_tap_muon_sach.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
@RequestMapping("/books")
public class BookController {
    @Autowired
    private IBookService bookService;

    @Autowired
    private IBookDetailService bookDetailService;

    @GetMapping("")
    public String displayBookList(Model model) {
        List<Book> bookList = bookService.findAllBook();
        model.addAttribute("bookList", bookList);
        return "book-list";
    }

    @GetMapping("/details")
    public String displayDetail() {
        return "redirect:/book-details";
    }

    @GetMapping("/create")
    public String displayCreateForm(Model model) {
        model.addAttribute("book", new Book());
        return "create-book";
    }

    @PostMapping("/create")
    public String createNewBook(@ModelAttribute Book book, RedirectAttributes redirectAttributes) {
        this.bookService.save(book);
        int quantity = book.getQuantity();
        if (quantity >= 1) {
            for (int i = 0; i < quantity; i++) {
                int detailId = (int) (10000 * Math.random());
                int status = 0;
                int bookId = book.getBookId();
                this.bookDetailService.save(new BookDetails(detailId, status, bookId, book));
            }

        }
        return "redirect:/books";
    }
}
