package com.microservices.QuizService.service;

import java.util.List;

import com.microservices.QuizService.models.QuizModel;
import com.microservices.QuizService.repository.QuizReporsitory;

public class QuizService {

    private final QuizReporsitory quizReporsitory;

    public QuizService(QuizReporsitory quizReporsitory) {
        this.quizReporsitory = quizReporsitory;
    }

    public QuizModel add(QuizModel quizModel){
        return quizReporsitory.save(quizModel);
    }

    public List<QuizModel> getAll(){
        return quizReporsitory.findAll();
    }

    public QuizModel getQuizByID(Long id){
        return quizReporsitory.findById(id).orElseThrow(() -> new RuntimeException("Quiz with Id not found"));
    }

}
