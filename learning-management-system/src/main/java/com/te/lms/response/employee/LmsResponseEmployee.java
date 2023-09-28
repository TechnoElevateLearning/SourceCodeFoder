package com.te.lms.response.employee;

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
public class LmsResponseEmployee {

	private boolean error;

	private HttpStatus status;

	private String message;

	private Object listOfEmployee;
}
