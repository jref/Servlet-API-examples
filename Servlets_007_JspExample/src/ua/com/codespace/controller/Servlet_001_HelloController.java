package ua.com.codespace.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_001_HelloController", urlPatterns = "/hello")
public class Servlet_001_HelloController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        if (name == null) {
            request.setAttribute("message", "Name in not specified!");
            request.setAttribute("name", "Unknown");
        } else {
            request.setAttribute("name", name);
        }

        request.getRequestDispatcher("hello.jsp").forward(request, response);
    }
}
