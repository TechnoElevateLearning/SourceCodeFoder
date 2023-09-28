package com.te.lms.entity.employee;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.ColumnDefault;

import com.te.lms.entity.mentor.Batch;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name="employeePrimaryInfo")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="employee_primary_info")
public class EmployeePrimaryInfo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="employeeId")
	private Integer employeeId;
	@Column(name="name")
	private String employeeName;
	@Column(name="email")
	@Pattern(regexp = "^([a-zA-Z0-9._%-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})$",message = "Email not in proper format")
	private String employeeEmail;
	@Column(name="password")
	private String employeePassword;
	@Column(name="date_of_joining")
	private String employeeDateOfJoining;
	@Column(name="date_of_birth")
	private String employeeDateOfBirth;
	@Column(name="blood_group")
	private String employeeBloodGroup;
	@Column(name="designation")
	private String employeeDesignation;
	@Column(name="gender")
	private String employeegender;
	@Column(name="nationality")
	private String employeeNationality;
	@Column(name="status")
	private String employeeStatus;
	@Column(name="role")
	@ColumnDefault("ROLE_USER")
	private String role;
	@ManyToOne
	private Batch batch;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="secondaryInfo_id")
	private EmployeeSecondaryInfo employeeSecondaryInfo;
	@OneToMany(mappedBy = "employeeId",cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private List<EmployeeAddressDetails> employeeAddressDetails;
	@OneToMany(mappedBy = "employeeId",cascade=CascadeType.ALL)
	private List<EmployeeBankDetails> employeeBankDetails;
	@OneToMany(mappedBy = "employeeId",cascade=CascadeType.ALL)
	private List<EmployeeContact> employeeContacts;
	@OneToMany(mappedBy = "employeeId",cascade=CascadeType.ALL)
	private List<EmployeeEducationDetails> employeeEducationDetails;
	@OneToMany(mappedBy = "employeeId",cascade=CascadeType.ALL)
	private List<EmployeeTechnicalSkills> employeeTechnicalSkills;
	@OneToMany(mappedBy = "employeeId",cascade=CascadeType.ALL)
	private List<EmployeeExperience> employeeExperiences;
	@OneToMany(mappedBy = "employeeId",cascade=CascadeType.ALL)
	private List<EmployeeDepartmentInfo> employeeDepartmentInfos;
}
