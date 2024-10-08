package com.riwi.prueba.model;


import com.riwi.prueba.util.StateLoad;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "cargo")
public class Load {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Double weight;

    //Table dimensiones
    @OneToOne
    private Dimension dimension;

    @Enumerated(EnumType.STRING)
    private StateLoad state;

    //Fecha de creacion y de la ultima actualizacion
    @JoinColumn(columnDefinition = "Date")
    private LocalDate createdAt;
    @JoinColumn(columnDefinition = "Date")
    private LocalDate updatedAt;


}
