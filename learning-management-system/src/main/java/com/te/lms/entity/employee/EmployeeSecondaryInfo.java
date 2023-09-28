package com.te.lms.entity.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="employeeSecondaryInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee_secondary_info")
public class EmployeeSecondaryInfo {
	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="secondary_info_id")
		private Integer employeeSecondaryInfoId;
		@Column(name="pan_number")
		@NotEmpty(message="please enter PAN Number")
		private String employeePanNumber;
		@Column(name="adhar_number")
		@NotEmpty(message="please enter Addhar Number")
		private String employeeAdharNumber;
		@Column(name="father_name")
		private String employeeFatherName;
		@Column(name="mother_name")
		private String employeeMothername;
		@Column(name="spause_name")
		private String empoyeeSpauseName;
		@Column(name="passport_number")
		private String employeePassportNumber;
		@Column(name="marital_status")
		private String employeeMaritalStatus;
	
	
		
}
