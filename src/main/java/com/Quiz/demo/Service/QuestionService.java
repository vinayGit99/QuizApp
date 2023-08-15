package com.Quiz.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Quiz.demo.Model.Question;
import com.Quiz.demo.dao.QuestionDao;

@Service

public class QuestionService {
	
	@Autowired
	QuestionDao questionDao;

	public List<Question> getAllQuestion() {
		// TODO Auto-generated method stub
		return questionDao.findAll();
	} 
	
	

}
