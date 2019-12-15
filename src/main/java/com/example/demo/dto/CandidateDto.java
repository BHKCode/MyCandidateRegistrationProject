package com.example.demo.dto;

import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class CandidateDto {

	@JsonIgnoreProperties
	private Integer cId;
	private String cName;
	private String qualification;
	private Float expeience;
	private Date onboardingDate;
	private String Skills;

	@JsonIgnoreProperties
	private Integer eId;

	@JsonIgnoreProperties
	private String position;
	@JsonIgnoreProperties
	private Date date;
	private List<ExamDto> examDto;

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public Float getExpeience() {
		return expeience;
	}

	public void setExpeience(Float expeience) {
		this.expeience = expeience;
	}

	public Date getOnboardingDate() {
		return onboardingDate;
	}

	public void setOnboardingDate(Date onboardingDate) {
		this.onboardingDate = onboardingDate;
	}

	public String getSkills() {
		return Skills;
	}

	public void setSkills(String skills) {
		Skills = skills;
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

	public List<ExamDto> getExamDto() {
		return examDto;
	}

	public void setExamDto(List<ExamDto> examDto) {
		this.examDto = examDto;
	}

	@Override
	public String toString() {
		return "CandidateDto [cId=" + cId + ", cName=" + cName + ", qualification=" + qualification + ", expeience="
				+ expeience + ", onboardingDate=" + onboardingDate + ", Skills=" + Skills + ", eId=" + eId
				+ ", position=" + position + ", date=" + date + "]";
	}

}
