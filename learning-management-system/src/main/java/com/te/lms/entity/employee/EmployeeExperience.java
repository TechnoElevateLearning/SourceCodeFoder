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

@Entity(name="employeeExperienceInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee_experience_info")
public class EmployeeExperience {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="experience_id")
	private Integer employeeExperienceId;
	@Column(name="company")
	private String companyName;
	@Column(name="year_of_experience")
	private String yearOfExperience;
	@Column(name="date_of_joining")
	private String dateOfJoining;
	@Column(name="date_of_relieving")
	private String dateOfRelieving;
	@Column(name="designation")
	private String designation;
	@Column(name="location")
	private String location;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeePrimaryInfo employeeId;

}
