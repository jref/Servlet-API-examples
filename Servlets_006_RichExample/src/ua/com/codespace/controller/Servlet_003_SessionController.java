package ua.com.codespace.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "Servlet_003_SessionController", urlPatterns = "/login")
public class Servlet_003_SessionController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        if (email != null && !email.isEmpty() && pass != null && !pass.isEmpty()) {
            HttpSession session = request.getSession();
            session.setAttribute("email", email);
//            request.setAttribute("email", email);
//            request.getServletContext().setAttribute("email", email);

        } else {
            System.out.println("ENTER EMAIL AND PASSWORD");
        }

        response.sendRedirect("/login");

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession(false);
        if (session == null) {
            response.sendRedirect("login.html");
        } else {
            String email = (String) session.getAttribute("email");
            response.getWriter().println("[" + email + "]");
        }
    }
}
