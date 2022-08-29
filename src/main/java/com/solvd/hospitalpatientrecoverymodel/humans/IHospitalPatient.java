package com.solvd.hospitalpatientrecoverymodel.humans;
import java.util.List;
public interface IHospitalPatient extends IPatient{
    public List<Patient> getPatientByBloodType(String bloodType);
    public List<Patient> getPatientFromCity(String city);

}