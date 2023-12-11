package com.example.medicalservice.Controllers;


import com.example.medicalservice.entities.doctor;
import com.example.medicalservice.services.IDoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class doctorController {

    @Autowired
    IDoctorService ds;

    @GetMapping("/find/{id}")
    public ResponseEntity<doctor> findDoctor(@PathVariable("id") int id){
        doctor d = ds.finddoctorById(id);
        if (d==null){
            return ResponseEntity.notFound().build();
        }else {
            return ResponseEntity.ok(d);
        }
    }

    @PostMapping("/add")
    public ResponseEntity<doctor>addDoctor(@RequestBody doctor d){
        doctor dr = ds.createdoctor(d);
        return ResponseEntity.ok(dr);
    }

    @PutMapping("/update")
    public ResponseEntity<doctor>updateDoctor(@RequestBody doctor d){
        doctor dr = ds.updatedoctor(d);
        return ResponseEntity.ok(dr);
    }

    @DeleteMapping("/delete/{id}")
    public void  deleteDoctor(@PathVariable("id") int id){
        ds.deletedoctor(id);
    }

    @GetMapping("/all/speciality/{string}")
    public ResponseEntity<List<doctor>> findAllBySpeciality(@PathVariable("string") String s){
        return ResponseEntity.ok(ds.findAllBySpeciality(s));
    }

    @GetMapping("/all")
    public ResponseEntity<List<doctor>> findAll(){
        return ResponseEntity.ok(ds.findAlldoctors());
    }

}
