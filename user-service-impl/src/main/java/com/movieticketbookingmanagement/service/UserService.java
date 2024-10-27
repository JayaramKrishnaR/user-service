package com.movieticketbookingmanagement.service;

import com.movieticketbookingmanagement.dto.UserDto;
import com.movieticketbookingmanagement.model.Users;

import java.util.List;
import java.util.UUID;

public interface UserService {
    Users createUser(Users user);

    Users getUserById(UUID id);

    List<Users> getAllUsers();

    Users patchUser(UUID id, Users user);

    void deleteUser(UUID id);
}
