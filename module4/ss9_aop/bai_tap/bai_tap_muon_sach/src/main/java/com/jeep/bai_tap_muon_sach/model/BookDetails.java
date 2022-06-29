package com.jeep.bai_tap_muon_sach.model;

import org.springframework.beans.factory.annotation.Value;

import javax.persistence.*;

@Entity
public class BookDetails {
    @Id
    private int detailId;

    @Value("0")
    private int status;
    @Column(name = "book_id")
    private int bookId;

    @ManyToOne
    @JoinColumn(name = "book", referencedColumnName = "book_id")
    private Book book;

    public BookDetails() {
    }

    public BookDetails(int detailId, int status, int bookId, Book book) {
        this.detailId = detailId;
        this.status = status;
        this.bookId = bookId;
        this.book = book;
    }

    public BookDetails(int status, int bookId, Book book) {
        this.status = status;
        this.bookId = bookId;
        this.book = book;
    }

    public int getDetailId() {
        return detailId;
    }

    public void setDetailId(int detailId) {
        this.detailId = detailId;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
