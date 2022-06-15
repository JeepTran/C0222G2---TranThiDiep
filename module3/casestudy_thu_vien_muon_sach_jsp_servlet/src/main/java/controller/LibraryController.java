package controller;

import service.book.IBookService;
import service.book.impl.BookServiceImpl;
import service.borrow_card.IBorrowCardService;
import service.borrow_card.impl.BorrowCardServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "LibraryController", value = "/library")
public class LibraryController extends HttpServlet {
    IBookService bookService = new BookServiceImpl();
    IBorrowCardService bookCardService = new BorrowCardServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("index.jsp");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
        }
    }
}
