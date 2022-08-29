package com.solvd.hospitalpatientrecoverymodel.medicaldetails;

import com.solvd.hospitalpatientrecoverymodel.humans.Nurse;

import java.util.HashMap;

public class MedicineType {
    private MedicineList medicineType;
    private String doseQuantity;
    private String howOften;

    private Nurse whoRN;




    public MedicineType(MedicineList medicineType, String doseQuantity, String howOften, Nurse whoRN) {
        this.medicineType = medicineType;
        this.doseQuantity = doseQuantity;
        this.howOften = howOften;
        this.whoRN = whoRN;
    }

    public String getDoseQuantity() {
        return doseQuantity;
    }

    public void setDoseQuantity(String doseQuantity) {
        this.doseQuantity = doseQuantity;
    }

    public MedicineList getMedicineType() {
        return medicineType;
    }

    public void setMedicineType(MedicineList medicineType) {
        this.medicineType = medicineType;
    }

    public String getHowOften() {
        return howOften;
    }

    public void setHowOften(String howOften) {
        this.howOften = howOften;
    }
    @Override
    public boolean equals(Object medicine) {
        if(!(medicine instanceof MedicineType) ){
            return false;
        }
        MedicineType medicineType = (MedicineType) medicine;
        if(getMedicineType() == medicineType.getMedicineType()){
            return true;
        }
        return false;

    }
    @Override
    public String toString() {
        return "Medicine{" +
                "medicine=" + medicineType +
                ", doseQuantity='" + doseQuantity + '\'' +
                ", howOften='" + howOften + '\'' +
                ", nurse=" + whoRN +
                '}';
    }

}
