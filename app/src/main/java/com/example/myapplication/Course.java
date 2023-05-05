package com.example.myapplication;

public class Course {
    private String courseName;
    private int numOfHours;
    public Course(String courseNameX,int numOfHoursX){
        courseName=courseNameX;
        numOfHours=numOfHoursX;
    }

    public void setCourseName(String name){
        courseName=name;
    }
    public String getCourseName(){
        return  courseName;
    }
    public void setNumOfHours(int number){
        numOfHours=number;
    }
    public int getNumOfHours(){
        return numOfHours;
    }

}
