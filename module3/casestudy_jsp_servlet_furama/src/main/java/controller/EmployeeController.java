package controller;

import model.employee.*;
import service.employee.IEmployeeService;
import service.employee.impl.EmployeeServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "EmployeeController", value = "/employee")
public class EmployeeController extends HttpServlet {
    private IEmployeeService employeeService = new EmployeeServiceImpl();

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
                searchEmployeeByName(request, response);
                break;
            case "update":
                displayUpdateForm(request, response);
                break;
            case "delete":
                deleteEmployee(request, response);
                break;
            default:
                displayAllEmployee(request, response);
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
                createNewEmployee(request, response);
                break;
            case "update":
                updateEmployee(request, response);
                break;
            default:
                displayAllEmployee(request, response);
                break;

        }
    }

    private void displayUpdateForm(HttpServletRequest request, HttpServletResponse response) {
        int updateId = Integer.parseInt(request.getParameter("id"));
        Employee employee = employeeService.findEmployeeById(updateId);
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducationDegree();
        List<Division> divisionList = employeeService.findAllDivision();
        List<User> userList = employeeService.findAllUser();
        if (employee == null) {
            try {
                response.sendRedirect("error404.jsp");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            request.setAttribute("employee", employee);
            request.setAttribute("positionList", positionList);
            request.setAttribute("educationDegreeList", educationDegreeList);
            request.setAttribute("divisionList", divisionList);
            request.setAttribute("userList", userList);
            try {
                request.getRequestDispatcher("furama/employee/updateEmployee.jsp").forward(request, response);
            } catch (ServletException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void deleteEmployee(HttpServletRequest request, HttpServletResponse response) {
        int deleteId = Integer.parseInt(request.getParameter("id"));
        employeeService.deleteEmployee(deleteId);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void updateEmployee(HttpServletRequest request, HttpServletResponse response) {
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("employeeName");
        String birthday = request.getParameter("employeeBirthday");
        String idCard = request.getParameter("employeeIdCard");
        double salary = Double.parseDouble(request.getParameter("employeeSalary"));
        String phone = request.getParameter("employeePhone");
        String email = request.getParameter("employeeEmail");
        String address = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String username = request.getParameter("username");
        Employee employee = new Employee(id, name, birthday, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId, username);
        employeeService.updateEmployeeInfo(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void createNewEmployee(HttpServletRequest request, HttpServletResponse response) {
        String name = request.getParameter("employeeName");
        String birthday = request.getParameter("employeeBirthday");
        String idCard = request.getParameter("employeeIdCard");
        double salary = Double.parseDouble(request.getParameter("employeeSalary"));
        String phone = request.getParameter("employeePhone");
        String email = request.getParameter("employeeEmail");
        String address = request.getParameter("employeeAddress");
        int positionId = Integer.parseInt(request.getParameter("positionId"));
        int educationDegreeId = Integer.parseInt(request.getParameter("educationDegreeId"));
        int divisionId = Integer.parseInt(request.getParameter("divisionId"));
        String username = request.getParameter("username");
        Employee employee = new Employee(name, birthday, idCard, salary, phone, email, address, positionId, educationDegreeId, divisionId, username);
        employeeService.addNewEmployee(employee);
        try {
            response.sendRedirect("/employee");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducationDegree();
        List<Division> divisionList = employeeService.findAllDivision();
        List<User> userList = employeeService.findAllUser();
        request.setAttribute("positionList", positionList);
        request.setAttribute("educationDegreeList", educationDegreeList);
        request.setAttribute("divisionList", divisionList);
        request.setAttribute("userList", userList);

        try {
            request.getRequestDispatcher("furama/employee/createEmployee.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayAllEmployee(HttpServletRequest request, HttpServletResponse response) {
        List<Employee> employeeList = employeeService.findAll();
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducationDegree();
        List<Division> divisionList = employeeService.findAllDivision();
        request.setAttribute("employeeList", employeeList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("educationDegreeList", educationDegreeList);
        request.setAttribute("divisionList", divisionList);
        try {
            request.getRequestDispatcher("furama/employee/listEmployee.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void searchEmployeeByName(HttpServletRequest request, HttpServletResponse response) {
        String searchName = request.getParameter("search");
        List<Employee> employeeSearchList = employeeService.findEmployeeByName(searchName);
        List<Position> positionList = employeeService.findAllPosition();
        List<EducationDegree> educationDegreeList = employeeService.findAllEducationDegree();
        List<Division> divisionList = employeeService.findAllDivision();
        List<User> userList = employeeService.findAllUser();
        request.setAttribute("searchName", searchName);
        request.setAttribute("employeeList", employeeSearchList);
        request.setAttribute("positionList", positionList);
        request.setAttribute("educationDegreeList", educationDegreeList);
        request.setAttribute("divisionList", divisionList);
        request.setAttribute("userList", userList);
        try {
            request.getRequestDispatcher("furama/employee/listEmployee.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
