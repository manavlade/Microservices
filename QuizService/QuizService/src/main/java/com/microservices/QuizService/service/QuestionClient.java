package com.microservices.QuizService.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.QuizService.models.QuestionModel;

@FeignClient(url = "http://localhost:9090", value="Question-Client")
public interface QuestionClient {

    @GetMapping("/questions/quiz/{quizId}")
    List<QuestionModel> getQuestionOfQuiz( @PathVariable Long quizId);
}
