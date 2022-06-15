package controller;

import model.service.RentType;
import model.service.Service;
import model.service.ServiceType;
import service.service.IServiceService;
import service.service.impl.ServiceServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ServiceController", value = "/service")
public class ServiceController extends HttpServlet {
    private IServiceService serviceService = new ServiceServiceImpl();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                break;
            default:
                displayAllService(request, response);
                break;
        }
    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }


    private void displayAllService(HttpServletRequest request, HttpServletResponse response) {
        List<Service> serviceList = serviceService.findAllService();
        List<ServiceType> serviceTypeList = serviceService.findAllServiceType();
        List<RentType> rentTypeList = serviceService.findAllRentType();
        request.setAttribute("serviceList",serviceList);
        request.setAttribute("serviceTypeList",serviceTypeList);
        request.setAttribute("rentTypeList",rentTypeList);
        try {
            request.getRequestDispatcher("furama/service/listService.jsp").forward(request,response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
