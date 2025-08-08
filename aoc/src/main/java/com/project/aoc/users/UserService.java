package com.project.aoc.users;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    //회원가입
    public UserResponse register(UserRequest request) {
        Users user = Users.builder()
                .userId(request.getUserId())
                .email(request.getEmail())
                .password(request.getPassword())
                .build();

        Users savedUser = repository.save(user);

        return UserResponse.fromEntity(savedUser);

    }

    //회원가입_아이디 중복 체크
    public void checkUserId(String userId){
        if(repository.existsByUserId(userId)){
            throw new IllegalArgumentException("이미 사용중인 아이디입니다");
        }
    }
}
