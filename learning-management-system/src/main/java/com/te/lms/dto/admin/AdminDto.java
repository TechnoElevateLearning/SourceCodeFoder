package com.te.lms.dto.admin;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
public class AdminDto {

	
	private String adminName;
	private String adminEmail;
	private String adminPassword;
}
