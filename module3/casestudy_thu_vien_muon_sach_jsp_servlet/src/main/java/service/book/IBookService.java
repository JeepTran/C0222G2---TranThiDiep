package service.book;

import model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBook();

    Book getBookById(String bookId);

    void decreaseBookWhenBorrow(String bookId);
}
