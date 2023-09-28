package com.te.lms.controller.employee;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.employee.EmployeePrimaryInfoDto;
import com.te.lms.entity.employee.EmployeePrimaryInfo;
import com.te.lms.response.employee.LmsResponseEmployee;
import com.te.lms.service.employee.LmsServiceEmployee;

@RestController
@RequestMapping("/lms/employee")
public class LmsControllerEmployee {
	
	@Autowired
	private LmsServiceEmployee  lmsServiceEmployee;
	
	
	///====================saving employee data===============================
	@PostMapping(path="/saveEmployee")
	public ResponseEntity<LmsResponseEmployee> createEmployee(@RequestBody EmployeePrimaryInfoDto employeePrimaryInfoDto){
		EmployeePrimaryInfo employee = lmsServiceEmployee.saveEmployee(employeePrimaryInfoDto);
		if(employee!=null) {
			return ResponseEntity.ok().body(LmsResponseEmployee.builder().error(false).status(HttpStatus.CREATED).message("Employee created").listOfEmployee(employee).build());
		}else {
			return ResponseEntity.ok().body(LmsResponseEmployee.builder().error(true).status(HttpStatus.BAD_REQUEST).message("Employee Not created").listOfEmployee(employee).build());
		}
		
	}
	
	//=====================updating employee data================================
	@PutMapping("/updateEmployee/{employeeId}")
	public ResponseEntity<LmsResponseEmployee> updateEmployee(@RequestBody EmployeePrimaryInfoDto employeePrimaryInfoDto, @PathVariable ("employeeId") Integer employeeId){
		EmployeePrimaryInfo employee = lmsServiceEmployee.updateEmployee(employeePrimaryInfoDto,employeeId);
		if(employee!=null) {
			return ResponseEntity.ok().body(LmsResponseEmployee.builder().error(false).status(HttpStatus.ACCEPTED).message("Employee Updated successfully").listOfEmployee(employee).build());
		}else {
			return ResponseEntity.ok().body(LmsResponseEmployee.builder().error(false).status(HttpStatus.BAD_REQUEST).message("Employee not Updated ").listOfEmployee(employee).build());
		}
	}

	@GetMapping("/getEmployee/{employeeId}")
	public ResponseEntity<LmsResponseEmployee> getEmployee(@PathVariable ("employeeId") Integer employeeId){
		EmployeePrimaryInfo employee = lmsServiceEmployee.getEmployee(employeeId);
		if(employee!=null) {
			return ResponseEntity.ok().body(LmsResponseEmployee.builder().error(false).status(HttpStatus.FOUND).message("Employee Found successfully").listOfEmployee(employee).build());
		}else {
			return ResponseEntity.ok().body(LmsResponseEmployee.builder().error(false).status(HttpStatus.BAD_REQUEST).message("Employee not Found ").listOfEmployee(employee).build());
		}
	}
	
	
}
