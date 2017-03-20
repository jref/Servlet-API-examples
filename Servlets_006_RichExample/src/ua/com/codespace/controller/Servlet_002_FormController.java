package ua.com.codespace.controller;

import ua.com.codespace.model.Gender;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "Servlet_002_FormController", urlPatterns = "/form")
public class Servlet_002_FormController extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Gender gender = Gender.valueOf(request.getParameter("gender"));
        System.out.println("  Name: " + name);
        System.out.println("Gender: " + gender);

        request.getParameterMap().forEach((k,v)->System.out.println(k+" "+v));
        response.getWriter().println("<h1 style='text-align: center'>Thank you, " + name + "</h1>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //1
        request.getRequestDispatcher("form.html").forward(request,response);
        //2

    }
}
