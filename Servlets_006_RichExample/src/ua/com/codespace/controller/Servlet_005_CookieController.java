package ua.com.codespace.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_005_CookieController", urlPatterns = "/cookie")
public class Servlet_005_CookieController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String key = request.getParameter("key");
        String value = request.getParameter("value");

        if (key != null && !key.isEmpty() && value != null && !value.isEmpty()) {
            response.addCookie(new Cookie(key, value));
        } else {
            System.out.println("Invalid cookie");
        }

        response.sendRedirect("cookie.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.sendRedirect("cookie.html");
    }
}
