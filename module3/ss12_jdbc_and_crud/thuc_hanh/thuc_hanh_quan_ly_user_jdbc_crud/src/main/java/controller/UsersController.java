package controller;

import model.User;
import service.IUserService;
import service.UserServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

@WebServlet(name = "UsersController", value = "/users")
public class UsersController extends HttpServlet {
    private IUserService iUserService = new UserServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }

        switch (action) {
            case "create":
                displayCreateForm(request, response);
                break;
            case "update":
                displayUpdateForm(request, response);
                break;
            case "delete":
                displayDeleteForm(request, response);
                break;
            case "search":
                displaySearchForm(request, response);
                break;
            default:
                listAllUser(request, response);
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
            case "create":
                createUser(request);
                response.sendRedirect("/users");
                break;
            case "update":
                updateUserInfo(request);
                response.sendRedirect("/users");
                break;
            case "delete":
                deleteUserInfo(request);
                response.sendRedirect("/users");
                break;
            default:
                listAllUser(request, response);
                break;
        }
    }


    private void displayCreateForm(HttpServletRequest request, HttpServletResponse response) {
        try {
            request.getRequestDispatcher("users/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayUpdateForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int updateId = Integer.parseInt(request.getParameter("id"));
        User user = iUserService.selectUserByIdProcedure(updateId);
        if (user == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("user", user);
            request.getRequestDispatcher("users/update.jsp").forward(request, response);
        }
    }

    private void displayDeleteForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int deleteId = Integer.parseInt(request.getParameter("id"));
        User user = iUserService.selectUser(deleteId);
        if (user == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("user", user);
            request.getRequestDispatcher("users/delete.jsp").forward(request, response);
        }
    }

    private void displaySearchForm(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String searchCountry = request.getParameter("search");
        List<User> searchList = iUserService.searchByCountry(searchCountry);
        request.setAttribute("users", searchList);
        request.getRequestDispatcher("users/list.jsp").forward(request, response);
    }

    private void deleteUserInfo(HttpServletRequest request) {
        int deleteId = Integer.parseInt(request.getParameter("id"));
        try {
            iUserService.deleteUser(deleteId);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    private void updateUserInfo(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        try {
            iUserService.updateUser(user);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void createUser(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String country = request.getParameter("country");
        User user = new User(id, name, email, country);
        iUserService.insertUserProcedure(user);
    }

    private void listAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<User> users = iUserService.selectAllUser();
        request.setAttribute("users", users);
        request.getRequestDispatcher("users/list.jsp").forward(request, response);
    }
}
