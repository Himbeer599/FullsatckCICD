package com.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UniversityService {
    List<Course> courses = new ArrayList<>();
    public double averageGrade(Course course){
        double sum = 0;
        List<Student> students = course.getStudents();
        if(students.isEmpty()){
            return 0;
        }
        for(Student student:students){
            sum+=student.getGrade();
        }
        return sum/students.size();
    }
}
