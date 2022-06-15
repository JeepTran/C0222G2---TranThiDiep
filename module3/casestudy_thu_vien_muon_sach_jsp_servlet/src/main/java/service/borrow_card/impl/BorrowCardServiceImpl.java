package service.borrow_card.impl;

import model.BookStatus;
import model.BorrowCard;
import reponsitory.borrow_card.IBorrowCardRepository;
import reponsitory.borrow_card.impl.BorrowCardRepositoryImpl;
import service.borrow_card.IBorrowCardService;

import java.util.List;

public class BorrowCardServiceImpl implements IBorrowCardService {
    IBorrowCardRepository borrowCardRepository = new BorrowCardRepositoryImpl();


    @Override
    public int addBorrowCard(BorrowCard borrowCard) {
        return borrowCardRepository.addBorrowCard(borrowCard);
    }

    @Override
    public List<BorrowCard> getAllBorrow() {
        return borrowCardRepository.getAllBorrow();
    }

    @Override
    public List<BookStatus> getAllBookStatus() {
        return borrowCardRepository.getAllBookStatus();
    }
}
