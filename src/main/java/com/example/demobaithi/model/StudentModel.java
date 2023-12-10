package com.example.demobaithi.model;

import com.example.demobaithi.database.Database;
import com.example.demobaithi.entity.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentModel implements StudentDAO{
    protected Connection conn;

    public StudentModel() {
        Database database = Database.getInstance();
        this.conn = database.connection();
    }

    @Override
    public void add(Student student) {
        try{
            String sql = "insert into students (name,email,dateOfBirt, address, phone,classroom) values(?,?,?,?,?,?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,student.getName());
            statement.setString(2,student.getEmail());
            statement.setString(3,student.getDateOfBirt());
            statement.setString(4,student.getAddress());
            statement.setString(5,student.getPhone());
            statement.setString(6,student.getClassroom());
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Student> getAllStudent() {
        List<Student> list = new ArrayList<>();
        try{
            String sql = "select * from Students";
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String dateofBirt = rs.getString(4);
                String address = rs.getString(5);
                String phone = rs.getString(6);
                String classroom = rs.getString(7);
                Student student = new Student(id,name, email,dateofBirt,address,phone,classroom);
                list.add(student);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public Student findByid(int id) {
        Student student = null;
        try{
            String sql = "select * from students where id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            ResultSet rs = statement.executeQuery();
            while (rs.next()) {
                String name = rs.getString(2);
                String email = rs.getString(3);
                String DateOfBirt = rs.getString(4);
                String address = rs.getString(5);
                String phone = rs.getString(6);
                String classroom = rs.getString(7);
                student = new Student(name, email, DateOfBirt, address, phone, classroom);

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return student;
    }


    @Override
    public List<Student> findByName(String key) {
        List<Student> list = new ArrayList<>();
        try{
            String sql = "select * from students where name like ? ";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, "%" + key + "%");
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                int id = rs.getInt(1);
                String name = rs.getString(2);
                String email = rs.getString(3);
                String DateOfBirt = rs.getString(4);
                String address = rs.getString(5);
                String phone = rs.getString(6);
                String classroom = rs.getString(7);
                Student student = new Student(id,name,email,DateOfBirt,address,phone,classroom);
                list.add(student);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return list;
    }

    @Override
    public void edit(Student student) {
        try{
            String sql  = "update students set name= ?, email = ?, DateOfBirt = ? , address = ?, phone = ? ,classroom = ? where id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1,student.getName());
            statement.setString(2,student.getEmail());
            statement.setString(3,student.getDateOfBirt());
            statement.setString(4,student.getAddress());
            statement.setString(5,student.getPhone());
            statement.setString(6,student.getClassroom());
            statement.executeUpdate();

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void remove(int id) {
        try {
            String sql = "delete from students where id = ?";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1,id);
            statement.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
