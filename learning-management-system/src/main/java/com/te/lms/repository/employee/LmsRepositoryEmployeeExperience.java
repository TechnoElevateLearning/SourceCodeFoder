package com.te.lms.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.employee.EmployeeExperience;

@Repository
public interface LmsRepositoryEmployeeExperience extends JpaRepository<EmployeeExperience, Integer>{

}
