package com.example.demobaithi.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    protected String URL;
    protected String username;
    protected String password;
    public static Database instane;

    public Database() {
        this.URL = "jdbc:mysql://localhost:3306/student";
        this.username = "root";
        this.password = "tomtep123";
    }
    public static Database getInstance(){
         if (instane == null){
             instane = new Database();
         }
         return instane;
    }
    public Connection connection(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(URL,username,password);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
