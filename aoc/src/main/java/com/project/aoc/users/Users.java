package com.project.aoc.users;

import java.time.LocalDateTime;

import com.project.aoc.common.BaseEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//회원(사용자 + 통합 관리자) 
@Entity
@Table(name="Users")
public class Users extends BaseEntity {
    /*
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	*/

	@Column()
    private String user_name;

    @Column()
    private String user_email;

    @Column()
    private String user_password;

    @Column()
    private String user_gender;

    @Column()
    private String user_tel;

    @Column()
    private String user_birth;

    @Column()
    private String provider;

    @Column()
    private String provider_id;

    /*
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;
    */

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

    /*
    @Column(name ="DELETED_AT")
    private LocalDateTime deletedAt;
    */

    @Column(name = "USER_TYPE")
    private Boolean user_type;

    @Column(name = "USER_STATE")
    private String state;

	
	
}
