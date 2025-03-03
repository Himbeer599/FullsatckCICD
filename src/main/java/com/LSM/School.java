package com.LSM;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students;
    private List<Course> courses;

    public School() {
        this.students = new ArrayList<>();
        this.courses = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student findById(int id) {
        for (Student student : students) {
            if (student.getStudentId() == id) {
                return student;
            }
        }
        return null;
    }

    public void removeById(int id) {
        //here should follow the logic: first to find the removedStudents by id; then remove the students.
        //if first employ for-each cycle(followed by get id ==id, removestudent), then there will be error happening, because of following reasongs:
        //for each cycle is operated based on iterator (it will change the list collection)
        Student removedStudent = findById(id);
        if (removedStudent != null) {
            students.remove(removedStudent);
            System.out.println("Student with ID " + id + " has been removed.");

        } else {
            System.out.println("Student with ID " + id + " not found.");
        }
    }
    public void addCourse(Course course){
        courses.add(course);
    }

    public List<Course> getCoursesOfStudent(int id){
        for(Student student: students){
            if(student.getStudentId() == id){
                return student.getCourseList();
            }
        }
        return new ArrayList<>();

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
    public void printAllCourses() {
        if (courses.isEmpty()) {
            System.out.println("This student doesn't attend any courses in the school");
        } else {
            System.out.println("List of all courses:");
            for (Course course : courses) {
                System.out.println(course);
            }
        }
    }
}
