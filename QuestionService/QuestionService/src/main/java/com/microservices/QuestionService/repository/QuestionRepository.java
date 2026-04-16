package com.microservices.QuestionService.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.QuestionService.models.QuestionModel;

public interface QuestionRepository extends JpaRepository<QuestionModel, Long> {
    

    List<QuestionModel> findByQuizId(Long quizId);

}
