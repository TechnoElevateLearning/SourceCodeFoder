package com.te.lms.entity.admin;

import org.hibernate.annotations.ColumnDefault;
import org.springframework.boot.context.properties.bind.DefaultValue;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_request")
public class RequestList {

	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="request_id")
	private Integer requestListId;
	
	@Column(name="employee_id")
	private Integer employeeId;
	@Column(name="employee_name")
	private String employeeName;
	@Column(name="yoe")
	private String employeeYearOfPassing;
	@Column(name="percentage")
	private String employeePercentage;
	@Column(name="experience")
	private String employeeExperience;
	@Column(name="contact")
	private String employeeContact;
	@Column(name="status")
	@ColumnDefault("APPROVED")
	private String requestStatus;
}
