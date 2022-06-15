package reponsitory.book.impl;

import model.Book;
import reponsitory.BaseRepository;
import reponsitory.book.IBookRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryImpl implements IBookRepository {
    BaseRepository baseRepository = new BaseRepository();
    private String SELECT_ALL_BOOK = " select * from book ";
    private String SELECT_BOOK_BY_ID = " select * from book where book_id = ? ";
    private String UPDATE_BOOK_QUANTITY_DECREASE = " update book set quantity = quantity - 1 " +
            " where book_id like ? ";

    //book_id varchar (45) primary key,
//book_name varchar(255) not null,
//author varchar(255),
//quantity int not null,
//`description` text
    @Override
    public List<Book> getAllBook() {
        List<Book> bookList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOK);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("book_id");
                String name = resultSet.getString("book_name");
                String author = resultSet.getString("author");
                int quantity = resultSet.getInt("quantity");
                String description = resultSet.getString("description");
                bookList.add(new Book(id, name, author, quantity, description));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @Override
    public Book getBookById(String bookId) {
        Book book = null;
        try (Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BOOK_BY_ID);
            preparedStatement.setString(1, bookId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String id = resultSet.getString("book_id");
                String name = resultSet.getString("book_name");
                String author = resultSet.getString("author");
                int quantity = Integer.parseInt(resultSet.getString("quantity"));
                String description = resultSet.getString("description");
                book = new Book(id, name, author, quantity, description);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return book;
    }

    @Override
    public void decreaseBookWhenBorrow(String bookId) {
        try (Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_BOOK_QUANTITY_DECREASE);
            preparedStatement.setString(1,bookId);
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
