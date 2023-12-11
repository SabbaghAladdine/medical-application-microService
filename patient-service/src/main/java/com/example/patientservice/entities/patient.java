package com.example.patientservice.entities;

import com.example.patientservice.model.Doctor;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class patient {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    String nom;
    String prénom;
    String ville;
    int telephone;
    @Transient
    Doctor doctor;
    private int doctorId;

}
