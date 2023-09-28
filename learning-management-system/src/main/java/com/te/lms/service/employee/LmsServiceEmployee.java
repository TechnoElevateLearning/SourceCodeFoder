package com.te.lms.service.employee;

import com.te.lms.dto.employee.EmployeePrimaryInfoDto;
import com.te.lms.entity.employee.EmployeePrimaryInfo;

public interface LmsServiceEmployee {

	EmployeePrimaryInfo saveEmployee(EmployeePrimaryInfoDto employeePrimaryInfoDto);

	EmployeePrimaryInfo updateEmployee(EmployeePrimaryInfoDto employeePrimaryInfoDto, Integer employeeId);

	EmployeePrimaryInfo getEmployee(Integer employeeId);

	void deleteEmployee(Integer employeeId);
}
