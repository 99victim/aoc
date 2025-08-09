package com.project.aoc.email;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users/register/email")
@RequiredArgsConstructor
public class EmailController {
    private final EmailService emailService;

    @PostMapping("/send")
    public ResponseEntity<String> sendEmail(@RequestBody @Valid EmailRequest emailRequest) {
        //이메일은 필수 입력 값임을 안내
        if(emailRequest.getEmail() == null || emailRequest.getEmail().isBlank()){
            return ResponseEntity.badRequest().body("이메일을 입력해주세요");
        }

        emailService.sendVerificationEmail(emailRequest.getEmail());
        return ResponseEntity.ok("인증 메일이 발송되었습니다");
    }

    @PostMapping("/verify")
    public ResponseEntity<String> verifyCode(@RequestBody @Valid EmailRequest emailRequest) {
        //이메일과 인증코드 입력은 필수 안내
        if(emailRequest.getEmail() == null || emailRequest.getEmail().isBlank() ||
        emailRequest.getCode()==null || emailRequest.getCode().isBlank() ){
            return ResponseEntity.badRequest().body("이메일과 인증코드는 필수 입력입니다");
        }

        boolean result = emailService.verifyCode(emailRequest.getEmail(), emailRequest.getCode());

        if(result) {
            return ResponseEntity.ok("이메일 인증 완료");
        }else {
            return ResponseEntity.badRequest().body("이메일 인증 실패");
        }
    }
}
