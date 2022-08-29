package com.solvd.hospitalpatientrecoverymodel.exceptions;

public class AddPatientException extends Exception{
    private String msg;

    public AddPatientException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
