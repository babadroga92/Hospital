package com.solvd.hospitalpatientrecoverymodel.humans;


public class Nurse extends Employee {

    @Override
    public String toString() {
        return "Nurse{" +
                "employeeID='" + getEmployeeID() + '\'' +
                ", dateOfHire=" + getDateOfHire() +
                ", title='" + getTitle() + '\'' +
                ", specialty='" + getSpecialty() + '\'' +
                ", firstName='" + getFirstName() + '\'' +
                ", lastName='" + getLastName() + '\'' +
                "}";
    }
}
