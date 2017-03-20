package ua.com.codespace.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;


@WebServlet(name = "Servlet_001_SimpleGetController", urlPatterns = "/email")
public class Servlet_001_SimpleGetController extends HttpServlet {
    private Map<String, String> userEmailsMap;

    @Override
    public void init() throws ServletException {
        userEmailsMap = new HashMap<>();
        userEmailsMap.put("Chandler", "c.bing@gmail.com");
        userEmailsMap.put("Ross", "r.geller@gmail.com");
        userEmailsMap.put("Harvey", "specter@yahoo.com");
        super.init();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter writer = response.getWriter();

        String name = request.getParameter("name");
        if (name == null) {
            writer.println("Name is not specified");
        } else {
            String email = userEmailsMap.get(name);

            if (email != null) {
                writer.println(email);
            } else {
                writer.println("Email doesn't exist");
            }
        }
    }
}
