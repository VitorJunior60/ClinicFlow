package com.clinicflow.model;

import com.clinicflow.enums.Gender;
import com.clinicflow.enums.Specialty;
import com.clinicflow.exception.InvalidPersonDataException;

import java.time.LocalDate;

public class Doctor extends Person {

    private String licenseNumber;
    private Specialty specialty;
    private double consultationFee;

    public Doctor(String id, String fullName, String cpf, String email,
                  String phone, LocalDate birthDate, Gender gender,
                  String licenseNumber, Specialty specialty, double consultationFee) {

        super(id, fullName, cpf, email, phone, birthDate, gender);
        setLicenseNumber(licenseNumber);
        this.specialty = specialty;
        setConsultationFee(consultationFee);
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        if (licenseNumber == null || licenseNumber.isBlank()) {
            throw new InvalidPersonDataException("License number (CRM) cannot be empty");
        }
        this.licenseNumber = licenseNumber;
    }

    public Specialty getSpecialty() {
        return specialty;
    }

    public void setSpecialty(Specialty specialty) {
        this.specialty = specialty;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) {
        if (consultationFee < 0) {
            throw new InvalidPersonDataException("Consultation fee cannot be negative");
        }
        this.consultationFee = consultationFee;
    }

    @Override
    public String getSummary() {
        return String.format("Dr. %s | %s | License: %s | Fee: $%.2f",
                getFullName(), specialty.getDisplayName(), licenseNumber, consultationFee);
    }

    @Override
    public String getRole() {
        return "DOCTOR";
    }
}