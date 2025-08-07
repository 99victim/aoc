package com.project.aoc.users;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
    @NotBlank(message = "아이디")
    @Size(min=4)
    private String userId;

    @NotBlank(message = "이메일")
    @Email(message = "올바른 이메일 주소를 입력하세요")
    private String email;

    @NotBlank(message = "비밀번호")
    @Pattern(regexp = "(?=.*[0-9])(?=.[a-zA-Z])(?=.*\\S+$).{8,}", message = "8자리 이상의 대,소문자, 숫자, 특수문자를 사용하세요")
    private String password;

}
