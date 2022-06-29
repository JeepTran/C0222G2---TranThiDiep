package com.jeep.bai_tap_muon_sach.service.impl;

import com.jeep.bai_tap_muon_sach.model.Book;
import com.jeep.bai_tap_muon_sach.repository.IBookRepository;
import com.jeep.bai_tap_muon_sach.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements IBookService {
    @Autowired
    private IBookRepository bookRepository;


    @Override
    public List<Book> findAllBook() {
        return bookRepository.findAllBook();
    }

    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }
}
