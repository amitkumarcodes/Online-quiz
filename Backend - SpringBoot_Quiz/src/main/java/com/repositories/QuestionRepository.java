package com.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.models.Questions;

@Repository
public interface QuestionRepository extends JpaRepository<Questions, Long> {
}

