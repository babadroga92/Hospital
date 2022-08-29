package com.solvd.hospitalpatientrecoverymodel.humans;

public class EmergencyPhysician extends Employee {
    private boolean strokeSymptoms;
    private boolean heavyBleeding;
    private boolean headNeackSpineInjuries;

    public boolean isStrokeSymptoms() {
        return strokeSymptoms;
    }

    public void setStrokeSymptoms(boolean strokeSymptoms) {
        this.strokeSymptoms = strokeSymptoms;
    }

    public boolean isHeavyBleeding() {
        return heavyBleeding;
    }

    public void setHeavyBleeding(boolean heavyBleeding) {
        this.heavyBleeding = heavyBleeding;
    }

    public boolean isHeadNeackSpineInjuries() {
        return headNeackSpineInjuries;
    }

    public void setHeadNeackSpineInjuries(boolean headNeackSpineInjuries) {
        this.headNeackSpineInjuries = headNeackSpineInjuries;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
