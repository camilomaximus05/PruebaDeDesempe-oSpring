package com.riwi.prueba.Dto.response;

import com.riwi.prueba.util.Role;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserReponseDto {

    private Long id;
    private String name;
    private String email;
    private Role role;

}
