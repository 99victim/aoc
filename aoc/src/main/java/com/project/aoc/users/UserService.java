package com.project.aoc.users;

import lombok.RequiredArgsConstructor;
import org.apache.catalina.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public UserResponse register(UserRequest request) {
        Users user = Users.builder()
                .id(request.getId())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

        Users savedUser = repository.save(user);

        return UserResponse.fromEntity(savedUser);

    }
}
