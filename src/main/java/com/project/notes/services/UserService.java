package com.project.notes.services;

import java.util.List;

import com.project.notes.payload.UserDto;

public interface UserService {
    //create
    UserDto createUser(UserDto userDto);
    //update
    UserDto updateUser(UserDto userDto,Integer userId);
    //delete
    void deleteUser(Integer userId);
    //get
    UserDto getUser(Integer userId);
    //getAll
    List<UserDto> getAllUser();

    //user login
    UserDto userLogin(String email, String password);
}
