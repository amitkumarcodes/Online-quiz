package com.dto;

public class ResultDTO {
    private Long id;
    private Long quizId;
    private int score;
    private String userName;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getQuizId() {
		return quizId;
	}
	public void setQuizId(Long quizId) {
		this.quizId = quizId;
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
	public ResultDTO(Long id, Long quizId, int score, String userName) {
		super();
		this.id = id;
		this.quizId = quizId;
		this.score = score;
		this.userName = userName;
	}
	public ResultDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
    
    
}

