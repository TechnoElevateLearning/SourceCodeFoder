package com.te.lms.service.Implementation.employee;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.lms.dto.employee.EmployeePrimaryInfoDto;
import com.te.lms.entity.admin.RequestList;
import com.te.lms.entity.employee.EmployeePrimaryInfo;
import com.te.lms.repository.admin.LmsRepositoryRequestList;

import com.te.lms.repository.employee.LmsRepositoryEmployeePrimaryInfo;
import com.te.lms.service.employee.LmsServiceEmployee;

@Service
public class LmsServiceImplemetationEmployee implements LmsServiceEmployee{

	
	@Autowired
	private LmsRepositoryEmployeePrimaryInfo lmsRepositoryEmployeePrimaryInfo;
	@Autowired
	private LmsRepositoryRequestList lmsRepositoryRequestList;


	//save
	@Override
	public EmployeePrimaryInfo saveEmployee(EmployeePrimaryInfoDto employeePrimaryInfoDto) {
		EmployeePrimaryInfo employee = new EmployeePrimaryInfo();
		BeanUtils.copyProperties(employeePrimaryInfoDto, employee);
		EmployeePrimaryInfo employeeSaved = lmsRepositoryEmployeePrimaryInfo.save(employee);
		RequestList request =  RequestList.builder().employeeId(employee.getEmployeeId()).employeeContact(employee.getEmployeeContacts().get(0).getEmployeeContactNumber()).employeeName(employee.getEmployeeName()).employeeExperience(employee.getEmployeeExperiences().get(0).getYearOfExperience()).employeePercentage(employee.getEmployeeEducationDetails().get(0).getEmployeePercentage()).employeeYearOfPassing(employee.getEmployeeEducationDetails().get(0).getEmployeeYearOfPassing()).build();

		lmsRepositoryRequestList.save(request);
		
		return employeeSaved;
	}

	@Override
	public EmployeePrimaryInfo updateEmployee(EmployeePrimaryInfoDto employeePrimaryInfoDto, Integer employeeId) {
		EmployeePrimaryInfo employee = lmsRepositoryEmployeePrimaryInfo.findById(employeeId).get();		
		return lmsRepositoryEmployeePrimaryInfo.save(employee);
	}

	@Override
	public EmployeePrimaryInfo getEmployee(Integer employeeId) {		
		return lmsRepositoryEmployeePrimaryInfo.findById(employeeId).get();
	}

	@Override
	public void deleteEmployee(Integer employeeId) {
		lmsRepositoryEmployeePrimaryInfo.deleteById(employeeId);
		
	}
	
	
}
