import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CalculatorServlet", value = "/calculate")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        float firstNumber = Float.parseFloat(request.getParameter("firstNum"));
        float secondNumber = Float.parseFloat(request.getParameter("SecondNum"));
        char operator = request.getParameter("operator").charAt(0);
        float result;


        result = Calculator.calculate(firstNumber, secondNumber, operator);
        System.out.println(result);
        request.setAttribute("a", firstNumber);
        request.setAttribute("b", secondNumber);
        request.setAttribute("c", operator);
        request.setAttribute("d", result);

        request.getRequestDispatcher("index.jsp").forward(request,response);
    }
}
