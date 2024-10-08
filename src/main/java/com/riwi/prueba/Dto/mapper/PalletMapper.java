package com.riwi.prueba.Dto.mapper;

import com.riwi.prueba.Dto.request.PalletRequestDto;
import com.riwi.prueba.Dto.response.PalletResponseDto;
import com.riwi.prueba.model.Pallet;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PalletMapper {

    PalletMapper INSTANCE = Mappers.getMapper(PalletMapper.class);

    Pallet palletRequestDtoToPallet(PalletRequestDto palletRequest);

    PalletResponseDto palletToPalletResponseDto (Pallet pallet);

}
