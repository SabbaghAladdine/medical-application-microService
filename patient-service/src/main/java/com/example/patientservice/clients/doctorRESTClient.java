package com.example.patientservice.clients;

import com.example.patientservice.model.Doctor;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "MEDICAL-SERVICE")
public interface doctorRESTClient {
    @GetMapping("/doctor/find/{id}")
    Doctor findById(@PathVariable int id);
}
