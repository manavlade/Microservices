package com.microservices.QuizService.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.QuizService.models.QuizModel;
import com.microservices.QuizService.service.QuizService;

@RestController
@RequestMapping("/quiz")
public class QuizController {

    private final QuizService quizService;

    public QuizController(QuizService quizService){
        this.quizService = quizService;
    }

    @PostMapping({"", "/"})
    public QuizModel create(@RequestBody QuizModel quizModel){
        return quizService.add(quizModel);
    }

    @GetMapping({"", "/"})
    public List<QuizModel> getAll(){
        return quizService.getAll();
    }

    @GetMapping("/{id}")
    public QuizModel getQuizById(@PathVariable Long id){
        return this.quizService.getQuizByID(id);
    }
}
