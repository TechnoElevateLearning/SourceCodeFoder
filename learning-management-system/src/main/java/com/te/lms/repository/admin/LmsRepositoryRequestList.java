package com.te.lms.repository.admin;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.admin.RequestList;

@Repository
public interface LmsRepositoryRequestList extends JpaRepository<RequestList, Integer> {

}
