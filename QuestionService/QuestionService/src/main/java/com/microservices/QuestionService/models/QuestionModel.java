    package com.microservices.QuestionService.models;

    import jakarta.persistence.Entity;
    import jakarta.persistence.GeneratedValue;
    import jakarta.persistence.GenerationType;
    import jakarta.persistence.Id;
    import jakarta.persistence.Table;

    @Entity
    @Table(name = "questions")
    public class QuestionModel {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long questionId;
        private String  questions;
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
