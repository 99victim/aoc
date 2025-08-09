package com.project.aoc.email;

import lombok.RequiredArgsConstructor;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.Random;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final JavaMailSender mailSender;
    private final EmailRepository emailRepository;

    //6자리의 랜덤 인증코드 생성
    private String createCode(){
        return String.valueOf(100000 +new Random().nextInt(900000));
    }

    //인증코드 이메일로 전송
    public void sendVerificationEmail(String email) {
        String code = createCode();

        //DB에 값 저장
        EmailVerification verification = EmailVerification.builder()
                        .email(email)
                        .code(code)
                        .expiresAt(LocalDateTime.now().plusMinutes(10))  //유효시간 3분으로 할 예정 (일단 10분으로 지정)
                        .verified(false)
                        .build();
        emailRepository.save(verification);

        //이메일 내용 작성
        //Java 내장 클래스 JavaMailSender 이용
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(email);
        message.setSubject("이메일 인증 코드 발송 안내");
        message.setText("인증 번호는 "+code+" 입니다\n 3분 안에 입력해주세요");

        mailSender.send(message);
    }

    //인증코드 검증(맞는지 안 맞는지 확인)
    public boolean verifyCode(String email, String code){
        return emailRepository.findByEmail(email)
                //만료 여부 확인
                .filter(v ->v.getExpiresAt().isAfter(LocalDateTime.now()))
                .map(v->{
                    v.setVerified(true);
                    emailRepository.save(v);
                    return true;
                })
                .orElse(false);
    }


}
