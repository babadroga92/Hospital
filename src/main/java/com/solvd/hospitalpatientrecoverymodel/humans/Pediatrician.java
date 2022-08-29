package com.solvd.hospitalpatientrecoverymodel.humans;



public class Pediatrician extends Employee {
    private String primaryCare;
    private String criticalCare;
    private String research;

    public String getPrimaryCare() {
        return primaryCare;
    }

    public void setPrimaryCare(String primaryCare) {
        this.primaryCare = primaryCare;
    }

    public String getCriticalCare() {
        return criticalCare;
    }

    public void setCriticalCare(String criticalCare) {
        this.criticalCare = criticalCare;
    }

    public String getResearch() {
        return research;
    }

    public void setResearch(String research) {
        this.research = research;
    }


    @Override
    public String toString() {
        return super.toString();
    }
}