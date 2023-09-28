package com.te.lms.response.mentor;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LmsResponseMentor {

	private boolean error;

	private HttpStatus status;

	private String message;

	private Object listOfMentors;
}
