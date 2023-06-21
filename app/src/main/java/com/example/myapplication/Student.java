package com.example.myapplication;

public class Student {
    private int ID;
    private int grade;
    private Course courseName;
    public Student(int ID,int grade,Course courseObj){
        this.ID=ID;
        this.grade=grade;
        this.courseName=courseObj;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setGrade(int grade){
        this.grade=grade;
    }
    public int getID(){
        return ID;
    }
    public int getGrade(){
        return grade;
    }
}
