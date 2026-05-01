package com.sakurapp.repo;


import com.sakurapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IPatientRepo extends JpaRepository<Patient, Integer> {
}
