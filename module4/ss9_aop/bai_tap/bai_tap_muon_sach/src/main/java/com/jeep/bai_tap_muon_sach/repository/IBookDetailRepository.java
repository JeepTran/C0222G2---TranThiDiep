package com.jeep.bai_tap_muon_sach.repository;

import com.jeep.bai_tap_muon_sach.model.Book;
import com.jeep.bai_tap_muon_sach.model.BookDetails;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBookDetailRepository extends JpaRepository<BookDetails,Integer> {
    @Query(value = "select * from book_details ", nativeQuery = true,
            countQuery = "select * from book_details")
    List<BookDetails> findAllBookDetail();
}
