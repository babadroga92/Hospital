package com.solvd.hospitalpatientrecoverymodel.humans;

import com.solvd.hospitalpatientrecoverymodel.humans.Employee;

public class FamilyPhysician extends Employee {
    private String healthRiskAssessment;
    private String screeningTest;
    private String immunizations;

    public String getHealthRiskAssessment() {
        return healthRiskAssessment;
    }

    public void setHealthRiskAssessment(String healthRiskAssessment) {
        this.healthRiskAssessment = healthRiskAssessment;
    }

    public String getScreeningTest() {
        return screeningTest;
    }

    public void setScreeningTest(String screeningTest) {
        this.screeningTest = screeningTest;
    }

    public String getImmunizations() {
        return immunizations;
    }

    public void setImmunizations(String immunizations) {
        this.immunizations = immunizations;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
