package com.example.demobaithi.model;

import com.example.demobaithi.entity.Student;

import java.util.List;

public interface StudentDAO {
    void add(Student student);
    List<Student> getAllStudent();
    Student findByid(int id);
    List<Student> findByName(String key);
    void edit(Student student);
    void remove(int id);
}
