package com.solvd.hospitalpatientrecoverymodel.exceptions;

public class CardNumberException extends Exception {
    private String msg;

    public CardNumberException(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
}
