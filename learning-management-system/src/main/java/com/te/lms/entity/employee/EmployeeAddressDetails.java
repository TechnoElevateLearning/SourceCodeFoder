package com.te.lms.entity.employee;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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

@Entity(name="employeeAddressDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee_address_info")
public class EmployeeAddressDetails {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="address_id")
		private Integer employeeAddressDetailsId;
		@Column(name="address_type")
		private String employeeAddressType;
		@Column(name="door_number")
		private String employeeDoorNumber;
		@Column(name="street")
		private String employeeStreet;
		@Column(name="locality")
		private String employeeLocality;
		@Column(name="city")
		private String employeeCity;
		@Column(name="state")
		private String employeeState;
		@Column(name="pin_code")
		private String employeePinCode;
		@Column(name="landmark")
		private String employeeLandmark;
	
		@ManyToOne(fetch = FetchType.EAGER)
		@JoinColumn(name="employee_id")
		private EmployeePrimaryInfo employeeId;
}
