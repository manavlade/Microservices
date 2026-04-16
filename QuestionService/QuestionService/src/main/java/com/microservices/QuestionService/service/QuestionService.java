package com.microservices.QuestionService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.QuestionService.models.QuestionModel;
import com.microservices.QuestionService.repository.QuestionRepository;


@Service
public class QuestionService {

    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository){
        this.questionRepository = questionRepository;
    }
    
    public QuestionModel createQuestion(QuestionModel question){
        return questionRepository.save(question);
    }

    public QuestionModel getQuestionById(Long id){
        return questionRepository.findById(id).orElseThrow(() -> new RuntimeException("Question not found"));
    }

    public List<QuestionModel> getAllQuestions(){
        return questionRepository.findAll();
    }

    public List<QuestionModel> getQuestionsByQuizId(Long quizId){
        return questionRepository.findByQuizId(quizId);
    }

}
