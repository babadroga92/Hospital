package com.solvd.hospitalpatientrecoverymodel.medicaldetails;

public enum ProcedureNames {
    CPT1("Carnitine palmitoyltransferase I"),
    CPT2("Carnitine palmitoyltransferase II"),
    CPT3("Carnitine palmitoyltransferase III"),
    CPT4("Carnitine palmitoyltransferase IV");

    private final String name;

    public String getName() {
        return name;
    }

    ProcedureNames(String name) {
        this.name = name;
    }
}