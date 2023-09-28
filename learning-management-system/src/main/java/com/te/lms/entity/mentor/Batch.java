package com.te.lms.entity.mentor;



import java.util.List;

import com.te.lms.entity.employee.EmployeePrimaryInfo;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Batch {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="batch_id")
	private Integer batchId;
	@Column(name="name")
	private String batchName;
	@Column(name="batch_technologies")
	private BatchTechnologies batchTechnologies;
	@Column(name="batch_start")
	private String batchStart;
	@Column(name="batch_end")
	private String batchEnd;
	@Enumerated(EnumType.STRING)
	private Status status;
	@OneToMany(mappedBy = "batch", cascade = CascadeType.ALL)
	private List<EmployeePrimaryInfo> employees;
	@ManyToOne
	private Mentor mentor;
	@OneToOne(mappedBy = "batch")
	@Enumerated(EnumType.STRING)
	private BatchStrength batchStrength;
	
	public enum Status{
		InProgress,Completed,To_be_started
	}
	
	public enum BatchTechnologies{
		Java
	}
}
