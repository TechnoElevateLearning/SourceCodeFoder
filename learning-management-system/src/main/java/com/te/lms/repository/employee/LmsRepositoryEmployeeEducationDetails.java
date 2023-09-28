package com.te.lms.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.employee.EmployeeEducationDetails;

@Repository
public interface LmsRepositoryEmployeeEducationDetails extends JpaRepository<EmployeeEducationDetails, Integer>{

}
