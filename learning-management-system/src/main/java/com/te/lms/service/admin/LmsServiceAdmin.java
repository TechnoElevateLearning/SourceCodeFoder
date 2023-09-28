package com.te.lms.service.admin;

import com.te.lms.dto.admin.AdminDto;
import com.te.lms.entity.admin.Admin;

public interface LmsServiceAdmin {

	Admin createAdmin(AdminDto adminDto);
}
