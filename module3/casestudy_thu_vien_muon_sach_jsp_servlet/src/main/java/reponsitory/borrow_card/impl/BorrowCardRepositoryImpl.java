package reponsitory.borrow_card.impl;

import model.Book;
import model.BookStatus;
import model.BorrowCard;
import reponsitory.BaseRepository;
import reponsitory.borrow_card.IBorrowCardRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorrowCardRepositoryImpl implements IBorrowCardRepository {
    BaseRepository baseRepository = new BaseRepository();
    private final String ADD_BORROW_CARD = " insert into borrow_card values (?,?,?,?,?,?) ";
    private final String ROW_COUNT = " select count(*) from borrow_card ";
    private String SELECT_ALL_BORROW = " select * from borrow_card ";
    private String SELECT_ALL_BOOK_STATUS = " select * from book_status ";

    @Override
    public List<BorrowCard> getAllBorrow() {
        List<BorrowCard> borrowCardList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BORROW);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String borrowId = resultSet.getString("borrow_id");
                String bookId = resultSet.getString("book_id");
                int studentId = resultSet.getInt("student_id");
                int statusId = resultSet.getInt("status_id");
                String borrowDate = resultSet.getString("borrow_date");
                String returnDate = resultSet.getString("return_date");
                borrowCardList.add(new BorrowCard(borrowId, bookId, studentId, statusId, borrowDate, returnDate));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return borrowCardList;
    }

    @Override
    public List<BookStatus> getAllBookStatus() {
        List<BookStatus> bookStatusList = new ArrayList<>();
        try (Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BOOK_STATUS);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int statusId = resultSet.getInt("status_id");
                String statusName = resultSet.getString("status");
                bookStatusList.add(new BookStatus(statusId,statusName));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookStatusList;
    }


    @Override
    public int addBorrowCard(BorrowCard borrowCard) {
        int countBeforeUpdate = 0;
        int countAfterUpdate = 0;
        int rowCount = 0;
        try (Connection connection = baseRepository.getConnection()) {
            PreparedStatement preparedStatement = connection.prepareStatement(ROW_COUNT);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                countBeforeUpdate = resultSet.getInt("count(*)");
            }
            preparedStatement = connection.prepareStatement(ADD_BORROW_CARD);
            preparedStatement.setString(1, borrowCard.getBorrowId());
            preparedStatement.setString(2, borrowCard.getBookId());
            preparedStatement.setInt(3, borrowCard.getStudentId());
            preparedStatement.setInt(4, borrowCard.getStatusId());
            preparedStatement.setString(5, borrowCard.getBorrowDate());
            preparedStatement.setString(6, borrowCard.getReturnDate());
            preparedStatement.executeUpdate();

            preparedStatement = connection.prepareStatement(ROW_COUNT);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                countAfterUpdate = resultSet.getInt("count(*)");
            }
            rowCount = countAfterUpdate - countBeforeUpdate;

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rowCount;
    }
}
