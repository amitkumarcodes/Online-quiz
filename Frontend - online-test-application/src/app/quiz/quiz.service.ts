import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { QuizDTO } from './quiz-dto.model'; 

@Injectable({
  providedIn: 'root',
})
export class QuizService {
  private apiUrl = 'http://localhost:8080/api'; 
  constructor(private http: HttpClient) {}

  getQuiz(): Observable<QuizDTO> {
    return this.http.get<QuizDTO>(`${this.apiUrl}/quiz`); 
  }

  submitAnswers(answers: any[]): Observable<any> {
    return this.http.post(`${this.apiUrl}/submit`, answers); 
}
