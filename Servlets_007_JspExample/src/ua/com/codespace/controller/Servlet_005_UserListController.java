package ua.com.codespace.controller;

import ua.com.codespace.util.UserProvider;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_005_UserListController", urlPatterns = "/users")
public class Servlet_005_UserListController extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("userList", UserProvider.getListOfUser());
        request.getRequestDispatcher("users.jsp").forward(request, response);
    }
}
