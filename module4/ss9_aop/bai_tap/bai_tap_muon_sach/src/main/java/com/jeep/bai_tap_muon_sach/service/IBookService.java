package com.jeep.bai_tap_muon_sach.service;

import com.jeep.bai_tap_muon_sach.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAllBook();

    Book save(Book book);
}
