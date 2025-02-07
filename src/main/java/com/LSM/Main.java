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
        Course course1 = new Course("Math","Dr.Use","101");
        Course course2 = new Course("History","Dr.Simth","111");
        Course course3 = new Course("English","Dr.John","121");
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);
        school.addStudent(student4);
        school.addStudent(student5);
        school.printAllStudents();
        school.addCourse(course1);
        school.addCourse(course2);
        school.addCourse(course3);
        school.printAllCourses();

        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);
        student2.addCourse(course1);
        student3.addCourse(course2);
        student2.addCourse(course3);
        student3.addCourse(course1);
        student4.addCourse(course2);
        student5.addCourse(course3);

        Student foundstudent1 = school.findById(6);
        Student foundstudent2 = school.findById(3);
        System.out.println(foundstudent1);
        System.out.println(foundstudent2);
        int removedStudentId = 3;
        school.removeById(removedStudentId);
        school.printAllStudents();

        int studentId = 2;
        List<Course> courses= school.getCoursesOfStudent(studentId);
        System.out.println(courses);

    }
}
