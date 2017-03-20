package ua.com.codespace.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.stream.Stream;

@WebServlet(name = "Servlet_006_CookieController", urlPatterns = "/cookies")
public class Servlet_006_CookieController extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Stream<Cookie> cookieStream = Stream.of(request.getCookies());

        PrintWriter writer = response.getWriter();
        cookieStream.forEach(cookie -> writer.printf("%30s%30s\n", cookie.getName(), cookie.getValue()));
    }
}
