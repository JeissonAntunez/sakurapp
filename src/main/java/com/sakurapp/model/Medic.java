package com.sakurapp.model;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;


@Entity
// Recomendado para PostgreSQL
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class Medic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Include
    private Integer idMedic;

    @Column(nullable = false, length = 70)
    private String firstName;

    @Column(nullable = false, length = 70)
    private String lastName;

    @Column(nullable = false, length = 12, unique = true)
    private String cmp; // Consejo Médico del Perú (usualmente es único)

    @Column(nullable = false, length = 255)
    private String photoUrl;

    // Opcional: Relación inversa si quieres ver las consultas de este médico
    // @OneToMany(mappedBy = "medico")
    // private List<Consulta> consultas;
}
