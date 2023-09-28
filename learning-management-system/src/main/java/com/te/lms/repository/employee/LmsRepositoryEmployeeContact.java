package com.te.lms.repository.employee;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.employee.EmployeeContact;

@Repository
public interface LmsRepositoryEmployeeContact extends JpaRepository<EmployeeContact, Integer> {

}
