package com.te.lms.dto.mentor;

import java.util.List;

import org.springframework.stereotype.Component;

import com.te.lms.dto.employee.EmployeePrimaryInfoDto;
import com.te.lms.entity.mentor.BatchStrength;
import com.te.lms.entity.mentor.Mentor;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BatchDto {
	
	
	private String batchName;
	private BatchTechnologies batchTechnologies;
	private String batchStart;
	private String batchEnd;
	private Status status;
	private List<EmployeePrimaryInfoDto> employees;
	private Mentor mentor;
	private BatchStrength batchStrength;
	
	public enum Status{
		InProgress,Completed,To_be_started
	}
	
	public enum BatchTechnologies{
		Java,
	}
}
