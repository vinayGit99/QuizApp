package com.Quiz.demo.Model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;



@Data
@Entity
@Table (name = "question")
public class Question {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column (name="question_Title")
	private String questionTitle;
	@Column (name="option1")
	private String option1;
	
	@Column (name="option2")
	private String option2;
	
	@Column (name="option3")
	private String option3;
	
	@Column (name="option4")
	private String option4;
	
	@Column (name="right_answer")
	private String rightAnswer;
	
	@Column (name="difficulty_level")
	private String difficultylevel;
	
	@Column (name="category")
	private String category;

   

	
}
