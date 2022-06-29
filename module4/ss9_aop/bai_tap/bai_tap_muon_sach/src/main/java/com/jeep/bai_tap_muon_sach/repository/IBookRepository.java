package com.jeep.bai_tap_muon_sach.repository;

import com.jeep.bai_tap_muon_sach.model.Book;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query(value = "select * from book", nativeQuery = true,
            countQuery = "select * from book")
    List<Book> findAllBook();
}
