package com.example.demobaithi.model;

import com.example.demobaithi.entity.Student;

import java.util.List;

public interface StudentDAO {
    void add(Student student);
    List<Student> getAllStudent();
    Student findByid(int id);
    Student findByName();
    void edit(Student student);
    void remove(Student student);
}
