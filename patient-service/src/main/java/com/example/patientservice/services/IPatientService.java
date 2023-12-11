package com.example.patientservice.services;

import com.example.patientservice.entities.patient;

import java.util.List;

public interface IPatientService {

    public patient createpatient(patient a);
    public patient findpatientById(int id);
    public List<patient> findAllpatients() ;

    public patient updatepatient(patient a);
    public void deletepatient(int id);

}
