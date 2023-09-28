package com.te.lms.dto.employee;

import java.util.List;


import com.te.lms.entity.employee.EmployeeAddressDetails;
import com.te.lms.entity.employee.EmployeeBankDetails;
import com.te.lms.entity.employee.EmployeeContact;
import com.te.lms.entity.employee.EmployeeDepartmentInfo;
import com.te.lms.entity.employee.EmployeeEducationDetails;
import com.te.lms.entity.employee.EmployeeExperience;
import com.te.lms.entity.employee.EmployeePrimaryInfo;
import com.te.lms.entity.employee.EmployeeSecondaryInfo;
import com.te.lms.entity.employee.EmployeeTechnicalSkills;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EmployeePrimaryInfoDto {
	private String employeeName;
	private String employeeEmail;
	private String employeePassword;
	private String employeeDateOfJoining;
	private String employeeDateOfBirth;
	private String employeeBloodGroup;
	private String employeeDesignation;
	private String employeegender;
	private String employeeNationality;
	private String employeeStatus;
	private EmployeeSecondaryInfo employeeSecondaryInfo;
	private List<EmployeeAddressDetails> employeeAddressDetails;
	private List<EmployeeBankDetails> employeeBankDetails;
	private List<EmployeeContact> employeeContacts;
	private List<EmployeeEducationDetails> employeeEducationDetails;
	private List<EmployeeExperience> employeeExperiences;
	private List<EmployeeTechnicalSkills> employeeTechnicalSkills;
	private List<EmployeeDepartmentInfo> employeeDepartmentInfos;
	
	public enum Status{
		Absconded,Terminated,Active
	}
}
