package com.solvd.hospitalpatientrecoverymodel.hospital;


import com.solvd.hospitalpatientrecoverymodel.exceptions.AddPatientException;
import com.solvd.hospitalpatientrecoverymodel.humans.Employee;
import com.solvd.hospitalpatientrecoverymodel.humans.IHospitalPatient;
import com.solvd.hospitalpatientrecoverymodel.humans.Patient;


import java.util.ArrayList;
import java.util.List;

public class Hospital extends Address implements IHospitalPatient {
    private String name;

    private String workingHours;

    private String phoneNumber;
    private int established;
    private int capacity;

    private String schedule;
    private List<Patient> listOfPatients = new ArrayList<Patient>();
    private ArrayList<Employee> employees;

    public Hospital(String city, String state, String address, int zipCode, String phoneNumber, int established, int capacity) {
        this.setCity(city);
        this.setState(state);
        this.setAddress(address);
        this.setZipCode(zipCode);
        this.phoneNumber = phoneNumber;
        this.established = established;
        this.capacity = capacity;
        employees = new ArrayList<>();
    }
    public List<Patient> getListOfPatients() {
        return listOfPatients;
    }

    public void setListOfPatients(List<Patient> listOfPatients) {
        this.listOfPatients = listOfPatients;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }



    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getEstablished() {
        return established;
    }

    public void setEstablished(int established) {
        this.established = established;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Hospital{" +
                "name='" + name + '\'' +
                ", city='" + super.getCity() + '\'' +
                ", state='" + super.getState() + '\'' +
                ", address='" + super.getAddress() + '\'' +
                ", zipCode=" + super.getZipCode() +
                ", phoneNumber=" + phoneNumber +
                ", established=" + established +
                ", capacity=" + capacity +
                '}';
    }
    @Override
    public List<Patient> getPatientByBloodType(String bloodType) {
        List<Patient> bloodTypePatientList = new ArrayList<>();
        for(Patient patient: getListOfPatients()) {
            if(patient.getBloodType().equals(bloodType)) {
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
    public List<Patient> addPatient(Patient patient) throws AddPatientException {
        if (listOfPatients.contains(patient)) {
            throw new AddPatientException("Patient exist." + patient.getHealthCareIdentifier());
        } else {
            listOfPatients.add(patient);
            return listOfPatients;
        }
    }
    @Override
    public List<Patient> removePatient(Patient patient) {
        listOfPatients.remove(patient);
        return listOfPatients;
    }

}
