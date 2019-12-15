package com.example.demo.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Candidate {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "c_id")
	private Integer cId;
	@Column(name = "c_name")
	private String cName;
	@Column(name = "c_qual")
	private String qualification;
	@Column(name = "c_experience")
	private Float expeience;
	@Column(name = "c_onboarding_date")
	private Date onboardingDate;
	@Column(name = "c_skills")
	private String Skills;

	@OneToMany(mappedBy = "candidate")
	private List<Exams> exams;

	

	public Integer getcId() {
		return cId;
	}

	public void setcId(Integer cId) {
		this.cId = cId;
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

	@Override
	public String toString() {
		return "Exams [cId=" + cId + ", cName=" + cName + ", qualification=" + qualification + ", expeience="
				+ expeience + ", onboardingDate=" + onboardingDate + ", Skills=" + Skills + "]";
	}

}
