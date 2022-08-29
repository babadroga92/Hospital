package com.solvd.hospitalpatientrecoverymodel.medicaldetails;

import com.solvd.hospitalpatientrecoverymodel.humans.Pediatrician;

import java.util.Date;
public class MedicalHistory  {
    private MedicalHistoryType medicalHistory;
    private Date date;
    private String details;
    private String condition;

    private Pediatrician pediatrician;


    @Override
    public String toString() {
        return "MedicalHistory{" +
                "medicalHistory=" + medicalHistory +
                ", date=" + date +
                ", details='" + details + '\'' +
                ", condition='" + condition + '\'' +
                ", pediatrician=" + pediatrician +
                '}';
    }

    public MedicalHistory(MedicalHistoryType medicalHistory, Date date, String details, String condition, Pediatrician pediatrician) {
        this.medicalHistory = medicalHistory;
        this.date = date;
        this.details = details;
        this.condition = condition;
        this.pediatrician = pediatrician;
    }


    public MedicalHistoryType getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(MedicalHistoryType medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

}
