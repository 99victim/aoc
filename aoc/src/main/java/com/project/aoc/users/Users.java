package com.project.aoc.users;

<<<<<<< Updated upstream
import java.time.LocalDateTime;

=======
import com.project.aoc.common.BaseEntity;
>>>>>>> Stashed changes
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

//회원(사용자 + 통합 관리자) 
@Entity
@Table(name="Users")
<<<<<<< Updated upstream
public class Users {
=======
@Data
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class Users extends BaseEntity {
    /*
>>>>>>> Stashed changes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long user_id;
	
	@Column()
    private String user_name;

    @Column()
    private String email;

    @Column()
    private String password;

    @Column()
    private String user_gender;

    @Column()
    private String user_tel;

    @Column()
    private String user_bitrh;

    @Column()
    private String provider;

    @Column()
    private String provider_id;

<<<<<<< Updated upstream
    @Column(name = "CREATED_AT")
    private LocalDateTime createdAt;

    @Column(name = "UPDATED_AT")
    private LocalDateTime updatedAt;

    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

    @Column(name ="DELETED_AT")
    private LocalDateTime deletedAt;

    @Column(name = " USER_TYPE")
=======
    @Column(name = "IS_DELETED")
    private Boolean isDeleted;

    @Column(name = "USER_TYPE")
>>>>>>> Stashed changes
    private Boolean user_type;

    @Column(name = "USER_STATE")
    private String state;

	
	
}
