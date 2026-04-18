package com.microservices.QuizService.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.QuizService.models.QuizModel;
import com.microservices.QuizService.repository.QuizReporsitory;

@Service
public class QuizService {

    private final QuizReporsitory quizReporsitory;

    private final QuestionClient questionClient;

    public QuizService(QuizReporsitory quizReporsitory, QuestionClient questionClient) {
        this.quizReporsitory = quizReporsitory;
        this.questionClient = questionClient;
    }

    public QuizModel add(QuizModel quizModel) {
        return quizReporsitory.save(quizModel);
    }

    public List<QuizModel> getAll() {
        List<QuizModel> quizzes = quizReporsitory.findAll();

        quizzes.forEach(quiz -> quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId())));
        return quizzes;
    }

    public QuizModel getQuizByID(Long id) {
        QuizModel quiz = quizReporsitory.findById(id).orElseThrow(() -> new RuntimeException("Quiz with Id not found"));
        quiz.setQuestions(questionClient.getQuestionOfQuiz(quiz.getId()));
        return quiz;
    }

}
