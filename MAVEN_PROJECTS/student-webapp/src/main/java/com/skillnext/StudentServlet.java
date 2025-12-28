package com.skillnext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");
        String sem = req.getParameter("sem");
        String department = req.getParameter("department");

        Student stu = new Student();
        stu.setName(name);
        stu.setSem(sem);
        stu.setDepartment(department);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}
