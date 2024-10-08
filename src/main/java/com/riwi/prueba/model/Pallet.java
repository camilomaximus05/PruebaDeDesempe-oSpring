package com.riwi.prueba.model;

import com.riwi.prueba.util.Location;
import com.riwi.prueba.util.StatePallet;
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
@Table( name = "pallet")
public class Pallet {


    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    // Tabla de ubicacion en el almacen
    private Location location;


    private Double maxWeight;

    @Enumerated(EnumType.STRING)
    private StatePallet state;

    // Fecha de creación y ultima modificación
    @JoinColumn(columnDefinition = "Date")
    private LocalDate createdAt;
    @JoinColumn(columnDefinition = "Date")
    private LocalDate updatedAt;


}
