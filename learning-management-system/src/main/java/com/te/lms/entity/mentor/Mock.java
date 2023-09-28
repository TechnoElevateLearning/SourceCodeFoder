package com.te.lms.entity.mentor;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Mock {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="mock_id")
	private Integer mockId;
	@Column(name="mock_type")
	private MockType mockType;	
	@Column(name="taken_by")
	private String mockTakenBy;
	@Column(name="technologies")
	private Technology mockTechnology;
	@Column(name="practical_marks(100)")
	private Integer practicalKnowledgeOurOfHundread;
	@Column(name="theoretical_marks(100")
	private Integer theoreticalKnowledgeOutOfHundread;
	@Column(name="overall_feedbacak")
	private OverallFeedback overAllFeedBack;
	@Column(name="rating")
	private MockRating mockRating;
	@OneToOne
	private Mentor mentor;
	
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
