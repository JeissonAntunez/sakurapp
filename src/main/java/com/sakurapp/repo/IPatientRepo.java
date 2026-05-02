package com.sakurapp.repo;


import com.sakurapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPatientRepo extends JpaRepository<Patient, Integer> {



    // Patient save(Patient patient)
}
