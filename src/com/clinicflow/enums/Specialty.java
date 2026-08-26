package com.clinicflow.enums;

public enum Specialty {
    GENERAL_PRACTICE("General Practice"),
    CARDIOLOGY("Cardiology"),
    DERMATOLOGY("Dermatology"),
    PEDIATRICS("Pediatrics"),
    ORTHOPEDICS("Orthopedics"),
    PSYCHIATRY("Psychiatry");

    private final String displayName;

    Specialty(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName(){
        return this.displayName;
    }
}
