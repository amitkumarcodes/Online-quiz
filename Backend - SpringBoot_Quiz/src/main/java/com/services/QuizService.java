package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dto.QuestionDTO;
import com.dto.QuizDTO;
import com.models.Questions;
import com.models.Quiz;
import com.models.Results;
import com.repositories.QuizRepository;
import com.repositories.ResultRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private ResultRepository resultRepository;

    public Quiz saveQuiz(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    public List<Quiz> getAllQuizzes() {
        return quizRepository.findAll();
    }

    public Quiz getQuizById(Long id) {
        return quizRepository.findById(id).orElseThrow(() -> new RuntimeException("Quiz not found"));
    }
    
    public QuizDTO convertToDTO(Quiz quiz) {
        QuizDTO quizDTO = new QuizDTO();
        quizDTO.setId(quiz.getId());
        quizDTO.setTitle(quiz.getTitle());
        quizDTO.setDescription(quiz.getDescription());

        List<QuestionDTO> questionDTOs = quiz.getQuestions().stream()
            .map(this::convertQuestionToDTO)
            .collect(Collectors.toList());
        quizDTO.setQuestions(questionDTOs);

        return quizDTO;
    }

    private QuestionDTO convertQuestionToDTO(Questions question) {
        QuestionDTO questionDTO = new QuestionDTO();
        questionDTO.setId(question.getId());
        questionDTO.setQuestionText(question.getQuestionText());
        questionDTO.setOptionA(question.getOptionA());
        questionDTO.setOptionB(question.getOptionB());
        questionDTO.setOptionC(question.getOptionC());
        questionDTO.setOptionD(question.getOptionD());

        return questionDTO;
    }

    public Results saveResult(Long quizId, Results result) {
        Quiz quiz = getQuizById(quizId);
        result.setQuiz(quiz);
        return resultRepository.save(result);
    }

    public Results getResultById(Long id) {
        return resultRepository.findById(id).orElseThrow(() -> new RuntimeException("Result not found"));
    }
}
