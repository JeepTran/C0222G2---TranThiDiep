import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "DictionaryServlet", value = "/translate")
public class DictionaryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("bye", "tam biệt");
        dictionary.put("school", "trường học");
        dictionary.put("table", "cái bàn");
        String search = request.getParameter("search");
        String result = dictionary.get(search);
        if (result != null) {
            request.setAttribute("result", result);
        } else {
            request.setAttribute("result", "Not found!");
        }
        request.getRequestDispatcher("index.jsp").forward(request, response);

    }
}
