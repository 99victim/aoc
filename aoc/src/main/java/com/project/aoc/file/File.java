package com.project.aoc.file;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = " File")
public class File {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long file_id;
	
	@Column(name = "REVIEW_ID")
	@ManyToOne
	@JoinColumn(name = "user_id")
    private Long reviewId;

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
