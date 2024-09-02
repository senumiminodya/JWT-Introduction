package com.example.jwt_intro.service;

import com.example.jwt_intro.dto.UserDTO;

public interface UserService {

    int saveUser(UserDTO userDTO);

    UserDTO searchUser(String userName);
}
