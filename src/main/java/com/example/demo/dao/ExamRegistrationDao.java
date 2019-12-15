package com.example.demo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Exams;

public interface ExamRegistrationDao  extends JpaRepository<Exams, Integer>{

	List<Exams> findByCustId(int cid);

}
