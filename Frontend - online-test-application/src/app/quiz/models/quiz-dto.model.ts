import { QuizDTO } from './models/quiz-dto.model';

export class QuestionDTO {
    id: number;
    questionText: string;
    optionA: string;
    optionB: string;
    optionC: string;
    optionD: string;
  }
  
  export class QuizDTO {
    id: number;
    title: string;
    description: string;
    questions: QuestionDTO[];
  }
  