package com.sakurapp.service.impl;

import com.sakurapp.model.Patient;
import com.sakurapp.repo.IPatientRepo;
import com.sakurapp.service.IPatientService;

import java.util.List;

public class PatientServiceImpl implements IPatientService {



    @Override
    public Patient save(Patient patient) {
        return null;
    }

    @Override
    public Patient update(Integer id, Patient patient) {
        return null;
    }

    @Override
    public List<Patient> findAll() {
        return List.of();
    }

    @Override
    public Patient findById(Integer id) {
        return null;
    }

    @Override
    public void delete(Integer id) {

    }
}
