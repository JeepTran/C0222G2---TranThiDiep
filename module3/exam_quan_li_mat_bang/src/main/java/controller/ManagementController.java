package controller;

import model.LoaiMatBang;
import model.MatBang;
import model.TrangThai;
import service.IMatBangService;
import service.impl.MatBangServiceImpl;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@WebServlet(name = "ManagementController", value = "/management")
public class ManagementController extends HttpServlet {
    private IMatBangService matBangService = new MatBangServiceImpl();

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
            case "delete":
                delete(request, response);
                break;
            default:
                displayAll(request, response);
                break;
        }
    }

    private void displayCreateForm(HttpServletRequest request, HttpServletResponse response) {
        List<LoaiMatBang> loaiMatBangList = matBangService.findAllLoaiMatBang();
        List<TrangThai> trangThaiList = matBangService.findAllTrangThai();
        try {
            request.setAttribute("loaiMatBangList", loaiMatBangList);
            request.setAttribute("trangThaiList", trangThaiList);
            request.getRequestDispatcher("management/create.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private void delete(HttpServletRequest request, HttpServletResponse response) {
        String deleteId = request.getParameter("id");
        matBangService.delete(deleteId);
        try {
            response.sendRedirect("/management");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void displayAll(HttpServletRequest request, HttpServletResponse response) {
        List<MatBang> matBangList = matBangService.findAllMatBang();
        List<LoaiMatBang> loaiMatBangList = matBangService.findAllLoaiMatBang();
        List<TrangThai> trangThaiList = matBangService.findAllTrangThai();
        request.setAttribute("matBangList", matBangList);
        request.setAttribute("loaiMatBangList", loaiMatBangList);
        request.setAttribute("trangThaiList", trangThaiList);
        try {
            request.getRequestDispatcher("management/management.jsp").forward(request, response);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
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
                create(request, response);
                break;

            default:
                displayAll(request, response);
                break;
        }
    }

    private void create(HttpServletRequest request, HttpServletResponse response) {

        String maMatBang = request.getParameter("maMatBang");
        int maTrangThai = Integer.parseInt(request.getParameter("maTrangThai"));
        double dienTich = Double.parseDouble(request.getParameter("dienTich"));
        int tang = Integer.parseInt(request.getParameter("tang"));
        int maLoaiMatBang = Integer.parseInt(request.getParameter("maLoaiMatBang"));
        double giaTien = Double.parseDouble(request.getParameter("giaTien"));
        String ngayBatDau = request.getParameter("ngayBatDau");
        String ngayKetThuc = request.getParameter("ngayKetThuc");
        MatBang matBang = new MatBang(maMatBang, maTrangThai, dienTich, tang, maLoaiMatBang, giaTien, ngayBatDau, ngayKetThuc);
        matBangService.create(matBang);
        try {
            response.sendRedirect("/management");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
