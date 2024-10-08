package com.riwi.prueba.Dto.mapper;

import com.riwi.prueba.Dto.request.UserRequestDto;
import com.riwi.prueba.Dto.response.UserReponseDto;
import com.riwi.prueba.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    User userRequestDtoToUser(UserRequestDto userRequestDto);

    UserReponseDto userToUserReponseDto(User user);


}
