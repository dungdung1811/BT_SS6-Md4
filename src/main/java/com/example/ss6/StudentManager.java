package com.example.ss6;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "StudentServlet", value = ("/student"))

public class StudentManager extends HttpServlet {

    private final List<Student> students = new ArrayList<>();




    @Override
    public void init() throws ServletException {
//        thêm dữ liệu
        students.add(new Student("B01","Cong Phuong", 18,true));
        students.add(new Student("B02","Tien Linh", 18,false));
        students.add(new Student("B03","Cong Cong", 18,true));
        students.add(new Student("B04","Cong Nhan", 18,true));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        tạo yêu cầu
        req.setAttribute("students", students);
        req.getRequestDispatcher("/studen.jsp").forward(req,resp);
    }


    @Override
    public void destroy() {
        super.destroy();
    }
}
