package controller;

import model.customer.Customer;
import model.customer.CustomerType;
import service.customer.ICustomerService;
import service.customer.impl.CustomerServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "CustomerController", value = "/customer")
public class CustomerController extends HttpServlet {
    private ICustomerService customerService = new CustomerServiceImpl();

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
            case "search":
                searchByMultiInfo(request, response);
                break;
            case "update":
                displayUpdateForm(request, response);
                break;
            case "delete":
                deleteCustomer(request, response);
                break;
            default:
                displayAllCustomer(request, response);
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
                createNewCustomer(request, response);
                break;
            case "update":
                updateCustomer(request, response);
                break;
            default:
                displayAllCustomer(request, response);
                break;

        }
    }

    private void displayUpdateForm(HttpServletRequest request, HttpServletResponse response) {
        int updateId = Integer.parseInt(request.getParameter("id"));
        Customer customer = customerService.findCustomerById(updateId);
        List<CustomerType> customerTypeList = customerService.findAllCustomerType();
        if (customer == null) {
            try {
                response.sendRedirect("error404.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("customer", customer);
            request.setAttribute("customerTypeList", customerTypeList);
            try {
                request.getRequestDispatcher("furama/customer/updateCustomer.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteCustomer(HttpServletRequest request, HttpServletResponse response) {
        int deleteId = Integer.parseInt(request.getParameter("id"));
        customerService.deleteCustomer(deleteId);
        try {
            response.sendRedirect("/customer");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateCustomer(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        int customerTypeId = 0;
        try {
            customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String name = request.getParameter("customerName");

        String birthday = request.getParameter("customerBirthday");
        int gender = 2;
        try {
            gender = Integer.parseInt(request.getParameter("customerGender"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String idCard = request.getParameter("customerIdCard");
        String phone = request.getParameter("customerPhone");
        String email = request.getParameter("customerEmail");
        String address = request.getParameter("customerAddress");
        Customer customer = new Customer(id, customerTypeId, name, birthday, gender, idCard, phone, email, address);
        Map<String, String> errors = customerService.updateCustomerInfo(customer);
        if (errors.isEmpty()) {
            try {
                response.sendRedirect("/customer");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("errors", errors);
            request.setAttribute("customer", customer);
            request.setAttribute("customerTypeList", customerService.findAllCustomerType());
            try {
                request.getRequestDispatcher("furama/customer/updateCustomer.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    private void createNewCustomer(HttpServletRequest request, HttpServletResponse response) {
        int customerTypeId = 0;
        try {
            customerTypeId = Integer.parseInt(request.getParameter("customerTypeId"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        String name = request.getParameter("customerName");
        String birthday = request.getParameter("customerBirthday");
        int gender = 2;
        try {
            gender = Integer.parseInt(request.getParameter("customerGender"));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println(birthday);
        String idCard = request.getParameter("customerIdCard");
        String phone = request.getParameter("customerPhone");
        String email = request.getParameter("customerEmail");
        String address = request.getParameter("customerAddress");
        Customer customer = new Customer(customerTypeId, name, birthday, gender, idCard, phone, email, address);
        Map<String, String> errors = customerService.addNewCustomer(customer);
        if (errors.isEmpty()) {
            try {
                response.sendRedirect("/customer");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("errors", errors);
            request.setAttribute("customer", customer);
            request.setAttribute("customerTypeList", customerService.findAllCustomerType());
            try {
                request.getRequestDispatcher("furama/customer/createCustomer.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    private void displayCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<CustomerType> customerTypeList = customerService.findAllCustomerType();
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("furama/customer/createCustomer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayAllCustomer(HttpServletRequest request, HttpServletResponse response) {
        List<Customer> customerList = customerService.findAll();
        List<CustomerType> customerTypeList = customerService.findAllCustomerType();
        request.setAttribute("customerList", customerList);
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("furama/customer/listCustomer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchByMultiInfo(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("searchName");
        String searchCustomerId = request.getParameter("searchCustomerId");

        String searchCustomerTypeId = "";
        if (request.getParameter("searchCustomerTypeId") != null) {
            searchCustomerTypeId = request.getParameter("searchCustomerTypeId");
        }
        System.out.println(searchName);
        System.out.println(searchCustomerId);
        System.out.println(searchCustomerTypeId);

        List<Customer> customerSearchList = customerService.findCustomerByMultiInfo(searchName, searchCustomerId, searchCustomerTypeId);
        List<CustomerType> customerTypeList = customerService.findAllCustomerType();

        request.setAttribute("searchName", searchName);
        request.setAttribute("searchCustomerId", searchCustomerId);
        request.setAttribute("searchCustomerTypeId", searchCustomerTypeId);
        request.setAttribute("customerList", customerSearchList);
        request.setAttribute("customerTypeList", customerTypeList);
        try {
            request.getRequestDispatcher("furama/customer/listCustomer.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
