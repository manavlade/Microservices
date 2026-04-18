package com.microservices.QuizService.models;


public class QuestionModel {
    private long questionId;
    private String questions;
    private Long quizId;

    public long getId() {
        return questionId;
    }

    public void setId(long questionId) {
        this.questionId = questionId;
    }

    public String getQuestions() {
        return questions;
    }

    public void setQuestions(String questions) {
        this.questions = questions;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    

}
