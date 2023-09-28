package com.te.lms.service.Implementation.admin;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.lms.dto.admin.AdminDto;
import com.te.lms.entity.admin.Admin;
import com.te.lms.repository.admin.LmsRepositoryAdmin;
import com.te.lms.service.admin.LmsServiceAdmin;

@Service
public class LmsServiceImplementationAdmin implements LmsServiceAdmin{

	@Autowired
	private LmsRepositoryAdmin lmsRepositoryAdmin;
	@Override
	public Admin createAdmin(AdminDto adminDto) {
		Admin admin = new Admin();
		BeanUtils.copyProperties(adminDto, admin);
		if(admin.getRole().equals("ROLE_ADMIN") && lmsRepositoryAdmin.count()>1) {
			throw new RuntimeException("Admin can be only one.");
		}
		return lmsRepositoryAdmin.save(admin);
	}

}
