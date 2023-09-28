package com.te.lms.entity.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity(name="employeeDepaetmentInfo")
@Table(name="employee_department_info")
public class EmployeeDepartmentInfo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="department_id")
	private Integer employeeDepartmentId;
	@Column(name="department_name")
	private String employeeDepartmentName;
	@Column(name="department_manager_name")
	private String employeeDepartmentManager;
	@Column(name="department_location")
	private String employeeDepartmentLocation;
	@ManyToOne
	@JoinColumn(name="employee_id")
	private EmployeePrimaryInfo employeeId;
}
