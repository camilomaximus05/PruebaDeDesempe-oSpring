package com.riwi.prueba.controller;

import com.riwi.prueba.Dto.mapper.UserMapper;
import com.riwi.prueba.Dto.request.UserRequestDto;
import com.riwi.prueba.model.User;
import com.riwi.prueba.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
//@PreAuthorize("@permitAll")
public class userController {

    @Autowired
    private UserService userService;

    @PostMapping("/register")
    public void registerUser(@Valid @RequestBody UserRequestDto userRequestDto) {

        User user = UserMapper.INSTANCE.userRequestDtoToUser(userRequestDto);

        userService.createUser(user);

    }

    @PostMapping("/login")
    public void loginUser(@RequestBody UserRequestDto user){

    }


}
