package com.example.myapplication;

public class Student {
    private int ID;
    private String name;
    private int grade;
    private Course courseName;
    public Student(String name,int ID,int grade,Course courseObj){
        this.name=name;
        this.ID=ID;
        this.grade=grade;
        this.courseName=courseObj;
    }
    public void setID(int ID){
        this.ID=ID;
    }
    public void setName(String name){
        this.name=name;
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
    public String getName(){
        return name;
    }
}
