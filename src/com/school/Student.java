package com.school;

public class Student {
    private static int nextStudentIdCounter=1;
    private int studentId;
    private String name;
    
    public Student(String name){
        this.name=name;
        this.studentId=nextStudentIdCounter++;
        }

    public int getStudentId() {
        return studentId;
    }

       // Getter for name
    public String getName() {
        return name;
    }


    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
