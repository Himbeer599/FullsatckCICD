package com.SetundMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedication(new Medication("ASpilin", 20, true));
        pharmacy.saveMedication(new Medication("Spilin", 10, true));
        pharmacy.saveMedication(new Medication("Saube", 9.99, true));
        pharmacy.saveMedication(new Medication("Silee", 7.69, false));
        String medName = "Silin";
        Medication foundMedication = pharmacy.findMedication(medName);
        System.out.println("found medication" + foundMedication);
        pharmacy.printAllMeds();

        System.out.println("--- School/Student ---");
        Map<String, Student> students = new HashMap<String, Student>();
        students.put("1", new Student("Joy", "Pilson", "1"));

        School school = new School();
        school.addStudent(new Student("Joy", "Pilson", "1"));
        school.addStudent(new Student("Kevin", "Lovn", "2"));
        Student s = school.findById("1");
        System.out.println("found students: " + s);
        school.printAllStudents();

    }

}
