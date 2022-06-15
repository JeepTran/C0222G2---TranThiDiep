package model;

public class BorrowCard {
    private String borrowId;
    private String  bookId;
    private int studentId;
    private int statusId;
    private String borrowDate;
    private String returnDate;

    public BorrowCard() {
    }

    public BorrowCard(String borrowId, String bookId, int studentId,
                      int statusId, String borrowDate, String returnDate) {
        this.borrowId = borrowId;
        this.bookId = bookId;
        this.studentId = studentId;
        this.statusId = statusId;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }

    public String getBorrowId() {
        return borrowId;
    }

    public void setBorrowId(String borrowId) {
        this.borrowId = borrowId;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getStatusId() {
        return statusId;
    }

    public void setStatusId(int statusId) {
        this.statusId = statusId;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }
}
