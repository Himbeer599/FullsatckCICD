package com.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Course {
    String id;
    String name;
    String teacher;
    String student;
    List students;
    List<String> studentsName;
}
