package com.movieticketbookingmanagement.dto;

import java.time.OffsetDateTime;
import java.util.UUID;

public class UserDto {
    private UUID id;
    private String name;
    private String email;
    private String phone;
    private OffsetDateTime createdAt;
}
