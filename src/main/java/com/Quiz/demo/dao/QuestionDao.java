package com.Quiz.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Quiz.demo.Model.Question;


public interface  QuestionDao extends JpaRepository<Question, Integer> {

}
