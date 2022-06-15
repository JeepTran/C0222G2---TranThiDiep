package service.book.impl;

import model.Book;
import reponsitory.book.IBookRepository;
import reponsitory.book.impl.BookRepositoryImpl;
import service.book.IBookService;

import java.util.List;

public class BookServiceImpl implements IBookService {
    IBookRepository bookRepository = new BookRepositoryImpl();


    @Override
    public List<Book> getAllBook() {
        return bookRepository.getAllBook();
    }

    @Override
    public Book getBookById(String bookId) {
        return bookRepository.getBookById(bookId);
    }

    @Override
    public void decreaseBookWhenBorrow(String bookId) {
        bookRepository.decreaseBookWhenBorrow(bookId);
    }
}
