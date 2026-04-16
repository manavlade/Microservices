package com.microservices.QuizService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.QuizService.models.QuizModel;

public interface QuizReporsitory extends JpaRepository<QuizModel, Long> {

}
