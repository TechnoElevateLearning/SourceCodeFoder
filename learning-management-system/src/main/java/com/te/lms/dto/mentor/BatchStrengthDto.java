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
public class BatchStrengthDto {
	
	private Integer initialStrength;
	private Integer dropOut;
	private Integer terminated;
	private Integer abscoding;
	private Integer presentStrength;
}
