package com.skillnext;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class StudentServlet extends HttpServlet {

    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        String name = req.getParameter("name");

        int sem = Integer.parseInt(
            req.getParameter("sem")        
        );

        String departement =
            req.getParameter("departement"); 

        Student stu = new Student();
        stu.setName(name);
        stu.setSem(sem);
        stu.setDepartement(departement);

        StudentDAO.save(stu);

        res.sendRedirect("success.jsp");
    }
}
