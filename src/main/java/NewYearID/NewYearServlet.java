package NewYearID;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet("/newYear")
public class NewYearServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Map<String, User> users = new HashMap<>();
        users.put("1", new User("Bobby", "10000$"));
        users.put("2", new User("Spencer", "10500$"));
        users.put("3", new User("Amanda", "500$"));
        User user;
        if (users.containsKey(req.getParameter("id"))){
            user = users.get(req.getParameter("id"));
        } else {
            user = new User("Unknown person", "unknown");
        }
        req.setAttribute("keyUser", user);
        getServletContext().getRequestDispatcher("/NewYearJSP.jsp").forward(req, resp);
    }
}
