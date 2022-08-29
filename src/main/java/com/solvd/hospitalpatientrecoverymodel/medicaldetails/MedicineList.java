package com.solvd.hospitalpatientrecoverymodel.medicaldetails;


public enum MedicineList {
    WARFARIN("medicine to help prevent blood clots - NHS"),
    RIVAROXABAN("Nesto cemo napisati2"),
    DABIGATRAN("Nesto cemo napisati3"),
    APIXABAN("Nesto cemo napisati4"),
    EDOXABAN("Nesto cemo napisati5");

    private final String medName;

    public String getMedName() {
        return medName;
    }

    MedicineList(String medName) {
        this.medName = medName;
    }
}