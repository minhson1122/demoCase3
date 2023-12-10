package com.example.demobaithi.service;

import com.example.demobaithi.controller.StudentController;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "StudentServlet", urlPatterns = "/student")
public class StudentServlet extends HttpServlet {
    protected StudentController studentController;
    public void init(){
        studentController = new StudentController();
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action ="";
        }
        try{
            switch (action){
                case "add":
                    studentController.showFormAddStudent(req, resp);
                    break;
                case "edit":
                    studentController.showFormUpdate(req, resp);
                    break;
                case "delete":
                    studentController.Delete(req, resp);
                    break;
                case "search":
                    studentController.showlistStudent(req, resp);
                    break;
                default:
                    studentController.showlistStudent(req, resp);
            }
        } catch (ServletException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("action");
        if (action == null){
            action ="";
        }
        try{
            switch (action){
                case "add":
                    studentController.addStudent(req, resp);
                    break;

            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
