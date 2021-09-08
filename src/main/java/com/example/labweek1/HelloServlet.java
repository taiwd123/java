package com.example.labweek1;

import User.Users;

import java.io.*;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        doPost(request, response);
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.setContentType("text/html");
        String url = "/index.html";
        String action = request.getParameter("action");
        if (action == null) {
            action = "join";
        }
        if (action.equals("join")) {
            url = "/index.html";
        } else if (action.equals("add")) {
            String email = request.getParameter("email");
            String firstname = request.getParameter("firstName");
            String lastname = request.getParameter("lastName");
            Users user = new Users(email, firstname, lastname);
            url = "/index.jsp";

            request.setAttribute("User", user);
        }
        getServletContext().getRequestDispatcher(url).forward(request, response);
    }

    public void destroy() {
    }
}