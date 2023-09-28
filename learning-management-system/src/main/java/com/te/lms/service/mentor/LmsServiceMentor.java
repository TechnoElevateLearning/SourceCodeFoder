package com.te.lms.service.mentor;

import com.te.lms.dto.mentor.MentorDto;
import com.te.lms.entity.mentor.Mentor;

public interface LmsServiceMentor {


	Mentor saveMentor(MentorDto mentorDto);

	Mentor updateMentor(MentorDto mentorDto, Integer mentorId);

	Mentor getMentor(Integer mentorId);

	void deleteMentor(Integer mentorId);

}
