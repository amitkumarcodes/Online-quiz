import { Component, OnInit } from '@angular/core';
import { QuizService } from '../quiz.service'; 
@Component({
  selector: 'app-quiz',
  templateUrl: './quiz.component.html',
  styleUrls: ['./quiz.component.css']
})
export class QuizComponent implements OnInit {
  quiz: QuizDTO; // Assuming you have created this type
  selectedAnswers: any[] = [];

  constructor(private quizService: QuizService) { }

  ngOnInit(): void {
    // Fetch the quiz from the backend
    this.quizService.getQuiz().subscribe((quiz) => {
      this.quiz = quiz;
    });
  }

  onSelectAnswer(questionIndex: number, option: string): void {
    this.selectedAnswers[questionIndex] = option;
  }

  onSubmit(): void {
    // Submit the selected answers to the backend for evaluation
    this.quizService.submitAnswers(this.selectedAnswers).subscribe((result) => {
      // Handle the result, e.g., navigate to a result page or show a summary
    });
  }
}
