package com.solvd.hospitalpatientrecoverymodel.humans;
import com.solvd.hospitalpatientrecoverymodel.exceptions.AddPatientException;

import java.util.List;

public interface IPatient {
    public List<Patient> addPatient(Patient patient) throws AddPatientException;
    public List<Patient> removePatient(Patient patient);
}
