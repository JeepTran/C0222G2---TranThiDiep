package service.borrow_card;

import model.BookStatus;
import model.BorrowCard;

import java.util.List;

public interface IBorrowCardService {
    int addBorrowCard(BorrowCard borrowCard);

    List<BorrowCard> getAllBorrow();

    List<BookStatus> getAllBookStatus();
}
