package com.project.aoc.email;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class EmailRequest {
    @Email(message = "올바른 이메일 형식을 입력해주세요")
    private String email;

    //발송 시 null값, 검증 시 값 채움
    private String code;
}
