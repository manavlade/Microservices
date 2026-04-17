package com.microservices.QuestionService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.QuestionService.models.QuestionModel;
import com.microservices.QuestionService.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {

    private final QuestionService questionService;

    public QuestionController(QuestionService questionService){
        this.questionService = questionService;
    }

    @PostMapping({"", "/"})
    public QuestionModel createQuestion(@RequestBody QuestionModel question){
        return questionService.createQuestion(question);
    }

    @GetMapping("/{id}")
    public QuestionModel getQuestionById(@PathVariable Long id){
        return questionService.getQuestionById(id);
    }

    @GetMapping({"", "/"})
    public List<QuestionModel> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/quiz/{quizId}")
    public List<QuestionModel> getQuestionsByQuizId(@PathVariable Long quizId){
        return questionService.getQuestionsByQuizId(quizId);
    }

}
