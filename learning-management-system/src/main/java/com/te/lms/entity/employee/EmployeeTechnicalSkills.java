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

@Entity(name="employeeTechnicalSkills")
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
@Table(name="employee_technical_skill_info")
public class EmployeeTechnicalSkills {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="technical_skill_id")
	private Integer employeeTechnicalSkillId;
	@Column(name="skill_type")
	private String employeeTechnicalSkillType;
	@Column(name="skill_rating")
	private String employeeTechnicalSkillRating;
	@Column(name="year_of_experience")
	private Integer employeeTechnicalYearOfExperience;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeePrimaryInfo employeeId;

}
