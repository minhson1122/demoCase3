package com.example.demobaithi.controller;

import com.example.demobaithi.entity.Student;
import com.example.demobaithi.model.StudentDAO;
import com.example.demobaithi.model.StudentModel;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class StudentController {
    protected StudentDAO studentDAO;

    public StudentController() {
        this.studentDAO = new StudentModel();
    }
    public void showlistStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Student> studentList = studentDAO.getAllStudent();
        request.setAttribute("studentList", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/showlist.jsp");
        dispatcher.forward(request,response);
    }
public void showFormAddStudent(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/add.jsp");
        dispatcher.forward(request,response);

}
}
