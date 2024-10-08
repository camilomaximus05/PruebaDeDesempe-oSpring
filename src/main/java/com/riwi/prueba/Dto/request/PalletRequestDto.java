package com.riwi.prueba.Dto.request;

import com.riwi.prueba.util.Location;
import com.riwi.prueba.util.StatePallet;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PalletRequestDto {

    private Location location;
    private Double maxWeight;
    private StatePallet state;

}
