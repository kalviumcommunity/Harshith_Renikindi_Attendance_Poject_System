package com.school;

public class Course {
    private static int nextCourseIdCounter = 101;
    String courseId; // e.g., "CS101"
    String courseName;

    public Course(String courseName) {
        this.courseId = nextCourseIdCounter++;
        this.courseName = courseName;
    
    }
    public void displayDetails() {
        // Displaying courseId with a prefix for better readability
        System.out.println("Course ID: C" + this.courseId + ", Name: " + this.courseName);
    }

}
