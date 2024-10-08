package com.riwi.prueba.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table( name = "dimension" )
public class Dimension {


    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Id
    private Long id;

    private Double width;
    private Double height;
    private Double length;

}