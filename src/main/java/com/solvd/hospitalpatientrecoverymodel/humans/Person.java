package com.solvd.hospitalpatientrecoverymodel.humans;


import com.solvd.hospitalpatientrecoverymodel.hospital.Address;
import com.solvd.hospitalpatientrecoverymodel.hospital.Contact;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Person extends Address {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;
    private Gender gender;


    List<Contact> contacts = new ArrayList<Contact>();

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }


    @Override
    public String toString() {
        return "Person{" +
                super.toString() +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", gender='" + gender.getGender() + '\'' +
                ", contacts=" + contacts +

                '}';
    }

}
