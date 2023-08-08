package com.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.models.Quiz;
import com.models.Results;
import com.services.QuizService;

import java.util.List;

@RestController
@RequestMapping("/api/quizzes")
public class QuizController {

    @Autowired
    private QuizService quizService;

    // Create a new quiz
    @PostMapping
    public Quiz createQuiz(@RequestBody Quiz quiz) {
        return quizService.saveQuiz(quiz);
    }

    // Get all quizzes
    @GetMapping
    public List<Quiz> getAllQuizzes() {
        return quizService.getAllQuizzes();
    }

    // Get quiz by ID
    @GetMapping("/{id}")
    public Quiz getQuizById(@PathVariable Long id) {
        return quizService.getQuizById(id);
    }

    // Submit a result for a quiz
    @PostMapping("/{quizId}/results")
    public Results submitResult(@PathVariable Long quizId, @RequestBody Results result) {
        return quizService.saveResult(quizId, result);
    }

    // Get result by ID
    @GetMapping("/results/{id}")
    public Results getResultById(@PathVariable Long id) {
        return quizService.getResultById(id);
    }
}
