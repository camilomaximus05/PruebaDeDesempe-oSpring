package com.riwi.prueba.Dto.response;

import com.riwi.prueba.util.Location;
import com.riwi.prueba.util.StatePallet;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PalletResponseDto {

    @Id
    private Long id;

    private Location location;
    private Double maxWeight;
    private StatePallet state;

}
