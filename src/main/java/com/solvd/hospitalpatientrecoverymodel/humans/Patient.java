package com.solvd.hospitalpatientrecoverymodel.humans;
import com.solvd.hospitalpatientrecoverymodel.hospital.Contact;
import com.solvd.hospitalpatientrecoverymodel.hospital.IPersonalInfo;
import com.solvd.hospitalpatientrecoverymodel.medicaldetails.MedicalHistory;
import com.solvd.hospitalpatientrecoverymodel.medicaldetails.MedicineType;
import com.solvd.hospitalpatientrecoverymodel.medicaldetails.Procedure;
import com.solvd.hospitalpatientrecoverymodel.payment.PaymentDetails;
import java.util.List;

public class Patient extends Person implements IPersonalInfo {
    private String healthCareIdentifier;
    private String otherDetails;
    private Contact emergencyContact;
    private String bloodType;

    private List<MedicineType> medicineList;

    private List<Procedure> proceduresList;

    private List<PaymentDetails> paymentDetails;

    private List<MedicalHistory> medicalHistory;

    public List<MedicineType> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(List<MedicineType> medicineList) {
        this.medicineList = medicineList;
    }

    public List<MedicalHistory> getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(List<MedicalHistory> medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setHealthCareIdentifier(String healthCareIdentifier) {
        this.healthCareIdentifier = healthCareIdentifier;
    }

    public String getHealthCareIdentifier() {
        return healthCareIdentifier;
    }


    public String getOtherDetails() {
        return otherDetails;
    }

    public void setOtherDetails(String otherDetails) {
        this.otherDetails = otherDetails;
    }

    public Contact getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(Contact emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public List<Procedure> getProceduresList() {
        return proceduresList;
    }


    public void setProceduresList(List<Procedure> proceduresList) {
        this.proceduresList = proceduresList;
    }

    public List<PaymentDetails> getPaymentDetails() {
        return paymentDetails;
    }

    public void setPaymentDetails(List<PaymentDetails> paymentDetails) {
        this.paymentDetails = paymentDetails;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "healthCareIdentifier='" + healthCareIdentifier + '\'' +
                ", otherDetails='" + otherDetails + '\'' +
                ", emergencyContact=" + emergencyContact +
                ", bloodType='" + bloodType + '\'' +
                ", medicineList=" + medicineList +
                ", proceduresList=" + proceduresList +
                ", paymentDetails=" + paymentDetails +
                ", medicalHistory=" + medicalHistory +
                ", contacts=" + contacts +
                '}';
    }

    @Override
    public String getPersonalInfo() {
        return getFirstName() + " " + getLastName() +" " + getGender() + " " + getDateOfBirth();
    }
}

