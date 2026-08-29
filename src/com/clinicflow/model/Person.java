package com.clinicflow.model;

import com.clinicflow.enums.Gender;
import com.clinicflow.exception.InvalidPersonDataException;

import java.time.LocalDate;
import java.time.Period;
import java.util.regex.Pattern;


public abstract class Person {

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$");

    private final String id;
    private String fullName;
    private String cpf;
    private String email;
    private String phone;
    private LocalDate birthDate;
    private Gender gender;

    protected Person(String id, String fullName, String cpf, String email, String phone, LocalDate birthDate, Gender gender) {

        this.id = id;
        setFullName(fullName);
        setCpf(cpf);
        setEmail(email);
        this.phone = phone;
        setBirthDate(birthDate);
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        if (fullName == null || fullName.trim().isBlank()) {
            throw new InvalidPersonDataException("Full name cannot be null or empty.");
        }
        this.fullName = fullName;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf == null || !cpf.matches("\\d{11}")) {
            throw new InvalidPersonDataException("CPF must contain exactly 11 digits.");
        }
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !EMAIL_PATTERN.matcher(email).matches()) {
            throw new InvalidPersonDataException("Invalid email format: " + email);
        }
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        if (birthDate == null || birthDate.isAfter(LocalDate.now())) {
            throw new InvalidPersonDataException("Birth date cannot be null or in the future.");
        }
        this.birthDate = birthDate;
    }

    public int getAge() {
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public abstract String getSummary();

    public abstract String getRole();

}