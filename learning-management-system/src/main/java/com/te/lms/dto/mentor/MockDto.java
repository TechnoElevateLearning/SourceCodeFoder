package com.te.lms.dto.mentor;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Component
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class MockDto {

	private MockType mockType;	
	private String mockTakenBy;
	private Technology mockTechnology;
	private Integer practicalKnowledgeOurOfHundread;
	private Integer theoreticalKnowledgeOutOfHundread;
	private OverallFeedback overAllFeedBack;
	private MockRating mockRating;
	
	public  enum OverallFeedback{
		Execellent("90 above"),
		Good("80-89"),
		AboveAverage("70-79"),
		Average("60-69"),
		BelowAverage("50-59");

		OverallFeedback(String string) {
			// TODO Auto-generated constructor stub
		}
		
	}
	
	public enum MockType{
		Mock,Remock
	}
	
	public enum Technology{
		MEAN,MERN,JAVA
	}
	
	public enum MockRating{
		Excellent,Good,AboveAverage,Average,BelowAverage
	}
}
