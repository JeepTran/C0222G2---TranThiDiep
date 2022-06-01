package controller;

import model.Customer;
import service.ICustomerService;
import service.impl.CustomerService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "CustomerController", value = "/customer")
public class CustomerController extends HttpServlet {
    private ICustomerService iCustomerService = new CustomerService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("customer/create.jsp").forward(request, response);
                break;
            case "edit":
                showForm(request, response, "customer/edit.jsp");
                break;
            case "delete":
                showForm(request, response, "customer/delete.jsp");
                break;
            case "view":
                showForm(request, response, "customer/view.jsp");
                break;
            default:
                List<Customer> customers = this.iCustomerService.findAll();
                request.setAttribute("listCustomer", customers);
                request.getRequestDispatcher("customer/list.jsp").forward(request, response);
                break;
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                createCustomer(request, response);
                break;
            case "edit":
                editCustomer(request);
                response.sendRedirect("/customer");
                break;
            case "delete":
                deleteCustomer(request);
                response.sendRedirect("/customer");
                break;
            default:
                break;
        }
    }


    private void showForm(HttpServletRequest request, HttpServletResponse response, String s) throws ServletException, IOException {
        int editId = Integer.parseInt(request.getParameter("id"));
        Customer editCustomer = this.iCustomerService.findById(editId);
        if (editCustomer == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            request.setAttribute("customer", editCustomer);
            request.getRequestDispatcher(s).forward(request, response);
        }
    }

    private void deleteCustomer(HttpServletRequest request) {
        int deleteId = Integer.parseInt(request.getParameter("id"));
        Customer deleteCustomer = this.iCustomerService.findById(deleteId);
        if (deleteCustomer == null) {
            request.getRequestDispatcher("error-404.jsp");
        } else {
            this.iCustomerService.remove(deleteId);
        }
    }

    private void editCustomer(HttpServletRequest request) {
        int editId = Integer.parseInt(request.getParameter("id"));
        String editName = request.getParameter("name");
        String editEmail = request.getParameter("email");
        String editAddress = request.getParameter("address");
        Customer editCustomer = new Customer(editId, editName, editEmail, editAddress);
        this.iCustomerService.update(editId, editCustomer);
//
//                Customer editCustomer1 = this.iCustomerService.findById(editId);
//                if(editCustomer1==null){
//                    request.getRequestDispatcher("error-404.jsp");
//                }else {
//                    editCustomer1.setName(editName);
//                    editCustomer1.setEmail(editEmail);
//                    editCustomer1.setAddress(editAddress);
//                    this.iCustomerService.update(editId,editCustomer1);
//                }
//                request.setAttribute("message","Customer information was updated!");
//                request.getRequestDispatcher("customer/edit.jsp").forward(request,response);
    }

    private void createCustomer(HttpServletRequest request, HttpServletResponse response) throws IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Customer customer = new Customer(id, name, email, address);
        this.iCustomerService.save(customer);
        response.sendRedirect("/customer");
    }
}
