package ua.com.codespace.controller;

import ua.com.codespace.model.User;
import ua.com.codespace.util.UserProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Map;

@WebServlet(name = "Servlet_002_LoginController", urlPatterns = "/login")
public class Servlet_002_LoginController extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String pass = request.getParameter("pass");
        if (email != null && !email.isEmpty() && pass != null && !pass.isEmpty()) {
            Map emailToUserMap = UserProvider.getEmailToUserMap();
            User user = (User) emailToUserMap.get(email);
            if (user == null || !user.getEmail().equals(email) || !user.getPassword().equals(pass)) {
                request.setAttribute("message", "Invalid email or password");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            } else {
                HttpSession session = request.getSession();
                session.setAttribute("user", user);
                response.sendRedirect("/user");
            }
        } else {
            request.setAttribute("message", "Enter email and password, please");
            response.sendRedirect("login.jsp");
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").forward(request, response);
    }
}
