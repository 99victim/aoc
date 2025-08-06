package com.project.aoc.users;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserResponse {
    private Long id;
    private String email;
    private String password;

    public static UserResponse fromEntity(Users user){
        return new UserResponse(
                user.getId(),
                user.getEmail(),
                user.getPassword()
        );
    }
}
