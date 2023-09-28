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
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="employeeBankDetails")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name="employee_bank_account_info")
public class EmployeeBankDetails {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="bank_details_id")
		private Integer employeeBankId;
		@Column(name="bank_name")
		private String employeeBankName;
		@Column(name="bank_account_number")
		private String employeeBankAccountNumber;
		@Column(name="bank_account_type")
		private String employeeBankAccountType;
		@Column(name="bank_IFSC_code")
		private String employeeBankIFSCcode;
		@Column(name="bank_branch")
		private String employeeBankBranch;
		@Column(name="bank_state")
		private String employeeBankState;
		
		@ManyToOne
		@JoinColumn(name="employee_id")
		private EmployeePrimaryInfo employeeId;
}
