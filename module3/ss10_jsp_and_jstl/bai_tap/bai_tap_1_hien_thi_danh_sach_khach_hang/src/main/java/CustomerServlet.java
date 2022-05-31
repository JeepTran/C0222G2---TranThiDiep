import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/customerDisplay")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList = new ArrayList<>();
        customerList.add(new Customer("Mai Văn Hoàn","1983-08-20","Hà Nội","https://cdn1.vectorstock.com/i/1000x1000/53/95/happy-flower-cartoon-flower-vector-37125395.jpg"));
        customerList.add(new Customer("Nguyễn Văn Nam","1983-08-21","Bắc Giang","https://img.freepik.com/free-vector/cute-flower-cartoon-character_313669-38.jpg"));
        customerList.add(new Customer("Nguyễn Thái Hòa","1983-08-22","Nam Định","https://thumbs.dreamstime.com/b/cute-flower-cartoon-grass-clipart-vector-illustration-223759667.jpg"));
        customerList.add(new Customer("Trần Đăng Khoa","1983-08-17","Hà Tây","https://cdn1.vectorstock.com/i/1000x1000/51/85/flower-cartoon-vector-6335185.jpg"));
        customerList.add(new Customer("Nguyễn Đình Thi","1983-08-19","Hà Nội","https://us.123rf.com/450wm/yupiramos/yupiramos1803/yupiramos180307685/96803395-beautiful-flower-wink-cartoon-vector-illustration.jpg?ver=6"));

    request.setAttribute("customers",customerList);
    request.getRequestDispatcher("index.jsp").forward(request,response);


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
