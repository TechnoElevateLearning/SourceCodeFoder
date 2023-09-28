package com.te.lms.repository.mentor;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.te.lms.entity.mentor.Mentor;

@Repository
public interface LmsRepositoryMentor extends JpaRepository<Mentor, Integer> {

}
