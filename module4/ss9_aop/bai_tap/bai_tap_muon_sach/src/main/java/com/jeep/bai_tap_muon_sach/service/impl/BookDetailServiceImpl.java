package com.jeep.bai_tap_muon_sach.service.impl;

import com.jeep.bai_tap_muon_sach.model.BookDetails;
import com.jeep.bai_tap_muon_sach.repository.IBookDetailRepository;
import com.jeep.bai_tap_muon_sach.service.IBookDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookDetailServiceImpl implements IBookDetailService {
    @Autowired
    private IBookDetailRepository bookDetailRepository;


    @Override
    public List<BookDetails> findAllBookDetail() {
        return bookDetailRepository.findAllBookDetail();
    }

    @Override
    public BookDetails save(BookDetails bookDetails) {
        return bookDetailRepository.save(bookDetails);
    }


}
