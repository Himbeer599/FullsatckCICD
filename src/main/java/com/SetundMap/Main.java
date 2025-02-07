package com.SetundMap;

import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Pharmacy pharmacy = new Pharmacy();
        pharmacy.saveMedication(new Medication("ASpilin",20,true));
        pharmacy.saveMedication(new Medication("Spilin",10,true));
        pharmacy.saveMedication(new Medication("Saube",9.99,true));
        pharmacy.saveMedication(new Medication("Silee",7.69,false));
        String medName = "Silin";
        Medication foundMedication = pharmacy.findMedication(medName);
        System.out.println("found medication"+foundMedication);
        pharmacy.printAllMeds();
    }
}
