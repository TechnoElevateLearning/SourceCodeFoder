package com.te.lms.repository.employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.employee.EmployeePrimaryInfo;
@Repository
public interface LmsRepositoryEmployeePrimaryInfo extends JpaRepository<EmployeePrimaryInfo, Integer>{

	void save(Optional<EmployeePrimaryInfo> employee);

}
