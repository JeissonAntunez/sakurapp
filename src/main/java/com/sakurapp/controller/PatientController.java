package com.sakurapp.controller;

import com.sakurapp.model.Patient;
import com.sakurapp.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
