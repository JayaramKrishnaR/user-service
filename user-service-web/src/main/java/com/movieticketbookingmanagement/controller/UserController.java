package com.movieticketbookingmanagement.controller;

import com.movieticketbookingmanagement.model.Users;
import com.movieticketbookingmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/userManagement/v1/users")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping(consumes = APPLICATION_JSON_VALUE)
    public ResponseEntity<Users> createUser(@RequestBody Users user) {
        return new ResponseEntity<>(userService.createUser(user), HttpStatus.CREATED);
    }

    @GetMapping(produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<Users> getUserById(@RequestParam UUID userId) {
        return ResponseEntity.ok(userService.getUserById(userId));
    }

}
