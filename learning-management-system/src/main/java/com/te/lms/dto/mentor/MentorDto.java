package com.te.lms.dto.mentor;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MentorDto {


	private String mentorName;
	private String mentorEmail;
	private String mentorPassword;
}
