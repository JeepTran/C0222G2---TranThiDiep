package reponsitory.book;

import model.Book;

import java.util.List;

public interface IBookRepository{
    List<Book> getAllBook();

    Book getBookById(String bookId);

    void decreaseBookWhenBorrow(String bookId);
}
