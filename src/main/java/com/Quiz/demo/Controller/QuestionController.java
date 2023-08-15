package com.Quiz.demo.Controller;


import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.Quiz.demo.Model.*;
import com.Quiz.demo.Service.QuestionService;


@RestController
@RequestMapping("/Question")

public class QuestionController {
	@Autowired
	QuestionService questionService;
	@GetMapping("allqueston")
	
	public List<Question> Getallqueston() {
	//	System.out.print("hi");	
		return questionService.getAllQuestion();
		}

}
