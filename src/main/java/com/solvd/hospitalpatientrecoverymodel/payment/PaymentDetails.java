package com.solvd.hospitalpatientrecoverymodel.payment;

import com.solvd.hospitalpatientrecoverymodel.medicaldetails.ProcedureNames;

import java.util.Date;

public class PaymentDetails implements IBankCardInfo {
    private PaymentType paymentType;

    private Date date;
    private ProcedureNames code;
    private String billNo;
    private float insCost;
    private float patientCost;
    private String claimDetails;
    private float actualCost;
    private String cardNumber;
    private String dateOfExp;
    private String pinCode;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentDetails(String name, PaymentType type, Date date, ProcedureNames code, String billNo, float actualCost) {
        this.name = name;
        this.paymentType = type;
        this.date = date;
        this.code = code;
        this.billNo = billNo;
        this.actualCost = actualCost;
    }

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getDateOfExp() {
        return dateOfExp;
    }

    public void setDateOfExp(String dateOfExp) {
        this.dateOfExp = dateOfExp;
    }

    public String getPinCode() {
        return pinCode;
    }

    public void setPinCode(String pinCode) {
        this.pinCode = pinCode;
    }



    public PaymentDetails() {

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ProcedureNames getCode() {
        return code;
    }

    public void setCode(ProcedureNames code) {
        this.code = code;
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public float getInsCost() {
        return insCost;
    }

    public void setInsCost(float insCost) {
        this.insCost = insCost;
    }



    public float getPatientCost() {
        return patientCost;
    }

    public void setPatientCost(float patientCost) {
        this.patientCost = patientCost;
    }

    public String getClaimDetails() {
        return claimDetails;
    }

    public void setClaimDetails(String claimDetails) {
        this.claimDetails = claimDetails;
    }

    public float getActualCost() {
        return actualCost;
    }

    public void setActualCost(float actualCost) {
        this.actualCost = actualCost;
    }

    @Override
    public String toString() {
        return "PaymentDetails{" +
                "paymentType=" + paymentType +
                ", date=" + date +
                ", code=" + code +
                ", billNo='" + billNo + '\'' +
                ", insCost=" + insCost +
                ", patientCost=" + patientCost +
                ", claimDetails='" + claimDetails + '\'' +
                ", actualCost=" + actualCost +
                '}';
    }


    @Override
    public String getCardInfo() {
        return cardNumber + " " +  dateOfExp + " " + pinCode;
    }
}
