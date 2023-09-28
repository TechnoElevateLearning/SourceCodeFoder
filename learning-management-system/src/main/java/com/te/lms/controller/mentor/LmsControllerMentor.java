package com.te.lms.controller.mentor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.te.lms.dto.mentor.MentorDto;
import com.te.lms.entity.mentor.Mentor;
import com.te.lms.response.mentor.LmsResponseMentor;
import com.te.lms.service.mentor.LmsServiceMentor;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
@RequestMapping("/lms/mentor")
public class LmsControllerMentor {
	@Autowired
	private LmsServiceMentor lmsServiceMentor;
	
	@PostMapping("/saveMentor")
	public  ResponseEntity<LmsResponseMentor> saveMentor(@RequestBody MentorDto mentorDto){
		Mentor mentor = lmsServiceMentor.saveMentor(mentorDto);
		if(mentor!=null) {
			return ResponseEntity.ok().body(LmsResponseMentor.builder().error(false).message("Mentor Successfully saved").status(HttpStatus.CREATED).listOfMentors(mentor).build());
			
		}else {
			return ResponseEntity.ok().body(LmsResponseMentor.builder().error(true).message("Mentor not saved").status(HttpStatus.BAD_REQUEST).listOfMentors(mentor).build());
		}
	}
	
	@PutMapping("/updateMentor/{mentorId}")
	public ResponseEntity<LmsResponseMentor> updateMentor(@RequestBody MentorDto mentorDto, @PathVariable ("mentorId") Integer mentorId){
		Mentor mentor = lmsServiceMentor.updateMentor(mentorDto,mentorId);
		if(mentor!=null) {
			return ResponseEntity.ok().body(LmsResponseMentor.builder().error(false).message("Mentor updated Successfully").status(HttpStatus.OK).listOfMentors(mentor).build());
			
		}else {
			return ResponseEntity.ok().body(LmsResponseMentor.builder().error(true).message("Mentor not updated").status(HttpStatus.BAD_REQUEST).listOfMentors(mentor).build());
		}
	}
	
	@GetMapping("/getMentor/{mentorId}")
	public ResponseEntity<LmsResponseMentor> getMentor(@PathVariable ("mentorId") Integer mentorId){
		Mentor mentor = lmsServiceMentor.getMentor(mentorId);
		if(mentor!=null) {
			return ResponseEntity.ok().body(LmsResponseMentor.builder().error(false).message("Mentor found Successfully").status(HttpStatus.FOUND).listOfMentors(mentor).build());
			
		}else {
			return ResponseEntity.ok().body(LmsResponseMentor.builder().error(true).message("Mentor not found").status(HttpStatus.BAD_REQUEST).listOfMentors(mentor).build());
		}
	}
	
	@DeleteMapping("/deleteMentor/{mentorId}")
	public String deleteMentor(@PathVariable ("mentorId") Integer mentorId){
		lmsServiceMentor.deleteMentor(mentorId);
		return "mentor deleted";
	}
	
}
