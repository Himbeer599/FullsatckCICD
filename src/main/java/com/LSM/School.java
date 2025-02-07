package com.LSM;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;

    public School() {
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }
    public Student findById(int id){
        for(Student student :students){
            if(student.getStudentId() == id){
                return student;
            }
        }
        return null;
    }

    public void printAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the school");
        } else {
            System.out.println("List of all students:");
            for (Student student : students) {
                System.out.println(student);
            }
        }
    }
}
