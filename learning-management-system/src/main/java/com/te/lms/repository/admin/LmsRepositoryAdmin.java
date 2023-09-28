package com.te.lms.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.admin.Admin;

@Repository
public interface LmsRepositoryAdmin extends JpaRepository<Admin, Integer>{

}
