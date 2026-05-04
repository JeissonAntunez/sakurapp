package com.sakurapp.repo;


import com.sakurapp.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface IPatientRepo extends JpaRepository<Patient, Integer> {
    // Opción 1: Derived Query — Spring genera el SQL por el nombre del método
    // SQL generado: SELECT * FROM patient WHERE address = ?
    List<Patient> findByAddress(String address);

    // Búsqueda parcial — filtra si el address CONTIENE el texto (ej: "Lima")
    // SQL generado: SELECT * FROM patient WHERE address LIKE %?%
    List<Patient> findByAddressContainingIgnoreCase(String address);

    // Opción 2: @Query con JPQL — tú controlas la consulta
    // Útil cuando el nombre del método sería demasiado largo o complejo
    @Query("SELECT p FROM Patient p WHERE LOWER(p.address) LIKE LOWER(CONCAT('%', :address, '%'))")
    List<Patient> findByAddressKeyword(@Param("address") String address);

    // Ejemplo más avanzado: buscar por ciudad en firstName O lastName
    @Query("SELECT p FROM Patient p WHERE LOWER(p.firstName) LIKE LOWER(CONCAT('%', :name, '%')) " +
            "OR LOWER(p.lastName) LIKE LOWER(CONCAT('%', :name, '%'))")
    List<Patient> searchByName(@Param("name") String name);
}
