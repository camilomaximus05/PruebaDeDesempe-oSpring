package com.riwi.prueba.Dto.request;

import com.riwi.prueba.util.StateLoad;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.awt.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LoadRequestDto {

    private Double weight;

    private Dimension dimension;

    @Enumerated(EnumType.STRING)
    private StateLoad state;



}
