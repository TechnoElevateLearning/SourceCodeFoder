package com.te.lms.entity.mentor;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
public class BatchStrength {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="batch_strength_id")
	private Integer batchStrengthId;
	@Column(name="initial_strength")
	private Integer initialStrength;
	@Column(name="drop_employee")
	private Integer dropOut;
	@Column(name="terminated_employee")
	private Integer terminated;
	@Column(name="abscoding")
	private Integer abscoding;
	@Column(name="present_strength")
	private Integer presentStrength;
	@OneToOne
	private Batch batch;
	
}
