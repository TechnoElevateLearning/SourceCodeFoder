package com.te.lms.entity.admin;

import java.util.List;

import org.hibernate.annotations.ColumnDefault;

import com.te.lms.entity.mentor.Batch;
import com.te.lms.entity.mentor.Mentor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Entity
@Data
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="admin_id")
	private Integer adminId;
	@NotEmpty(message = "name should between 3 and 15 characters")
	@Size(min=3,max = 15)
	@Column(name="name")
	private String adminName;
	@Column(name="email")
	private String adminEmail;
	@Column(name="password")
	private String adminPassword;
	@ColumnDefault("ROLE_ADMIN")
	private String role;
	
	
}
