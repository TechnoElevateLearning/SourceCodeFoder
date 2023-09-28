package com.te.lms.service.Implementation.mentor;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.te.lms.dto.mentor.MentorDto;
import com.te.lms.entity.mentor.Mentor;
import com.te.lms.repository.mentor.LmsRepositoryMentor;
import com.te.lms.service.mentor.LmsServiceMentor;

@Service
public class LmsServiceImplementationMentor implements LmsServiceMentor {

	@Autowired
	private LmsRepositoryMentor lmsRepositoryMentor;
	@Override
	public Mentor saveMentor(MentorDto mentorDto) {
		Mentor mentor = new Mentor();
		BeanUtils.copyProperties(mentorDto, mentor);
		return lmsRepositoryMentor.save(mentor);
	}
	@Override
	public Mentor updateMentor(MentorDto mentorDto, Integer mentorId) {
		
		Mentor mentorUpdate = lmsRepositoryMentor.findById(mentorId).get();
		if(mentorUpdate!=null) {
			Mentor mentor = new Mentor();
			BeanUtils.copyProperties(mentorId, mentor);
			return lmsRepositoryMentor.save(mentor);
		}else {
			return null;
		}
		
	}
	@Override
	public Mentor getMentor(Integer mentorId) {
		Mentor mentor = lmsRepositoryMentor.findById(mentorId).get();
		return mentor;
	}
	@Override
	public void deleteMentor(Integer mentorId) {
		lmsRepositoryMentor.deleteById(mentorId);
		
	}

}
