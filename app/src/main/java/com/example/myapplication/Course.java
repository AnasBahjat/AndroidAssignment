package com.example.myapplication;

public class Course {
    private String courseName;
    public Course(String courseName){
        this.courseName=courseName;
    }

    public void setCourseName(String name){
        courseName=name;
    }
    public String getCourseName(){
        return  courseName;
    }
}
