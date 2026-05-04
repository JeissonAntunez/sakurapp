package com.sakurapp.controller;

import com.sakurapp.model.Patient;
import com.sakurapp.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class PatientController {

    private final IPatientService service;

    @GetMapping
    public List<Patient> findAll(){
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Patient findById(@PathVariable("id") Integer id){
        return service.findById(id);
    }


    @PostMapping
    public Patient save(@RequestBody  Patient patient){
        return service.save(patient);
    }

    // Filtrar por address: GET /patients/address?value=Lima
    @GetMapping("/address")
    public List<Patient> findByAddress(@RequestParam("value") String address) {
        return service.findByAddress(address);
    }

    // Buscar por nombre: GET /patients/search?name=Luis
    @GetMapping("/search")
    public List<Patient> searchByName(@RequestParam("name") String name) {
        return service.searchByName(name);
    }
}
