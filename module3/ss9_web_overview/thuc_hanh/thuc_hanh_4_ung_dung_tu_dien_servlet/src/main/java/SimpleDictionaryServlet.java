import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "SimpleDictionaryServlet", value = "/translate")
public class SimpleDictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("Hello", "Xin chào");
        dictionary.put("Bye", "Tạm biệt");
        dictionary.put("Book", "Quyển sách");
        dictionary.put("Computer", "Máy tính");

        String search = request.getParameter("textSearch");

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        String result = dictionary.get(search);
        if (result != null) {
            writer.println("Word: " + search + "<br>");
            writer.println("Result: " + result);
        } else {
            writer.println("Not found!");
        }
        writer.println("</html>");
    }
}
