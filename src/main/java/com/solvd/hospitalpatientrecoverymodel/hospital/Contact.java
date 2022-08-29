package com.solvd.hospitalpatientrecoverymodel.hospital;

public class Contact implements IContactInfo{
    private String contactHome;
    private String contactOffice;
    private String email;
    private String contactPhone;
    private String contactEmergency;
    private String contactDetails;

    public Contact(String contactHome, String contactOffice, String email, String contactPhone, String contactEmergency, String contactDetails) {
        this.contactHome = contactHome;
        this.contactOffice = contactOffice;
        this.email = email;
        this.contactPhone = contactPhone;
        this.contactEmergency = contactEmergency;
        this.contactDetails = contactDetails;
    }

    public String getContactHome() {
        return contactHome;
    }

    public void setContactHome(String contactHome) {
        this.contactHome = contactHome;
    }

    public String getContactOffice() {
        return contactOffice;
    }

    public void setContactOffice(String contactOffice) {
        this.contactOffice = contactOffice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContactPhone() {
        return contactPhone;
    }

    public void setContactPhone(String contactPhone) {
        this.contactPhone = contactPhone;
    }

    public String getContactEmergency() {
        return contactEmergency;
    }

    public void setContactEmergency(String contactEmergency) {
        this.contactEmergency = contactEmergency;
    }

    public String getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(String contactDetails) {
        this.contactDetails = contactDetails;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "contactHome=" + contactHome +
                ", contactOffice=" + contactOffice +
                ", email='" + email + '\'' +
                ", contactPhone=" + contactPhone +
                ", contactEmergency='" + contactEmergency + '\'' +
                ", contactDetails='" + contactDetails + '\'' +
                '}';
    }

    @Override
    public String getContactInfo() {
        return    contactHome + " " + contactOffice + " " + email  + " " + contactPhone + " " + contactEmergency + " " + contactDetails;
    }
}
