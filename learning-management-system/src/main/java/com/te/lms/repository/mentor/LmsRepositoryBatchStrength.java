package com.te.lms.repository.mentor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.mentor.BatchStrength;
@Repository
public interface LmsRepositoryBatchStrength extends JpaRepository<BatchStrength, Integer>{

}
