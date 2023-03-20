package com.example.hospital.management;

public class Patient {

    private int patient_id;
    private String name;
    private String disease;
    private int age;

    public Patient(int patient_id, String name, String disease, int age) {
        this.patient_id = patient_id;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public int getPatient_id() {
        return patient_id;
    }

    public void setPatient_id(int patient_id) {
        patient_id = patient_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

