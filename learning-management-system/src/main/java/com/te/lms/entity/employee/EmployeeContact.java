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

@Entity(name="employeeContactInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee_contact_info")
public class EmployeeContact {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="contact_id")
	private Integer employeeContactId;
	@Column(name="contact_type")
	private String employeeContactType;
	@NotEmpty(message="contact number can't be empty")
	@Column(name="contact_number")
	private String employeeContactNumber;
	
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeePrimaryInfo employeeId;
}



