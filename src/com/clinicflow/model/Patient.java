package com.clinicflow.model;

import com.clinicflow.enums.Gender;
import com.clinicflow.exception.InvalidPersonDataException;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Patient extends Person {

    private String bloodType;
    private final List<String> allergies;
    private String insuranceProvider;

    public Patient(String id, String fullName, String cpf, String email,
                   String phone, LocalDate birthDate, Gender gender,
                   String bloodType, String insuranceProvider) {

        super(id, fullName, cpf, email, phone, birthDate, gender);
        this.bloodType = bloodType;
        this.insuranceProvider = insuranceProvider;
        this.allergies = new ArrayList<>();
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getInsuranceProvider() {
        return insuranceProvider;
    }

    public void setInsuranceProvider(String insuranceProvider) {
        this.insuranceProvider = insuranceProvider;
    }

    public List<String> getAllergies() {
        return new ArrayList<>(allergies);
    }

    public void addAllergy(String allergy) {
        if (allergy == null || allergy.isBlank()) {
            throw new InvalidPersonDataException("Allergy description cannot be empty");
        }
        allergies.add(allergy);
    }

    @Override
    public String getSummary() {
        return String.format("Patient: %s | Age: %d | Blood type: %s | Insurance: %s",
                getFullName(), getAge(), bloodType, insuranceProvider);
    }

    @Override
    public String getRole() {
        return "PATIENT";
    }
}