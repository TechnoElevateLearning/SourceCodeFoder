package com.te.lms.entity.mentor;

import java.util.List;

import org.hibernate.annotations.ColumnDefault;

import com.te.lms.entity.admin.Admin;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class Mentor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mentor_id")
	private Integer mentorId;
	@Column(name="name")
	private String mentorName;
	@Column(name="email")
	private String mentorEmail;
	@Column(name="password")
	private String mentorPassword;
	@ColumnDefault("ROLE_MENTOR")
	private String role;
	

}
