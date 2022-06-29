package com.jeep.bai_tap_muon_sach.controller;

import com.jeep.bai_tap_muon_sach.model.Book;
import com.jeep.bai_tap_muon_sach.model.BookDetails;
import com.jeep.bai_tap_muon_sach.service.IBookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book-details")
public class BookDetailController {
    @Autowired
    private IBookDetailService bookDetailService;

    @GetMapping("")
    public String displayBookDetailList(Model model) {
        List<BookDetails> bookDetailList = bookDetailService.findAllBookDetail();
        model.addAttribute("bookDetailList",bookDetailList);
        return "book-detail-list";
    }


}
