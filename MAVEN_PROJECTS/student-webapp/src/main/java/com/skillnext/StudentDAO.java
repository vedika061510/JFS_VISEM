package com.skillnext;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentDAO {

    public static void save(Student stu) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/skillnext_db",
                "root",
                "thakur1506"
            );

            String sql = "INSERT INTO student(name, sem, department) VALUES(?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, stu.getName());
            ps.setString(2, stu.getSem());
            ps.setString(3, stu.getDepartment());

            ps.executeUpdate();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
