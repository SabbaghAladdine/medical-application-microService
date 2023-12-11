package com.example.medicalservice.services;

import com.example.medicalservice.entities.doctor;

import java.util.List;

public interface IDoctorService {

    public doctor createdoctor(doctor a);
    public doctor finddoctorById(int id);
    public List<doctor> findAlldoctors() ;

    public doctor updatedoctor(doctor a);
    public void deletedoctor(int id);
    public List<doctor> findAllBySpeciality(String s);

}
