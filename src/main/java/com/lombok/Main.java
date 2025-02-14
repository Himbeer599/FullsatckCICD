package com.lombok;

public class Main {
    public static void main(String[] args) {
        Student student1 =Student.builder()
                .id("1")
                .address("Hamburg")
                .name("Hile")
                .gender("Female")
                .build();
        Student student2 =Student.builder()
                .id("2")
                .address("Berlin")
                .name("Mike")
                .gender("Male")
                .build();
        Student student3 =Student.builder()
                .id("3")
                .address("NY")
                .name("Alicia")
                .gender("Female")
                .build();
        Teacher teacher1 = new Teacher("1","Jane","Math");
        Teacher teacher2 = new Teacher("2","Diane","History");
        Teacher teacher3 = new Teacher("3","Sofie","English");
        Course course1 = Course.builder()
                .teacher(teacher1.name())
                .students(student1.getName())
                .id("1")
                .name("Math")
                .build();
        Course course2 = Course.builder()
                .teacher(teacher2.name())
                .students(student2.getName())
                .id("2")
                .name("History")
                .build();
        Course course3 = Course.builder()
                .teacher(teacher3.name())
                .students(student3.getName())
                .id("3")
                .name("English")
                .build();
        System.out.println(course1);
        System.out.println(course2);
        System.out.println(course3);
    }
}
