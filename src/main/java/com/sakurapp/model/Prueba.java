package com.sakurapp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "prueba_conexion")
public class Prueba {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String mensaje;
}
