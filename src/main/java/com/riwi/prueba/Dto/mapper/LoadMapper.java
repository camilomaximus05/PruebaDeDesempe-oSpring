package com.riwi.prueba.Dto.mapper;

import com.riwi.prueba.Dto.request.LoadRequestDto;
import com.riwi.prueba.Dto.response.LoadResponseDto;
import com.riwi.prueba.model.Load;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface LoadMapper {

    LoadMapper INSTANCE = Mappers.getMapper(LoadMapper.class);

    Load loadRequestDtoToLoad(LoadRequestDto loadRequest);

    LoadResponseDto loadToLoadResponseDto (Load load);
    
}
