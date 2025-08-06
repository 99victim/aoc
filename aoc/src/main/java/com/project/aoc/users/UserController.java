package com.project.aoc.users;

import jakarta.servlet.ServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/users")
public class UserController {
    @PostMapping("/register")
    public ResponseEntity<?> register(@RequestBody UserRequest request, ServletResponse servletResponse) {
        UserResponse response = UserService.register(request);

        return ResponseEntity.ok(response);
    }

}
