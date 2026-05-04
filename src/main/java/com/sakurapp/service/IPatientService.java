package com.sakurapp.service;

import com.sakurapp.model.Patient;

import java.util.List;

public interface IPatientService {

    Patient save(Patient patient);

    Patient update(Integer id, Patient patient);

    List<Patient> findAll();

    Patient findById(Integer id);


    void delete(Integer id);

    // Nuevos métodos de búsqueda
    List<Patient> findByAddress(String address);
    List<Patient> searchByName(String name);
}
