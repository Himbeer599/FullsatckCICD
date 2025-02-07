package com.SetundMap;


import java.util.HashMap;
import java.util.Map;

public class School {
    private Map<String, Student> studentList = new HashMap<String, Student>();

    public School() {
    }

    public School(Map<String, Student> studentList) {
        this.studentList = studentList;
    }

    public void addStudent(Student student) {
        studentList.put(student.getStudentId(), student);
    }
//    public void addStudent(Student student) {
//        students.add(student);
//    }

    public Student findById(String id) {
        return studentList.getOrDefault(id, null);
    }

    //    public Student findById(int id) {
//        for (Student student : students) {
//            if (student.getStudentId() == id) {
//                return student;
//            }
//        }
//        return null;
//    }
    public void removeById(String id) {
        studentList.remove(id);
    }
    public void printAllStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students in the school");
        } else {
            System.out.println("List of all students:");
            for (Student student : studentList.values()) {
                System.out.println(student);
            }
        }
    }

}
