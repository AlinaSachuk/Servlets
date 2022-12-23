package Servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String text = req.getParameter("cat");
        System.out.println(text);
        getServletContext().getRequestDispatcher("/HelloHTML.html").forward(req,resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("Service done");
    }

    @Override
    public void destroy() {
        System.out.println("Destroy Hello Tomcat");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("Init Hello Tomcat");
    }
}
