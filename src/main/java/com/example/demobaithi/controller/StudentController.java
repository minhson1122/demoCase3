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
        String key = request.getParameter("key");
        List<Student> studentList;
        if (key == null){
             studentList = studentDAO.getAllStudent();
        }else {
            studentList = studentDAO.findByName(key);
        }
        request.setAttribute("key",key);
        request.setAttribute("studentList", studentList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/showlist.jsp");
        dispatcher.forward(request,response);
    }
public void showFormAddStudent(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException{
        RequestDispatcher dispatcher = request.getRequestDispatcher("/view/add.jsp");
        dispatcher.forward(request,response);

}
public void addStudent(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException{
        String name  = request.getParameter("name");
    String email  = request.getParameter("email");
    String DateOfBirt  = request.getParameter("DateOfBirt");
    String address  = request.getParameter("address");
    String phone  = request.getParameter("phone");
    String classroom  = request.getParameter("classroom");
    Student student = new Student(name,email,DateOfBirt,address,phone,classroom);
    studentDAO.add(student);
    System.out.println(student);
RequestDispatcher dispatcher = request.getRequestDispatcher("/view/add.jsp");
dispatcher.forward(request,response);
}
public void showFormUpdate(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        Student student = studentDAO.findByid(id);
        request.setAttribute("student", student);
    RequestDispatcher dispatcher = request.getRequestDispatcher("/view/edit.jsp");
    dispatcher.forward(request,response);
}
public void Delete(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
        int id = Integer.parseInt(request.getParameter("id"));
        studentDAO.remove(id);
        response.sendRedirect("/student");
}

}

