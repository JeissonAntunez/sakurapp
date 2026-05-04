package com.sakurapp.model;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

//@Table(name = "tbl_Patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_patient")
    private Integer idPatient;

    @Column(name = "first_name", nullable = false, length = 70)
    private String firstName; // lowerCamelCase   // BD snake cambio de palabra un _

    @Column(name = "last_name", nullable = false, length = 70)
    private String lastName;

    @Column(name = "dni", nullable = false, length = 8)
    private String dni;

    @Column(name = "address", length = 150)
    private String address;

    @Column(name = "phone", nullable = false, length = 9)
    private String phone;

    @Column(name = "email", nullable = false, length = 55)
    private String email;
}
