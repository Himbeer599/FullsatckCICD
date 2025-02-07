package com.LSM;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        School school = new School();
        Student student1 = new Student("Joy", "Pilson", 1);
        Student student2 = new Student("Kevin", "Lovn", 2);
        Student student3 = new Student("Mike", "Penson", 3);
        Student student4 = new Student("Jack", "Milson", 4);
        Student student5 = new Student("Alicia", "Rand", 5);
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.printAllStudents();

        Student foundstudent1 = school.findById(6);
        Student foundstudent2= school.findById(3);
        System.out.println(foundstudent1);
        System.out.println(foundstudent2);
    }
}
