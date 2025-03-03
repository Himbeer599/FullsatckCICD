package com.lombok;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        List<Student> students2 = new ArrayList<>();
        Student student1 =Student.builder()
                .id("1")
                .address("Hamburg")
                .name("Hile")
                .gender("Female")
                .grade(80.6)
                .build();
        Student student2 =Student.builder()
                .id("2")
                .address("Berlin")
                .name("Mike")
                .gender("Male")
                .grade(90.2)
                .build();
        Student student3 =Student.builder()
                .id("3")
                .address("NY")
                .name("Alicia")
                .gender("Female")
                .grade(60.7)
                .build();
        Student student4 =Student.builder()
                .id("3")
                .address("NY")
                .name("Max")
                .gender("male")
                .grade(78.5)
                .build();
        Student student5 =Student.builder()
                .id("3")
                .address("NY")
                .name("Alex")
                .gender("Female")
                .grade(88.0)
                .build();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(students);
//        students2.add(student1);
//        students2.add(student2);
        students2.add(student4);
        students2.add(student5);

        Teacher teacher1 = new Teacher("1","Jane","Math");
        Teacher teacher2 = teacher1.withSubject("History");
        Teacher teacher3 = teacher1.withId("2").withName("Alicia").withSubject("English");
//        University university = new University()
        UniversityService universityService = new UniversityService();
        List<Course> courses = new ArrayList<>();

        Course course1 = new Course("1",teacher1.subject(),teacher1.name(),students);
        Course course2 = new Course("2",teacher2.subject(),teacher2.name(),students2);
        courses.add(course1);
        courses.add(course2);
        double average1 = universityService.averageGrade(course1);
        System.out.println(average1);
        System.out.println(universityService.averageGrade(course2));
        University university = new University("1","High School",courses);
        double d2 = universityService.averageGardeOfUni(university);
        System.out.println("The average grade of university: " +d2);


//        Teacher teacher2 = new Teacher("2","Diane","History");
//        Teacher teacher3 = new Teacher("3","Sofie","English");
//        Course course1 = Course.builder()
//                .teacher(teacher1.name())
//                .student(student1.getName())
//                .id("1")
//                .name(teacher1.subject())
//                .build();
//        Course course2 = Course.builder()
//                .teacher(teacher2.name())
//                .student(student2.getName())
//                .id("2")
//                .name(teacher2.subject())
//                .build();
//        Course course3 = Course.builder()
//                .teacher(teacher3.name())
//                .student(student3.getName())
//                .id("3")
//                .name(teacher3.subject())
//                .build();
//        System.out.println(course1);
//        System.out.println(course2);
//        System.out.println(course3);
//
//        Course course01 = Course.builder()
//                .teacher(teacher1.name())
//                .students(students)
//                .id("1")
//                .name(teacher1.subject())
//                .build();
//        System.out.println(course01);
//
//        //only print the name of students
//        List<String> studentsName = students.stream()
//                .map(Student::getName)
//                .toList();
//        Course course001 = Course.builder()
//                .teacher(teacher1.name())
//                .studentsName(studentsName)
//                .id("1")
//                .name(teacher1.subject())
//                .build();
//        System.out.println(course01);
    }
}
