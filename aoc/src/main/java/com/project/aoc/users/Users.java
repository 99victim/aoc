package com.project.aoc.users;

import com.project.aoc.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.antlr.v4.runtime.misc.NotNull;

//회원(사용자 + 통합 관리자) 
@Entity
@Table(name="Users")
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Users extends BaseEntity {
    @Column(name = "USER_LOGINID")
    private String userId;

    @Column(name = "USER_EMAIL")
    private String email;

    @Column(name ="USER_PASSWORD")
    private String password;

	@Column(name = "user_name")
    private String userName;

    @Column(name = "user_gender")
    private String userGender;

    @Column(name = "user_tel")
    private String userTel;

    @Column(name = "user_birth")
    private String userBirth;

    private String provider;

    @Column(name = "provider_id" )
    private String providerId;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

    @Column(name = "USER_TYPE")
    private Boolean user_type;

    @Column(name = "USER_STATE")
    private String state;

}
