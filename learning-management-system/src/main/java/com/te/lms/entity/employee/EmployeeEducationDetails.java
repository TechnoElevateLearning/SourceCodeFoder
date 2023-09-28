package com.te.lms.entity.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="employeeEducationInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee_education_ifo")
public class EmployeeEducationDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="education_id")
	private Integer employeeEducationDetailsId;
	@Column(name="eduction_type")
	private String employeeEducationType;
	@Column(name="year_of_passing")
	private String employeeYearOfPassing;
	@Column(name="percentage")
	private String employeePercentage;
	@Column(name="university_name")
	private String employeeUniversityName;
	@Column(name="college_name")
	private String employeeCollegeName;
	@Column(name="specification")
	private String employeeSpecification;
	@Column(name="college_state")
	private String employeeCollegeState;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeePrimaryInfo employeeId;


	
}
