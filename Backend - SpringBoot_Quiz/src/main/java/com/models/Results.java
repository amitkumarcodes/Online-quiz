package com.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Results {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Quiz quiz;
    private int score;
    private String userName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Quiz getQuiz() {
		return quiz;
	}
	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Results(Long id, Quiz quiz, int score, String userName) {
		super();
		this.id = id;
		this.quiz = quiz;
		this.score = score;
		this.userName = userName;
	}
	public Results() {
		super();
		// TODO Auto-generated constructor stub
	}
}
