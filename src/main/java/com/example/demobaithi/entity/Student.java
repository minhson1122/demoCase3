package com.example.demobaithi.entity;

public class Student {
    private int id;
    private String name;
    private String email;
    private String dateOfBirt;
    private String address;
    private String phone;
    private String classroom;

    public Student(int id, String name, String email, String dateOfBirt, String address, String phone, String classroom) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.dateOfBirt = dateOfBirt;
        this.address = address;
        this.phone = phone;
        this.classroom = classroom;
    }

    public Student(String name, String email, String dateOfBirt, String address, String phone, String classroom) {
        this.name = name;
        this.email = email;
        this.dateOfBirt = dateOfBirt;
        this.address = address;
        this.phone = phone;
        this.classroom = classroom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDateOfBirt() {
        return dateOfBirt;
    }

    public void setDateOfBirt(String dateOfBirt) {
        this.dateOfBirt = dateOfBirt;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }
}
