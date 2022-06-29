package com.jeep.bai_tap_muon_sach.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "book")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private int bookId;
    private String bookName;
    private String author;
    private int quantity;

    @OneToMany(mappedBy = "book")
    private List<BookDetails> bookDetailsList;

    public Book() {
    }

    public Book(int bookId, String bookName, String author, int quantity, List<BookDetails> bookDetailsList) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.bookDetailsList = bookDetailsList;
    }

    public Book(String bookName, String author, int quantity, List<BookDetails> bookDetailsList) {
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.bookDetailsList = bookDetailsList;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<BookDetails> getBookDetailsList() {
        return bookDetailsList;
    }

    public void setBookDetailsList(List<BookDetails> bookDetailsList) {
        this.bookDetailsList = bookDetailsList;
    }
}
