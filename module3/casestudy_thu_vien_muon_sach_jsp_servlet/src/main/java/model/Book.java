package model;

public class Book {
    private String bookId;
    private String bookName;
    private String author;
    private int quantity;
    private String description;

    public Book() {
    }

    public Book(String bookId, String bookName, String author,
                int quantity, String description) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.quantity = quantity;
        this.description = description;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
