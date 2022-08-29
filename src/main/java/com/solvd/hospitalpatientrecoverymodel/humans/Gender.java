package com.solvd.hospitalpatientrecoverymodel.humans;

public enum Gender {
    M("Male"),
    F("Female");
    private final String gender;

    public String getGender() {
        return gender;
    }

    Gender(String gender) {
        this.gender = gender;
    }
}
