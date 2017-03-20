package ua.com.codespace;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "TestServlet", urlPatterns = "/test")
public class TestServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.getWriter().println("TEST SERVLET");
    }

    @Override
    public void init() throws ServletException {
        System.out.println(" *** Container is initializing TestServlet ***");
        super.init();
    }

    @Override
    public void destroy() {
        System.out.println(" *** Container is going to destroy TestServlet ***");
        super.destroy();
    }
}
