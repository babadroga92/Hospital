package com.solvd.hospitalpatientrecoverymodel.humans;

import com.solvd.hospitalpatientrecoverymodel.exceptions.AddPatientException;
import com.solvd.hospitalpatientrecoverymodel.hospital.IPersonalInfo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Employee extends Person implements IPersonalInfo, IHospitalPatient {
    private String employeeID;
    private  Date dateOfHire;
    private int salary;
    private String title;

    private int maxNumberOfPatientPerEmployee;

    private String specialty;

    private String schedule;

    private String hoursPerWeek;
    private List<Patient> listOfPatients = new ArrayList<Patient>();

    public List<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(List<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public int getMaxNumberOfPatientPerEmployee() {
        return maxNumberOfPatientPerEmployee;
    }

    public void setMaxNumberOfPatientPerEmployee(int maxNumberOfPatientPerEmployee) {
        this.maxNumberOfPatientPerEmployee = maxNumberOfPatientPerEmployee;
    }

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public Date getDateOfHire() {
        return dateOfHire;
    }

    public void setDateOfHire(Date dateOfHire) {
        this.dateOfHire = dateOfHire;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
//       String info = super.toString();
        return "Employee{" +
                "employeeID='" + employeeID + '\'' +
                ", dateOfHire=" + dateOfHire +
                ", salary='" + salary + '\'' +
                ", title='" + title + '\'' +
                ", specialty='" + specialty + '\'' +
                ", hoursPerWeek='" + hoursPerWeek + '\'' +"}";
    }

    @Override
    public String getPersonalInfo() {
        return getFirstName() + " " + getGender() + " " + getDateOfBirth();
    }



    @Override
    public List<Patient> getPatientByBloodType(String bloodType)
    {
        List<Patient> bloodTypePatientList = new ArrayList<>();
        for(Patient patient: getListOfPatients()){
            if(patient.getBloodType().equals(bloodType)){
                bloodTypePatientList.add(patient);
            }
        }
        return bloodTypePatientList;
    }

    @Override
    public List<Patient> getPatientFromCity(String city) {
        List<Patient> patientFromCityList = new ArrayList<>();
        for(Patient patient: getListOfPatients()) {
            if(patient.getCity().equals(city)) {
                patientFromCityList.add(patient);
            }
        }
        return patientFromCityList;
    }



    @Override
    public List<Patient> removePatient(Patient patient) {
        listOfPatients.remove(patient);
        return listOfPatients;
    }
    @Override
    public List<Patient> addPatient(Patient patient) throws AddPatientException {
        if (getListOfPatients().contains(patient)) {
            throw new AddPatientException("Patient exist." + patient.getHealthCareIdentifier());
        } else {
            getListOfPatients().add(patient);
            return getListOfPatients();
        }
    }

}
