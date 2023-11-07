package com.example.ss6;

import java.io.*;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(name = "DiscountCalculatorStudent", value = "/discountcalculatorstudent")
public class DiscountCalculatorStudent extends HttpServlet {
    @Override
    public void init() {

    }

    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("calculator.jsp").forward(req,resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String description = req.getParameter("Description");
        Float price = Float.valueOf(req.getParameter("Price"));
        Float percent = Float.valueOf(req.getParameter("Percent"));
        float discountAmount = (float) ((price*percent)*0.01);

        req.setAttribute("Description",description);
        req.setAttribute("Price",price);
        req.setAttribute("Percent",percent);
        req.setAttribute("DiscountAmount",discountAmount);
        req.getRequestDispatcher("discountServlet.jsp").forward(req,resp);



    }

    @Override
    public void destroy() {
        super.destroy();
    }

}