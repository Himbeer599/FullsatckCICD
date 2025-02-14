package com.lombok;

import lombok.*;

import java.util.List;

//@Data
//@NoArgsConstructor
//@AllArgsConstructor
//@Builder
@Value
public class Course {
    String id;
    String name;
    String teacher;
//    String student;
    List students;
//    List<String> studentsName;
//    double grade;
}
