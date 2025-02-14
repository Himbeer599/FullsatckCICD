package com.lombok;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

    public double averageGardeOfUni(University university){
        double totalSum = 0;
        double totalStudents =0;
        //here should use Set to store students to avoide the repeation
        Set<Student> students = new HashSet<>();
        for(Course course: university.courses()){
            List<Student> students1 = course.getStudents();
            for(Student student:students1){
                //only process students when add student to set succeed(that means this student is not in the set)
                if(students.add(student)){
                    totalSum+=student.getGrade();
                    totalStudents++;
                }
            }
            if(totalStudents == 0){
                return 0;
            }
        }
        return totalSum/totalStudents;
    }

}
