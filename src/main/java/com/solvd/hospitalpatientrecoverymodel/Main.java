package com.solvd.hospitalpatientrecoverymodel;
import com.solvd.hospitalpatientrecoverymodel.app.ApplicationPatient;
import com.solvd.hospitalpatientrecoverymodel.hospital.Hospital;
import com.solvd.hospitalpatientrecoverymodel.humans.Nurse;
import com.solvd.hospitalpatientrecoverymodel.humans.Patient;
import com.solvd.hospitalpatientrecoverymodel.payment.PaymentDetails;
import com.solvd.hospitalpatientrecoverymodel.string.StringTest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static com.solvd.hospitalpatientrecoverymodel.string.StringTest.metoda;


public class Main {
    private static Logger log = LogManager.getLogger(ApplicationPatient.class.getName());

    public static void main(String[] args) throws Exception {
        ApplicationPatient applicationPatient = new ApplicationPatient();
        Patient patient = applicationPatient.createPatient("Ivan", "Ivanovic", "1242147", "A", "New York");
        Patient patient1 = applicationPatient.createPatient("Ivana", "Nikic", "1242147", "B", "Paris");
        List<Patient> patientList = new ArrayList<>();
        patientList.add(patient);
        patientList.add(patient1);
        Nurse nurse = applicationPatient.createNurse("Nina", "Bozic", patientList);
        Hospital hospital = applicationPatient.createHospital("Virginia Beach", "VA", "1409 Grassmere ct", 23451, "3123", 12, 12, patientList);
        System.out.println(hospital);
        List<Patient> listaPacijenataPoKrvnojGrupi = hospital.getPatientByBloodType("A");
        List<Patient> patientFromCityList = nurse.getPatientFromCity("New York");


        Patient patient3 = applicationPatient.getPatientbyID(8, nurse);

        PaymentDetails paymentDetails = applicationPatient.createPaymentDetails("American Express", "121", "12/02/22", "1234");
        PaymentDetails paymentDetails1 = applicationPatient.createPaymentDetails("Visa", "12133233333333333", "12/02/22", "1234");
        Patient patient4 = applicationPatient.createPatient("Petar", "Nikic", "1242147", "B", "Paris");
        applicationPatient.addPatientToHospital(patient4, hospital);
        Patient pacijent2 = applicationPatient.updatePatient("abdef", 2, hospital);

        HashMap<String, String> dozaLekova = new HashMap<String, String>();
        dozaLekova.put("Bromazepan", "3 puta dnevno");
        dozaLekova.put("ibuprofen", "2 puta dnevno");
        dozaLekova.put("aspirin", "1 dnevno");
        dozaLekova.remove("Bromazepan");
        Patient patient5 = applicationPatient.createPatient("Nemanja", "Milanovic", "21121", "a", "novi sad");
        patient5.setCity("Novi Sad");
        patient5.setAddress("Oto");
        System.out.println(patient5);
        try {
            metoda();
        } catch (Exception exception) {
            log.error("Error");
        }
    }
}