package controller;

import model.Employee;
import model.User;
import service.IEmployeeService;
import service.impl.EmployeeServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "FuramaController", value = "/furama")
public class FuramaController extends HttpServlet {
    private IEmployeeService employeeService = new EmployeeServiceImpl();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action){
            case "create":
                displayCreateForm(request, response);
                break;
            case "update":
                displayEditForm(request, response);
                break;
            case "delete":
                displayDeleteForm(request, response);
                break;
            default:
                displayHome(request, response);
                break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    private void displayCreateForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("furama/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayEditForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int editId = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.searchById(editId);
        if (employee == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("furama/edit.jsp").forward(request, response);
        }
    }

    private void displayDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int deleteId = Integer.parseInt(request.getParameter("id"));
        Employee employee= employeeService.searchById(deleteId);
        if (employee == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("employee", employee);
            request.getRequestDispatcher("furama/delete.jsp").forward(request, response);
        }
    }



    private void displayHome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("furama/home.jsp");
    }
}
