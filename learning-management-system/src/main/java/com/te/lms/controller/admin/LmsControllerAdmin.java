package com.te.lms.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.admin.AdminDto;
import com.te.lms.entity.admin.Admin;
import com.te.lms.service.admin.LmsServiceAdmin;
import com.te.lms.service.employee.LmsServiceEmployee;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/lms/admin")
public class LmsControllerAdmin {

	@Autowired
	private LmsServiceEmployee lmsServiceEmployee;
	@Autowired
	private LmsServiceAdmin lmsServiceAdmin;

	// admin
	// controller
	@DeleteMapping("/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable("employeeId") Integer employeeId) {
		lmsServiceEmployee.deleteEmployee(employeeId);
		return "employee deleted successfully";

	}

	@PostMapping("/createAdmin")
	public String createAdmin(@RequestBody AdminDto adminDto) {
		Admin admin = lmsServiceAdmin.createAdmin(adminDto);
		if (admin != null) {
			return "Admin created";
		} else {
			return "Admin is not created";
		}
	}
}
