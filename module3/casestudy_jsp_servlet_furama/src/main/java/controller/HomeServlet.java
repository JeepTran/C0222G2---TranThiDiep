package controller;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "HomeServlet", value = "/furama")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
//                displayCreateForm(request, response);
                break;
            case "update":
//                displayEditForm(request, response);
                break;
            case "delete":
//                displayDeleteForm(request, response);
                break;
            default:
                displayHome(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void displayHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("furama/home.jsp");
    }
}
