import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DiscountCalculatorServlet", value = "/calculateDiscount")
public class DiscountCalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String product = request.getParameter("product");
        float price = Float.parseFloat(request.getParameter("price"));
        float rate = Float.parseFloat(request.getParameter("rate"));
        float discountTotal = (float) (price * rate * 0.01);
        float finalPrice = price - discountTotal;

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h2> Product: " + product + "</h2>");
        writer.println("<h3> Price: " + price + "</h3>");
        writer.println("<h3> Discount Percent: " + rate + "</h3>");
        writer.println("<h3> Discount Amount: " + discountTotal + "</h3>");
        writer.println("<h3> Price After Discount: " + finalPrice + "</h3>");
        writer.println("</html>");

    }
}
