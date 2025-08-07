package com.project.aoc.file;

import com.project.aoc.common.BaseEntity;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "File")
public class File extends BaseEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long file_id;

    /*
	@Column(name = "REVIEW_ID")
	@ManyToOne
	@JoinColumn(name = "user_id")
    private Long reviewId;
    */

    @Column()
    private String file_name;
    
    @Column()
    private String path;
    
    @Column(name = "FILE_TYPE")
    private String fileType;
    
    @Column(name = "UPLOAD_AT")
    private LocalDateTime uploadAt;
    
    @Column(name = "PRODUCT_ID")
    @JoinColumn(name = "PRODUCT_ID")
    private Long productId;
    
    

}
