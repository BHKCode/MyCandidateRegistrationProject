package com.example.demo.dto;

import java.util.Date;

public class ExamDto {
	private Integer id;
	private String position;
	private Date date;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "ExamDto [id=" + id + ", position=" + position + ", date=" + date + "]";
	}
	
	

}
