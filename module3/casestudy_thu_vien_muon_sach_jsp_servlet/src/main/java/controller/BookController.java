package controller;

import model.Book;
import model.BorrowCard;
import model.Student;
import service.book.IBookService;
import service.book.impl.BookServiceImpl;
import service.borrow_card.IBorrowCardService;
import service.borrow_card.impl.BorrowCardServiceImpl;
import service.student.IStudentService;
import service.student.impl.StudentServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.List;

@WebServlet(name = "BookController", value = "/book")
public class BookController extends HttpServlet {
    IBookService bookService = new BookServiceImpl();
    IStudentService studentService = new StudentServiceImpl();
    IBorrowCardService borrowCardService = new BorrowCardServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "borrow":
                displayBorrowForm(request, response);
                break;
            default:
                listAllBooks(request, response);
                break;
        }

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "borrow":
                borrowBook(request, response);
                break;
            default:
                listAllBooks(request, response);
                break;
        }
    }

    private void borrowBook(HttpServletRequest request, HttpServletResponse response) {

        String bookId = request.getParameter("bookId");
        String borrowId = request.getParameter("borrowId");
        int studentId = Integer.parseInt(request.getParameter("studentId"));
        int statusId = 1;
        String borrowDate = request.getParameter("borrowDate");
        String returnDate = request.getParameter("returnDate");
        BorrowCard borrowCard = new BorrowCard(borrowId, bookId, studentId, statusId, borrowDate, returnDate);
        if (borrowCardService.addBorrowCard(borrowCard) > 0) {
            bookService.decreaseBookWhenBorrow(bookId);
        }
        try {
            response.sendRedirect("/book");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void listAllBooks(HttpServletRequest request, HttpServletResponse response) {
        List<Book> bookList = bookService.getAllBook();
        request.setAttribute("bookList", bookList);
        try {
            request.getRequestDispatcher("library/listBook.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayBorrowForm(HttpServletRequest request, HttpServletResponse response) {
        String bookId = request.getParameter("bookId");
        Book book = bookService.getBookById(bookId);
        List<Student> studentList = studentService.getAllStudent();
        LocalDate borrowDate = LocalDate.now();

        request.setAttribute("book", book);
        request.setAttribute("studentList", studentList);
        request.setAttribute("borrowDate", borrowDate);

        try {
            request.getRequestDispatcher("library/borrow.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
