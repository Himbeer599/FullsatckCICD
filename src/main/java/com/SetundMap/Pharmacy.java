package com.SetundMap;

import java.util.HashMap;
import java.util.Map;

public class Pharmacy {
    private Map<String, Medication> medications;
    //private Map<String,Medication> medications = new HashMap<String,Medication>();

    public Pharmacy() {
        this.medications = new HashMap<>();
    }

    public Pharmacy(Map<String, Medication> medications) {
        this.medications = medications;
    }

    public Map<String, Medication> getMedications() {
        return medications;
    }

    public void setMedications(Map<String, Medication> medications) {
        this.medications = medications;
    }

    public int getCount() {
        return medications.size();
    }

    public void saveMedication(Medication medication) {
        medications.put(medication.getName(), medication);
    }

    public Medication findMedication(String medicationName) {
        return medications.getOrDefault(medicationName.toLowerCase(), null);
    }

    public void deleteMedication(String medicationName) {
        medications.remove(medicationName.toLowerCase());
    }

    public void printAllMeds() {
        if (medications.isEmpty()) {
            System.out.println("No medications available in the pharmacy");
            return;
        }
        System.out.println("All the medications are listed as below:");
        for (Medication med : medications.values()) {
            System.out.println("Name: " + med.getName() +
                    "Price: " + med.getPrice() +
                    "Available: " + med.getAvailability());
        }
    }

}
