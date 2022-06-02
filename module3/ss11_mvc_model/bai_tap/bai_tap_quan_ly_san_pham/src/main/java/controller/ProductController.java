package controller;

import model.Product;
import service.IProductService;
import service.impl.ProductService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "ProductController", value = "/controller")
public class ProductController extends HttpServlet {
    private IProductService productService = new ProductService();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String action = request.getParameter("action");
        if (action == null) {
            action = "";
        }
        switch (action) {
            case "create":
                request.getRequestDispatcher("product/create.jsp").forward(request, response);
                break;
            case "update":
                Integer updateId = Integer.parseInt(request.getParameter("id"));
                Product updateProduct = productService.findById(updateId);
                if (updateProduct == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    request.setAttribute("product", updateProduct);
                    request.getRequestDispatcher("product/update.jsp").forward(request, response);
                }
                break;
            case "delete":
                Integer deleteId = Integer.parseInt(request.getParameter("id"));
                Product deleteProduct = productService.findById(deleteId);
                if (deleteProduct == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    request.setAttribute("product", deleteProduct);
                    request.getRequestDispatcher("product/delete.jsp").forward(request, response);
                }
                break;
            case "view":
                Integer viewId = Integer.parseInt(request.getParameter("id"));
                Product viewProduct = productService.findById(viewId);
                if (viewProduct == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    request.setAttribute("product", viewProduct);
                    request.getRequestDispatcher("product/view_detail.jsp").forward(request, response);
                }
                break;
            case "search":
                String searchName = request.getParameter("name");
                List<Product> searchList = productService.search(searchName);
                if (searchList == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    request.setAttribute("searchList", searchList);
                    request.getRequestDispatcher("product/search.jsp").forward(request, response);
                }
                break;
            default:
                List<Product> products = productService.findAll();
                request.setAttribute("products", products);
                request.getRequestDispatcher("product/list.jsp").forward(request, response);
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
                Integer id = Integer.parseInt(request.getParameter("id"));
                String name = request.getParameter("name");
                Double price = Double.parseDouble(request.getParameter("price"));
                String description = request.getParameter("description");
                String manufacturer = request.getParameter("manufacturer");
                Product product = new Product(id, name, price, description, manufacturer);
                productService.create(product);
                response.sendRedirect("/controller");
                break;
            case "update":
                Integer updateId = Integer.parseInt(request.getParameter("id"));
                String updateName = request.getParameter("name");
                Double updatePrice = Double.parseDouble(request.getParameter("price"));
                String updateDescription = request.getParameter("description");
                String updateManufacturer = request.getParameter("manufacturer");

                Product updateProduct = productService.findById(updateId);
                if (updateProduct == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    updateProduct.setId(updateId);
                    updateProduct.setName(updateName);
                    updateProduct.setPrice(updatePrice);
                    updateProduct.setDescription(updateDescription);
                    updateProduct.setManufacturer(updateManufacturer);
                    productService.update(updateId, updateProduct);
                }
                response.sendRedirect("/controller");

                break;
            case "delete":
                Integer deleteId = Integer.parseInt(request.getParameter("id"));
                Product deleteProduct = productService.findById(deleteId);
                if (deleteProduct == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    productService.delete(deleteId);
                }
                response.sendRedirect("/controller");
                break;
            case "search":
                String searchName = request.getParameter("search");
                List<Product> searchList = productService.search(searchName);
                if (searchList == null) {
                    request.getRequestDispatcher("error-404.jsp");
                } else {
                    request.setAttribute("searchList", searchList);
                    request.getRequestDispatcher("product/search.jsp").forward(request, response);
                }
                break;
            default:
                List<Product> products = new ArrayList<>();
                request.setAttribute("products", products);
                request.getRequestDispatcher("product/list.jsp").forward(request, response);
                break;
        }
    }
}
