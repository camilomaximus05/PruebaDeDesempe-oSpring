package com.riwi.prueba.Dto.response;

import com.riwi.prueba.util.StateLoad;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoadResponseDto {

    private Long id;
    private Double weight;
    private Dimension dimension;
    private StateLoad state;


}
