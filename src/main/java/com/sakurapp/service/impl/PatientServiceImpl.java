package com.sakurapp.service.impl;

import com.sakurapp.model.Patient;
import com.sakurapp.repo.IPatientRepo;
import com.sakurapp.service.IPatientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@Service
@RequiredArgsConstructor
public class PatientServiceImpl implements IPatientService {


    private final IPatientRepo repo;

    @Override
    public Patient save(Patient patient) {

        return repo.save(patient);
    }

    @Override
    public Patient update(Integer id, Patient patient) {
        repo.findById(id).orElseThrow(() -> new RuntimeException("Paciente no encontrado"));
        patient.setIdPatient(id);
        return repo.save(patient);
    }

    @Override
    public List<Patient> findAll() {


        return repo.findAll();
    }

    @Override
    public Patient findById(Integer id) {

        return repo.findById(id).orElse(new Patient());
    }

    @Override
    public void delete(Integer id) {
         repo.deleteById(id);
    }
    @Override
    public List<Patient> findByAddress(String address) {
        // En producción aquí validarías que address no sea null/vacío
        return repo.findByAddressContainingIgnoreCase(address);
    }

    @Override
    public List<Patient> searchByName(String name) {
        return repo.searchByName(name);
    }
}
