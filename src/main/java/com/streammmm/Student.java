package com.streammmm;
import java.util.Objects;

public class Student {
    private int id;
    private String name;
    private int postCode;
    private int age;

    public Student(int id, String name, int postCode, int age) {
        this.id = id;
        this.name = name;
        this.postCode = postCode;
        this.age = age;
    }

    public static Student fromCsv(String line){
        String[] parts = line.split(",");
        if(parts.length<3) return null;
        int id = Integer.parseInt((parts[0].trim()));
        String name =parts[1].trim();
        int postCode = Integer.parseInt(parts[2].trim());
        int age = Integer.parseInt(parts[3].trim());
        return new Student(id,name,postCode,age);
    }
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id && postCode == student.postCode && age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, postCode, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", postCode=" + postCode +
                ", age=" + age +
                '}';
    }
}
