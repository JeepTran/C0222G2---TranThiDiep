package com.jeep.bai_tap_muon_sach.service;

import com.jeep.bai_tap_muon_sach.model.BookDetails;

import java.util.List;

public interface IBookDetailService {
    List<BookDetails> findAllBookDetail();

    BookDetails save(BookDetails bookDetails);
}
