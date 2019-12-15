package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Candidate;

public interface RegistrationDao extends JpaRepository<Candidate, Integer>{



}
