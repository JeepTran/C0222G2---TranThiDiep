package controller;

import model.Book;
import model.BookStatus;
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
import java.util.List;

@WebServlet(name = "BorrowController", value = "/borrow")
public class BorrowController extends HttpServlet {
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

            default:
                listAllBorrow(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    private void listAllBorrow(HttpServletRequest request, HttpServletResponse response) {
        List<Book> bookList = bookService.getAllBook();
        List<Student> studentList = studentService.getAllStudent();
        List<BorrowCard> borrowCardList = borrowCardService.getAllBorrow();
        List<BookStatus> bookStatusList = borrowCardService.getAllBookStatus();
        request.setAttribute("bookList", bookList);
        request.setAttribute("studentList", studentList);
        request.setAttribute("borrowCardList", borrowCardList);
        request.setAttribute("bookStatusList", bookStatusList);
        try {
            request.getRequestDispatcher("library/listBorrow.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
