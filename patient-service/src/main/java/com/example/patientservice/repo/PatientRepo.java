package com.example.patientservice.repo;

import com.example.patientservice.entities.patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PatientRepo extends JpaRepository<patient,Integer> {
}
