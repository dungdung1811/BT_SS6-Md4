package com.example.ss6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name ="accountServlet", value = "/account")
public class AccoutnServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        super.init();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      req.getRequestDispatcher("account.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String userName = req.getParameter("UserName");
        String email = req.getParameter("Email");
        String passWord = req.getParameter("Password");
        req.setAttribute("UserName",userName);
        req.setAttribute("Email",email);
        req.setAttribute("Password",passWord);
        req.getRequestDispatcher("hello.jsp").forward(req,resp);
    }

    @Override
    public void destroy() {
        super.destroy();
    }
}
